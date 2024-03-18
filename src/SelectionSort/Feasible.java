import java.util.List;

public class Feasible {
    private List<List<Items>> feasibleList;
    private List<Double> feasibleWeights;
    private List<Double> feasibleValues;
    
    public Feasible(){

    }
    
    public Feasible(List<List<Items>> feasibleList, List<Double> feasibleWeights, List<Double> feasibleValues) {
        this.feasibleList = feasibleList;
        this.feasibleWeights = feasibleWeights;
        this.feasibleValues = feasibleValues;
    }
    public List<List<Items>> getFeasibleList() {
        return feasibleList;
    }
    public void setFeasibleList(List<List<Items>> feasibleList) {
        this.feasibleList = feasibleList;
    }
    public List<Double> getFeasibleWeights() {
        return feasibleWeights;
    }
    public void setFeasibleWeights(List<Double> feasibleWeights) {
        this.feasibleWeights = feasibleWeights;
    }
    public List<Double> getFeasibleValues() {
        return feasibleValues;
    }
    public void setFeasibleValues(List<Double> feasibleValues) {
        this.feasibleValues = feasibleValues;
    }

}

    

