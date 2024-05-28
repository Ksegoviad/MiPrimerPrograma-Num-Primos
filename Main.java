import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Find the #n prime");
        Scanner prime = new Scanner(System.in);
        int numPrimes = prime.nextInt();
        int firstPrime = 2;
        int i= 1;
        do {
            int sum= 0;
            do {
                if (firstPrime % i == 0) {
                    sum=sum+1;
                }
                i++;
            } while (i > firstPrime);

            if (sum < 3){
             System.out.println(firstPrime);
            }
            firstPrime++;
        } while (i > numPrimes);

    }
}