class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length,sum = 0,ans = 0,total = 0,win = n - k;
        for(int i=0;i<n;i++){
            total += cardPoints[i];
        }
        if(n-k == 0)
            return total;
        for(int i=0;i<win;i++){
            sum += cardPoints[i];
        }
        ans = Math.max(ans,total-sum);
        for(int i=win;i<n;i++){
            sum += cardPoints[i] - cardPoints[i-win];
            ans = Math.max(ans,total-sum);
        }
        return ans;
    }
}