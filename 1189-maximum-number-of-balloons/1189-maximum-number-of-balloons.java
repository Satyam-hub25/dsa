class Solution {
    public int maxNumberOfBalloons(String text) {
        int count = 0;
        String s = "balloon";
        while(true) {
            for(int i = 0; i < s.length(); i++) {
                int x = text.indexOf(s.charAt(i));
                if(x == -1)
                    return count;

                text = text.substring(0, x) + text.substring(x + 1);
            }
            count++;
        }
    }
}