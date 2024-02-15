import java.util.Scanner; //importing Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean going = true; //defining variable going

        Scanner in = new Scanner(System.in); //naming new Scanner

        do {
            System.out.println("What is the temperature outside? (In Celsius)"); //Asking user for temp in Celsius
            if (in.hasNextDouble()) { //checking if user entered valid input
                double temp = in.nextDouble(); //making variable from user input

                double fahrenheit = (temp * ((double) 9 / 5)) + 32; //calculating fahrenheit

                if (fahrenheit > 212) {
                    System.out.println("Woah! You have a boiling hot temperature of " + fahrenheit + "℉"); //telling user they entered hot temp

                    going = false; //stops loop
                } else if (fahrenheit < 32) {
                    System.out.println("Woah ! You have freezing temperatures of " + fahrenheit + "℉"); //telling user they entered freezing temp

                    going = false; //stops loop
                } else {
                    System.out.println("The temperature is " + fahrenheit + "℉"); //normal temp

                    going = false; //stops loop
                }
            } else if (!in.hasNextDouble()) { //user entered wrong input

                String bad = in.nextLine(); //new variable for wrong input

                System.out.println(bad + " is not a valid temperature"); //telling user it is a wrong input
            }
        }
            while(going); //loop is running while variable going = true
    }
}
