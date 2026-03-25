class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;

        while(numBottles >= numExchange){
            int newBottle = numBottles / numExchange;

            int remBottle = numBottles % numExchange;

            count = count + newBottle;

            numBottles = newBottle + remBottle;
        }

        return count;
    }
};