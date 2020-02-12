import java.util.Scanner;
class Easiest {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in); 
    boolean cont = true;
      while (cont){
        int N = inp.nextInt();    // 3029
        if (N == 0) {cont = false; break;}
        int sumN = splitSum(N);   // 14
        int p = 0;
        int i = 11;
        
          while (p == 0){
            int sumi = splitSum(i * N);
            if (sumi == sumN){
              
            
              p = i;
            }
            i++;
          }
          System.out.println(p);
        }
    }



  public static int splitSum(int N) {
    int sum = 0;
    while (N > 0) { 
      int a = N % 10;
      N /= 10; 
      sum += a; 
    }
    return sum;
  }
}