package datastructure;

import com.sun.scenario.effect.impl.sw.java.JSWEffectPeer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //datatype - non-primitive
        int myNumbers[] = {5, 3, 8, 6, 6, 8};
        System.out.println(myNumbers[2]);

        for (int i = 0; i < 6; i++) {
            System.out.println(myNumbers[i]);
        }

        int[] myNumbers2 = new int[5];
        //assign array values
        myNumbers2[0] = 2;
        myNumbers2[1] = 6;
        myNumbers2[2] = 4;
        myNumbers2[3] = 1;
        myNumbers2[4] = 2;


       // System.out.println(myNumbers2[2]);
        for (int i = 0; i < myNumbers2.length; i++) { // method.length ensures you don't need guesswork for how many numbers there are
            System.out.println(myNumbers2[i]);
        }
        System.out.println("-------------------------");

        int list[]= new int [3];
        System.out.println("please enter some number");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i< list.length; i++){
            list[i]= sc.nextInt();

            int list2[] = new int [10];
            System.out.println("please enter some number");
            Random random = new Random();
            for (int  x=0; x< list2.length; x++);
            int x = 0;
            list[x] = random.nextInt(10);
            System.out.println(list2[x]);
        }
    }
    //declare arrayList
//    List<String> namesList = new ArrayList<>();
//
//    public List<String> getNamesList() {
////        namesList.add("milon");
//        namesList.add(3, "Jeff");


    }

