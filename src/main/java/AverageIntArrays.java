public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int sum = 0;
        for (int i : aa) {
            sum += i;
        }
        return sum;
    }

    public int average(int[] aa) {
        int average = 0;
        for (int i : aa) {
            average += i;
        }
        if (aa.length==0) {
            return average;
        }
        return average/aa.length;
    }
}
