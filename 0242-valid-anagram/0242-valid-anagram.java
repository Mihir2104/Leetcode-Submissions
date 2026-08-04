class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int freq[] = new int [26];

        for(int i = 0 ; i < s.length(); i++ ){

            int first = s.charAt(i) - 'a';
            int second = t.charAt(i) - 'a';

            freq[first]++;
            freq[second]--;
        }

        for(int i =0; i < 26 ; i++){
            if(freq[i]!= 0){
                return false;
            }
        }
        
        return true;
    }
}