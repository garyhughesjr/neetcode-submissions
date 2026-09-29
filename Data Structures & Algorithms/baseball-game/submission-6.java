class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("C")) {
                record.remove(record.size() - 1);
            } else if (operations[i].equals("D")) {
                record.add(record.get(record.size() - 1) * 2); 
            } else if (operations[i].equals("+")) {
                record.add(record.get(record.size() - 1) + record.get(record.size() - 2));
            } else {
                record.add(Integer.parseInt(operations[i]));
            }
        }

        int total = 0;
        for (int score : record) {
            total += score; 
        }

        return total; 
    }
}