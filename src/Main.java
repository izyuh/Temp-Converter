import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        double result;

        System.out.println("""
                  Please enter the format you wish to convert from.\s
                \s
                 Enter '1' to go from Fahrenheit to Celsius \nor '2' to go from Celsius to Fahrenheit.""");

        String convert = scanner.next();



        while (true) {
            if (convert.equals("1")) {
                System.out.println("Enter the temperature you wish to convert.");
                break;
            } else if (convert.equals("2")) {
                System.out.println("Enter the temperature you wish to convert.");
                break;
            } else {
                System.out.println("Please enter a valid selection.");
                convert = scanner.next();
                continue;
            }
        }



        while(true){

            String check;

            if(scanner.hasNextInt()){
                temp = scanner.nextInt();
                break;

            }else{
                System.out.println("Please enter a valid number.");
                check = scanner.next();
                continue;
            }
        }





        switch (convert) {
            case "1":
                result = (temp - 32) * ((double) 5 / 9);

                System.out.println("Your converted temperature equates to " + result + " degrees Celsius.");
                break;

            case "2":
                result = (temp * ((double) 9 / 5)) + 32;

                System.out.println("Your converted temperature equates to " + result + " degrees Fahrenheit.");
                break;
        }

    }
}
