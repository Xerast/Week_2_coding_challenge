public class LCM {



        public static void main (String[]args){

            int a[] = {5, 4, 6, 46, 54, 12, 13, 17};

            int b[] = {46, 54, 466, 544};

            int c[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int d[] = {13, 6, 17, 18, 19, 20, 37};

            int[][] result = {a, b, c, d};
            int solution[] = {0, 0, 0, 0};

            for (int i = 0; i < 4; i++) {

                solution[i] = findLCM(result[i]);
                System.out.println(solution[i]);
            }


        }

        public static int findLCM ( int array[]){
            int lcm = array[0];
            int gcd = array[0];

            //loop through the array to find GCD
            //use GCD to find the LCM
            for (int i = 1; i < array.length; i++) {
                gcd = findGCD(array[i], lcm);
                lcm = (lcm * array[i]) / gcd;
            }

            //output the LCM
            return lcm;
        }


        //recursive function to find GCD of two numbers
        public static int findGCD ( int a, int b){
            //base condition
            if (b == 0)
                return a;

            return findGCD(b, a % b);
        }

}






