// Last updated: 7/9/2026, 3:11:22 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            if(i>0){
                List<Integer> prev=result.get(i-1);
                int left=0;
                int right=1;
                while(right<prev.size()){
                    row.add(prev.get(left++)+prev.get(right++));
                } 
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}