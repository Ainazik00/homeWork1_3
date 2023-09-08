import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] nums = {1.3, 4.5, -5.6, -6.2, 22.3, 4.9, -1.7, 14.3, 5.9, -45.9, 3.3, -6.1, 5.3, -1.2, -57,9 };
        int b = 0;
        double a = 0;
        boolean c = false;

        for (double n : nums){
          if(n < 0){
              c = true;
          }else if(c && n > 0){
                  b++;
                  a+=n;
          }
        }
        System.out.println(a/b);

        int[] numbers = {8,6,4,2,-3,-5,-9};
        for (int i = 0; i < numbers.length; i++) {
         int min = numbers [i];
         int minid = i;
            for (int j = i+1; j < numbers.length ; j++) {
                if (numbers[j]<min){
                    min=numbers [j];
                    minid = j;
                }
            }
            int scc = numbers [i];
            numbers [i] = min ;
            numbers [minid] = scc;
            System.out.println(Arrays.toString(numbers));
        }
    }
}

