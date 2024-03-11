package src.Knapsack;

import java.util.ArrayList;
import java.util.List;

import src.SelectionSort.SelectionSort;

public class Operations {

    public void setItemArray(Items[] itemArray) {
        this.itemArray = itemArray;
    }

    private Items[] itemArray;

    public void setSubsetList(List<List<Items>> subsetList) {
        this.subsetList = subsetList;
    }

    private List<List<Items>> subsetList;
    private double totalWeight;
    private double totalValue;

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public Items[] getItemArray() {
        return itemArray;
    }

    public List<List<Items>> getSubsetList() {
        return subsetList;
    }


    public Operations() {
        Items cannedGoods = new Items();
        cannedGoods.setProductName("Canned Goods");
        cannedGoods.setWeight(5);
        cannedGoods.setValue(450);

        Items cookingOil = new Items();
        cookingOil.setProductName("Cooking Oil");
        cookingOil.setWeight(3);
        cookingOil.setValue(725);

        Items noodles = new Items();
        noodles.setProductName("Noodles");
        noodles.setWeight(2.5);
        noodles.setValue(375);

        Items soap = new Items();
        soap.setProductName("Soap");
        soap.setWeight(7);
        soap.setValue(500);

        setItemArray(new Items[]{cannedGoods, cookingOil, noodles, soap});
        setSubsetList(generateOutcomes(itemArray));
    }

    private static List<List<Items>> generateOutcomes(Items[] item) {
        List<List<Items>> outcomes = new ArrayList<>();
        arrangeOutcomes(item, 0, new ArrayList<>(), outcomes);
        return outcomes;
    }

    //arrangement of elements per subset
    private static void arrangeOutcomes(Items[] set, int index, List<Items> current, List<List<Items>> outcomes) {
        outcomes.add(new ArrayList<>(current));
        for (int i = index; i < set.length; i++) {
            current.add(set[i]);
            arrangeOutcomes(set, i + 1, current, outcomes);
            current.remove(current.size() - 1);
        }
    }

    public static String printProductName(List<Items> outcome) {
        double total = 0;
        int n = 0;
        StringBuilder builder = new StringBuilder();
        for (Items i : outcome) {
            builder.append(i.getProductName());
            if (n < outcome.size() - 1) {
                builder.append(", ");
            }
            n++;
        }
        return builder.toString();
    }

    public static String printValue(List<Items> outcome) {
        double total = 0;
        int n = 0;
        StringBuilder builder = new StringBuilder();
        for (Items i : outcome) {
            builder.append(i.getValue());
            if (n < outcome.size() - 1) {
                builder.append(" + ");
            }
            n++;
        }

        builder.append(" = ");
        builder.append(computeValue(outcome));
        return builder.toString();
    }

    public static double computeValue(List<Items> outcome) {
        double total = 0;
        for (Items i : outcome) {
            total = total + i.getValue();
        }
        return total;
    }

    public static String printWeight(List<Items> outcome) {
        int n = 0;
        StringBuilder builder = new StringBuilder();
        for (Items i : outcome) {
            builder.append(i.getWeight());
            if (n < outcome.size() - 1) {
                builder.append(" + ");
            }
            n++;
        }

        builder.append(" = ");
        builder.append(computeWeight(outcome));
        return builder.toString();
    }

    public static double computeWeight(List<Items> outcome) {
        double total = 0;
        for (Items i : outcome) {
            total = total + i.getWeight();
        }
        return total;
    }

    public void printAll(List<List<Items>> outcome) {
        System.out.printf("%n%-55s%-40s%-30s%n", "ITEM/S", "WEIGHTS", "VALUES");
        int n = 0;
        for (List<Items> i : outcome) {
            System.out.printf("%2d%s%-50s", n + 1, ".) ", printProductName(i));
            System.out.printf("%-40s", printWeight(i));
            System.out.printf("%-30s%n", printValue(i));
        }
    }

    public void printFeasible(int cart) {
        
        List<Double> w = new ArrayList<>();
        List<Double> v = new ArrayList<>();
        List<List<Items>> l = new ArrayList<>();
        
        System.out.printf("%n%-55s%-40s%-30s%n", "ITEM/S", "WEIGHTS", "VALUES");
        int n = 0;
        int c = 0;
        for (List<Items> i : getSubsetList()) {
            double weightTotal = computeWeight(i);
            if (weightTotal <= cart && weightTotal != 0) {
                System.out.printf("%2d%s%-50s", n + 1, ".) ", printProductName(i));
                System.out.printf("%-40s", printWeight(i));
                System.out.printf("%-30s%n", printValue(i));
                n++;
                c++;

                w.add(computeWeight(i));
                v.add(computeValue(i));
                l.add(getSubsetList().get(n));
            }
        }
        
        setFeasibleList(l);
        setWTotal(w);
        setVTotal(v);


        if (c==0){
            System.out.printf("%-55s%n", "No items are feasible");
        }

        else {
            printBestValue(cart);
        }
    }

    public void printChoices() {
        System.out.printf("%-25s%-10s%-5s%n", "ITEM/S", "WEIGHTS", "VALUES");
        int n = 0;
        for (Items i : getItemArray()) {
            System.out.printf("%2d%s%-20s", n + 1, ".) ", i.getProductName());
            System.out.printf("%-20s", i.getWeight());
            System.out.printf("%-5s%n", i.getValue());
        }
    }
    private List<List<Items>> feasibleList;

    public List<List<Items>> getFeasibleList() {
        return feasibleList;
    }

    public void setFeasibleList(List<List<Items>> feasibleList) {
        this.feasibleList = feasibleList;
    }

    private List<Double> WTotal;

    public List<Double> getWTotal() {
        return WTotal;
    }

    public void setWTotal(List<Double> WTotal) {
        this.WTotal = WTotal;
    }

    public List<Double> getVTotal() {
        return VTotal;
    }

    public void setVTotal(List<Double> VTotal) {
        this.VTotal = VTotal;
    }

    private List<Double> VTotal;

    public double bestValue(int cart) {
        double best = getVTotal().get(0);
        for (int i=1; i<getVTotal().size(); i++) {
            if (getVTotal().get(i)>best){
                best = getVTotal().get(i);
            }
        }
        return best;
    }

    public void printBestValue(int cart){

        System.out.print("\nBEST VALUE FOR YOU:");
        System.out.printf("%n%-55s%-40s%-30s%n", "ITEM/S", "WEIGHTS", "VALUES");
        int n = 0;
        for (List<Items> i : getSubsetList()) {
            double feasibleWeights = computeWeight(i);
            if (feasibleWeights <= cart && feasibleWeights != 0) {
                if (computeValue(i) == bestValue(cart)) {
                    System.out.printf("%2d%s%-50s", n + 1, ".) ", printProductName(i));
                    System.out.printf("%-40s", printWeight(i));
                    System.out.printf("%-30s%n", printValue(i));
                }
            }
        }
    }

    public void printSort(){
        SelectionSort s = new SelectionSort();
        s.selectionSortByWV(getWTotal());
        System.out.println(getWTotal());
    }
}

