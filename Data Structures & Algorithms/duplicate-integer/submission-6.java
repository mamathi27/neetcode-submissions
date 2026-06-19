class Solution {
    public boolean hasDuplicate(int[] arr) {
        // HashMap<Integer,Integer> m = new HashMap<>();
        // for(int i:arr){
        //     m.put(i,m.getOrDefault(i,0)+1);
        // }
        
        // for(int i:m.values()){
        //     if(i>1)
        //     return true;
        // }
        // return false;
        

        HashSet<Integer> s = new HashSet<>(arr.length);
        for(int i:arr){
            if(!s.add(i))
            return true;

        }
        return false;
    }
}