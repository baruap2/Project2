package package1;

import java.util.Scanner;

public class CF {
    public static void main(String[] args) {

        Scanner convert = new Scanner(System.in);

        System.out.println("------------------Welcome-----------------");
        System.out.println("---Celcius-Fahrenheit/Fahrenheit-Celcius converter---");
        System.out.println("................");
        System.out.println("Choose the conversion mode #:");
        System.out.println("1-Celcius-Fahrenheit");
        System.out.println("2-Fahrenheit-Celcius");


        int number = convert.nextInt();
        System.out.println("you chose this number: " + number);
        System.out.println("Enter the temperature to convert");

        int temp = convert.nextInt();
        if (number == 1) {
            System.out.println("The temperature in Fahrenheit is: " + ((temp * 9 / 5) + 32));
        }else if (number ==2) {
            System.out.println("The temperature in Celsius is: "+ ((temp -32)*5/9));
        }else{
            System.out.println("Not applicable, start over.");
        }



    }
}
