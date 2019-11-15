public class ChallengeOne {
    public static int[] odds(int numOdds) {
        /**
         * Return an array of the first numOdds odd numbers
         * Arguments
         * numOdds - a positive integer representing the number of odd numbers to store in the array
         * Examples
         * odds(3) returns [1, 3, 5]
         * odds(5) returns [1, 3, 5, 7, 9]
        */

        // ====================================
        // Do not change the code before this
    
        // CODE1: Write code that will create an array with the first numOdds
        //        odd numbers and return the array
        
    
        // ====================================
        // Do not change the code after this
    }

    public static void main(String[] args) {
        firstThreeOdds = odds(3);
        // Expected output is 
        // 1, 3, 5
        System.out.println(String.join(", ", firstThreeOdds));

        firstFiveOdds = odds(5);
        // Expected output is 
        // 1, 3, 5, 7, 9
        System.out.println(String.join(", ", firstFiveOdds));
    }
}