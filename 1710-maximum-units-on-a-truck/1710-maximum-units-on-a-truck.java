class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int total_unit=0;
        for(int i=0; i<boxTypes.length; i++){
           int box=boxTypes[i][0];
           int unit=boxTypes[i][1];
           if(box<=truckSize){
            total_unit+=box*unit;
            truckSize -=box;
           }else{
                 total_unit +=truckSize*unit;
                 break;
           }
        }
        return total_unit;
    }
}