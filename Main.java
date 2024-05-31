import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Find the #n prime");

        int numPrimes = leer.nextInt();

        int firstPrime = 2;

        do {
            int i= 1;
            int sum= 0;
            do {
                if (firstPrime % i == 0) {
                    sum=sum+1;

                }
                i++;
            } while (i <= firstPrime);

            if (sum < 3){
                System.out.println(firstPrime);
                numPrimes=numPrimes - 1;
            }
            firstPrime++;
        } while (numPrimes > 0);
    }
}