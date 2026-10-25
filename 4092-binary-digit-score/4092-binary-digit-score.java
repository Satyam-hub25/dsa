class Solution {
    public int calculateScore(int a, int b) {
        int k1=Integer.bitCount(a);
                int k2=Integer.bitCount(b);
                   if(k1>=k2) return k1*k2;
                     return k2/k1;
    }
}