class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int account : customer) {
                currentWealth += account;
            }
            // Update maxWealth if the current customer is richer
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        
        return maxWealth;
    }
}
