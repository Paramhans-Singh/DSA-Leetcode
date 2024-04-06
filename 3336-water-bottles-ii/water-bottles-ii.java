class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty = 0;
        int temp = numBottles;
        int partBottle = 0;

        while(numBottles != 0){
        empty += numBottles;
        numBottles = 0;

        while(numExchange<=empty){
        empty -= numExchange;
        numExchange++;
        numBottles++;
        }
        partBottle += numBottles; 
        }

        return temp + partBottle;
    }
}