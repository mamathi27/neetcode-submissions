class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length())
        // return false;
        // char [] a = s.toCharArray();
        // char[] b = t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        
        // for(int i=0;i<a.length;i++){
        //     if(a[i]!=b[i])
        //     return false;
        // }
        // return true;

        if(s.length()!=t.length())
        return false;
        int[] countchar = new int [26];
        for(int i=0;i<s.length();i++){
            countchar[s.charAt(i)-'a']++;
            countchar[t.charAt(i)-'a']--;
        }
        for(int count : countchar){
            if(count!=0)
            return false;
        }
        return true;
    }
}
