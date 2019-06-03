import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        boolean isPrime =false;
        int count =0;
        int N =2;
        while (count < number){
            if (N == 2|N==3) System.out.println(N);
            for (int i=2;i<=Math.sqrt(N);i++){
                if ( N % i == 0) {
                    isPrime =false;
                    break;
                }
                else isPrime = true;
            }
            if (isPrime)
                System.out.println(N);
            count++;
            N++;
        }
    }
}
