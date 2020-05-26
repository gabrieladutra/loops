package src;

import org.junit.Test;

import java.util.Scanner;

public class ForTest {
    @Test
    public void getTriangles() {
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void isIntervals(){
        int in = 0, out = 0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Numbers?");
        int stop = sc.nextInt();
        for (int i = 0; i <= stop; i ++){
            System.out.println("Number");
            int number = sc.nextInt();
            if (number >= 10 && number < 20){
                in++;
            }
            out ++;
        }
        System.out.println(in + "in");
        System.out.println(in + "out");
    }


}

