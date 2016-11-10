package ca.mbg.demo.devoxx2016;

/**
 * @author Marius Bogoevici
 */
public class AverageData {

    private int id;

    private double average;

    public AverageData(int id, double average) {
        this.id = id;
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
