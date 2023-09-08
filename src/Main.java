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
    }
}