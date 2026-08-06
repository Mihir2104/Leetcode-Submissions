class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n = cardPoints.length;
      int sum = 0;
      int maxscore = 0;

      for(int i =0 ; i < k; i++ ){
        sum = sum + cardPoints[i];
      }     

      maxscore = sum;
      
      for(int i = 1; i < k + 1 ; i++){
        sum = sum - cardPoints[k - i];
        sum = sum + cardPoints[n - i];
        maxscore = Math.max( maxscore , sum );
      }

        return maxscore;
    }
}