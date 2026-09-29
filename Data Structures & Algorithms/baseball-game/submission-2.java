class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        int total = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                int removed = record.remove(record.size() - 1);
                total -= removed;
            } else if (op.equals("D")) {
                int doubled = record.get(record.size() - 1) * 2;
                record.add(doubled);
                total += doubled;
            } else if (op.equals("+")) {
                int newScore = record.get(record.size() - 1) + record.get(record.size() - 2);
                record.add(newScore);
                total += newScore;
            } else {
                int value = Integer.parseInt(op);
                record.add(value);
                total += value;
            }
        }

        return total;
    }
}