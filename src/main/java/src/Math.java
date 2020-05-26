
package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Math {
    public static void getQuadrant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("X point");
        int x = sc.nextInt();
        System.out.println("Y point");
        int y = sc.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("First");
            } else if (x < 0 && y > 0) {
                System.out.println("Second");
            } else if (x < 0 && y < 0) {
                System.out.println("Third");
            } else if (x > 0 && y < 0) {
                System.out.println("Fourth");
            }
            System.out.println("X point");
            x = sc.nextInt();
            System.out.println("Y point");
            y = sc.nextInt();
        }

    }

    public static void getPreferences() {
        Scanner sc = new Scanner(System.in);
        int alcohol = 0, gas = 0, diesel = 0;
        System.out.println("1- Alcohol\n 2-Gas \n 3- Diesel \n 4- End");
        int fuel = sc.nextInt();
        while (fuel != 4) {
            if (fuel == 1) {
                alcohol++;
            } else if (fuel == 2) {
                gas++;
            } else if (fuel == 3) {
                diesel++;
            }
            System.out.println("1- Alcohol\n 2-Gas \n 3- Diesel \n 4- End");
            fuel = sc.nextInt();
        }
        System.out.println("Muito obrigado");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gas: " + gas);
        System.out.println("Diesel: " + diesel);


    }

    public static void guessPassword() {
        System.out.println("Guess the password:");
        int password = 2002;
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        while (password != guess) {
            System.out.println("Invalid password");
            System.out.println("Guess the password:");
            guess = sc.nextInt();
        }
        System.out.println("Allowed access");
        sc.close();
    }

    public static void count() {
        int number = 8;
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }

    public static void isIntervals() {
        int in = 0, out = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How much numbers");
        int stop = sc.nextInt();
        for (int i = 0; i < stop; i++) {
            System.out.println("Number: ");
            int number = sc.nextInt();
            if (number >= 10 && number < 20) {
                in++;
            } else
                out++;
        }
        System.out.println(in + "in");
        System.out.println(out + "out");

    }

    public static void getAvg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much numbers");
        int stop = sc.nextInt();
        for (int i = 0; i < stop; i++) {
            System.out.println("a");
            double a = sc.nextDouble();
            System.out.println("b");
            double b = sc.nextDouble();
            System.out.println("c");
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10;
            System.out.println(media);
        }

    }

    public static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lines:");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            int square = (int) java.lang.Math.pow(i, 2);
            int cube = (int) java.lang.Math.pow(i, 3);
            System.out.println(i + " " + square + " " + cube);
        }

    }

    public static void divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lines:");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("a:");
            int a = sc.nextInt();
            System.out.println("b:");
            int b = sc.nextInt();
            float division = (float) a / b;
            if (a < 0) {
                System.out.println("Impossible division");
            }
            System.out.println(division);
        }
        sc.close();
    }

    public static void getDivisor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }

        }

    }

    public static void getPlaces(ArrayList<String> places) {
        for (String place : places) {
            System.out.println(place);

        }
    }

    public static void getGassSum() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public static void getMultiplication() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((j * i) + " ");
            }
            System.out.println();
        }
    }

    public static void getPow() {
        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int pow = (int) java.lang.Math.pow(i, j);
                System.out.print(pow + " ");
            }
            System.out.println();
        }
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial of:");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }

    public static void formTriangles() {
        for (int i = 10; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void doGauss() {
        int result = 0;
        int i = 0;
        do {
            result += i;
            i++;
        }
        while (i <= 100);
        System.out.println(result);
    }

    public static void whileGauss() {
        int result = 0;
        int i = 0;
        while (i <= 100) {
            result += i;
            i++;
        }
        System.out.println(result);
    }

    public static void forTest() {
        int[] grades = new int[3];
        grades[0] = 10;
        grades[1] = 9;
        grades[2] = 10;

        // Initialization can be inside or outside the loop
        int i;
        for (i = 0; i < grades.length; i++) {
            //Condition is a relational expression
            // First statements then increment;
            System.out.println(grades[i]);
        }
        System.out.println(Arrays.toString(grades));
    }

    public static void testWhile() {
        int result = 1;
        int i = 0;
        // Initialization always outside the loop
        while (i <= 10) {
            // entry controlled loop
            //Complex initialization
            // Increment can be before or after execution of statements
            i++;
            result *= i;
            System.out.println(result);
        }
    }

    public static int getFactorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }

    public static void getFibonacci(int num, int i, int f1, int f2) {
        if (i == num) {
            return;
        } else if (i == 1) {
            System.out.print(f2 + " ");
            getFibonacci(num, i + 1, f2, f1 + f2);
            System.out.print(f1 + " " + f2 + " ");
            getFibonacci(num, i + 1, f2, f1 + f2);
        } else {

            System.out.println(f2 + " ");
            getFibonacci(num, i + 1, f2, f1 + f2);
        }
    }

    public static int getSomatory(int n) {
        if (n == 0) {
            return 0;
        }
        return getSomatory(n - 1) + n;
    }

    public static int impFibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return impFibonacci(n - 1) + impFibonacci(n - 2);
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static long fibonacciRecursive(int n) {
        return fibonacciRecursiveCache(new long[java.lang.Math.toIntExact(n + 1)], n);
    }

    public static long fibonacciRecursiveCache(long[] cache, int n) {
        if (n <= 1) {
            return 1;
        }
        if (cache[n] == 0) {
            cache[n] = fibonacciRecursiveCache(cache, n - 1) + fibonacciRecursiveCache(cache, n - 2);
        }
        return cache[n];
    }

    public static int powerOf10(int n) {
        if (n == 0) {
            return 1;
        }
        return powerOf10(n - 1) * 10;
    }

    public static String toBinary(int n) {
        if (n <= 1) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + String.valueOf(n % 2);
    }

    public static int tailSum(int currentSum, int n) {
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(tailSum(1, 75));
        System.out.println(toBinary(2018));
       System.out.println(powerOf10(3));
        for (int i = 0; i <= 10; i++) {

            System.out.println(impFibonacci(i));

        }
        System.out.println(fibo(6));
        System.out.println(impFibonacci(5));
        System.out.println(getSomatory(4));
        getFibonacci(10, 1, 1, 1);
        ArrayList<String> travel = new ArrayList<>();
        travel.add("California");
        travel.add("Barcelona");
        travel.add("Amsterdam");


        whileGauss();
        getGassSum();
        doGauss();
        formTriangles();
        factorial();
        getPow();
        getMultiplication();
        getPlaces(travel);
        getDivisor();
        divide();
        power();
        getAvg();
        isIntervals();
        count();
        getQuadrant();
        getPreferences();
        guessPassword();
    }

}


