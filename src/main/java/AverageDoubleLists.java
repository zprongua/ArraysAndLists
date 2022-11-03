import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {
        return (double) aa.size();
    }
    public Double sum(ArrayList<Double> aa) {
        Double sum = 0.0;
        for (Double d : aa) {
            sum += d;
        }
        return sum;
    }
    public Double average(ArrayList<Double> aa) {
        Double average = 0.0;
        for (Double d : aa) {
            average += d;
        }
        return average/aa.size();
    }

}
