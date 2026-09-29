class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        int ops = operations.length;
        int i = 0;

        while (i < ops) {
            if (operations[i].equals("C")) {
                record.remove(record.size() - 1);
            } else if (operations[i].equals("D")) {
                int doubled = record.get(record.size() - 1) * 2;
                record.add(doubled);
            } else if (operations[i].equals("+")) {
                int newScore = record.get(record.size() - 1) + record.get(record.size() - 2);
                record.add(newScore);
            } else {
                record.add(Integer.parseInt(operations[i]));
            }
            i++;
        }

        int total = 0;
        for (int score : record) {
            total += score;
        }

        return total;
    }
}