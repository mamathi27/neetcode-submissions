class Solution {
    public int[] twoSum(int[] arr, int target) {
        // for(int i=0;i<arr.length;i++){
        //     for(int j =i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target)
        //         return new int[]{i,j};
        //     }
        // }
        // return new int[] {-1,-1};

        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp = target - arr[i];
            if(m.containsKey(comp))
            return new int[]{m.get(comp),i};

            m.put(arr[i],i);
        }
        return new int[]{};

    }
}
