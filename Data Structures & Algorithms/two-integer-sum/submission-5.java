class Solution {
    public int[] twoSum(int[] arr, int target) {
        // for(int i=0;i<arr.length;i++){
        //     for(int j =i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target)
        //         return new int[]{i,j};
        //     }
        // }
        // return new int[] {-1,-1};

        // HashMap<Integer,Integer> m = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     int comp = target - arr[i];
        //     if(m.containsKey(comp))
        //     return new int[]{m.get(comp),i};

        //     m.put(arr[i],i);
        // }
        // return new int[]{};
        
        int left =0;
        int right = arr.length-1;
        int[][] arr1 = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            arr1[i][0]=arr[i];
            arr1[i][1]=i;
        }
        Arrays.sort(arr1,(a,b)->a[0]-b[0]);
        
        while(left<right){
            int sum = arr1[left][0]+arr1[right][0];
            if(sum==target){
            int[] arr2 =  new int[]{arr1[left][1],arr1[right][1]};
           Arrays.sort(arr2);
        return arr2; 
            }
            else if(sum < target){
                left ++;
            }
            else {
                right--;
            }
            
        }
        return new int[]{-1,-1};

    }
}
