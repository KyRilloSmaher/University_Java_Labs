package Models;

import java.util.Scanner;;

public class QuestionTwo {
    static void ReadTwoInts(Integer[] numbers) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number :");
        numbers[0] = scan.nextInt();
        System.out.print("Enter Second Number :");
        numbers[1] = scan.nextInt();
    }

    static int Reminder(Integer[] numbers) {
        return numbers[0] % numbers[1];
    }

    static float Quotient(Integer numbers[]) {
        return (float) numbers[0] / numbers[1];
    }

    public static void Dispaly(String args[]) {
        if (args.length != 2) {
            Integer[] numbers = { 0, 0 };
            QuestionTwo.ReadTwoInts(numbers);
            System.out.println("Reminder : " + QuestionTwo.Reminder(numbers));
            System.out.println("Quotient : " + QuestionTwo.Quotient(numbers));
        } else {
            System.out.println("Reminder : " + (Integer.parseInt(args[0]) % Integer.parseInt(args[1])));
            System.out.println("Quotient : " + ((float) Integer.parseInt(args[0]) / Integer.parseInt(args[1])));
        }
    }
}
