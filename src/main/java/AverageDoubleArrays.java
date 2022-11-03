public class AverageDoubleArrays {


// Complete these methods

    public double count(double[] aa) {
        return aa.length;
    }

    public double sum(double[] aa) {
        double sum = 0;
        for (double d : aa) {
            sum += d;
        }
        return sum;
    }

    public double average(double[] aa) {
        double average = 0;
        for (double d : aa) {
            average += d;
        }
        return average/aa.length;
    }

}
