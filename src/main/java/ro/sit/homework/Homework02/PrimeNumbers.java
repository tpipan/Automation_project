package ro.sit.homework.Homework02;

import java.text.Format;

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int i = 0; i < 1000000; i++) {

            checkPrime(i);
        }

    }

    static void checkPrime(int n){
        int jumatate = n / 2;
        Boolean isPrime = true;

        if ( n != 0 || n != 1 ){
            for ( int i = 2; i <= jumatate; i++) {
                if (n % i == 0 ) {
                    isPrime = false;
                }
            }
        }

        if (isPrime) {
            System.out.println(n);
        }
    }
}