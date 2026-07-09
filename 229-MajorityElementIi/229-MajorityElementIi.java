// Last updated: 7/9/2026, 3:10:13 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> listname=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer>ds=new HashMap<>();
        for(int i=0;i<n;i++){
            ds.put(nums[i],ds.getOrDefault(nums[i],0)+1);
        }
        int m=n/3;
        for(Map.Entry<Integer,Integer> en:ds.entrySet()){
            if(en.getValue()>m){
                listname.add(en.getKey());
            }
        }
        return listname;

    }
}