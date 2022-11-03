import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        return aa.size();
    }

    public int sum(ArrayList<Integer> aa) {
        int sum = 0;
        for (int i : aa) {
            sum += i;
        }
        return sum;
    }

    public int average(ArrayList<Integer> aa) {
        int average = 0;
        for (int i : aa) {
            average += i;
        }
        if (aa.size()==0) {
            return average;
        }
        return average/aa.size();
    }
}
