class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());   // empty subset
        for (int num : nums) {
             int size=list.size();
            for (int j = 0; j < size; j++) {
                List<Integer> temp = new ArrayList<>(list.get(j));
                 temp.add(num);
                list.add(temp);
            }
        }
        return list;
    }
}
