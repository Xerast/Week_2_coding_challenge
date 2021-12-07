import java.util.ArrayList;

public class LS {

    public static void main(String[] args) {



        System.out.println(lookAndSay(new int[]{1,2,1,3,2,0,0,0,1,2,1,7,1,9,7,9}));
        System.out.println(lookAndSay(new int[]{5,4,5,4,4,6,6,6}));
        System.out.println(lookAndSay(new int[]{9,5}));
        System.out.println(lookAndSay(new int[]{1,2,1,3,1,4,1,5,1,6,1,7,1,8,1,9}));
        System.out.println(lookAndSay(new int[]{1,2,0,5,2,0}));
        System.out.println(lookAndSay(new int[]{2, 3, 1}));


    }

    public static ArrayList<Integer> lookAndSay(int[] number) {
        int n = number.length;

        ArrayList<Integer> result = new ArrayList<Integer>();


        if (n % 2 != 0) {
            result.add(-1);
        }
        else {
            for (int i = 0; i < n; i += 2) {
                int count = number[i];
                int num = number[i + 1];
                for (int c = 0; c < count; c++) {
                    result.add(num);

                }

            }
        }
        return result;
    }
}

