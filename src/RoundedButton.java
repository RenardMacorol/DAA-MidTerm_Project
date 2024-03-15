package src;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedButton extends JButton {

    private Color backgroundColor;
    private Color foregroundColor;
    private int cornerRadius;
    private int topMargin;
    private int sideMargin;
    private String fontFamily;
    private int fontSize; // New field to store font size

    public RoundedButton(String text, Color backgroundColor, Color foregroundColor, int cornerRadius, int topMargin, int sideMargin, String fontFamily, int fontSize) {
        super(text);
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.cornerRadius = cornerRadius;
        this.topMargin = topMargin;
        this.sideMargin = sideMargin;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize; // Store font size
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setForeground(foregroundColor);
        // Set font with specified family and size
        setFont(new Font(fontFamily, Font.PLAIN, fontSize)); // Use dynamic font size
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint the background
        g2.setColor(backgroundColor);
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius));

        // Set font
        FontMetrics metrics = g2.getFontMetrics(getFont());
        int x = (getWidth() - metrics.stringWidth(getText())) / 2;
        int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();

        // Draw the text
        g2.setColor(foregroundColor);
        g2.setFont(getFont());
        g2.drawString(getText(), x, y);

        g2.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        int width = size.width + 2 * sideMargin;
        int height = size.height + 2 * topMargin;
        return new Dimension(width, height);
    }
}