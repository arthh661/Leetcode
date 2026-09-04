import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> previous = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> current = new ArrayList<>();

            current.add(1);

            for (int j = 1; j < previous.size(); j++) {
                current.add(previous.get(j - 1) + previous.get(j));
            }

            if (i > 0) {
                current.add(1);
            }

            result.add(current);

            previous = current;
        }

        return result;
    }
}