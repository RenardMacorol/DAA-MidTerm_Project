package com.Project;

import javax.swing.table.DefaultTableModel;


public class NewTable extends DefaultTableModel {

    NewTable() {
       
    }
    
    NewTable(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false; // Disable editing for all cells
    }
}

