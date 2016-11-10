package ca.mbg.demo.devoxx2016;

/**
 * @author Marius Bogoevici
 */
public class Accumulator {

    private int count;

    private int totalValue;

    public Accumulator(int count, int totalValue) {
        this.count = count;
        this.totalValue = totalValue;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }
}
