import java.util.Scanner;
public class InternTimesheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Intern Timesheet!\n What's your name?: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + ". Lets see how much youve worked each week:");


        int WeeksWorked = 0;


        while (true) {

            System.out.println("Did you work this week?:");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Pog you!");
                WeeksWorked++;

            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Gotta get your money up not ur funny up mate. Come back when you're able.");
            } else {
                System.out.println("Dude, Im a piece of code. I dont know what you're saying. Please say yes or no.");
            }
            if (WeeksWorked == 4) {
                System.out.println("Wowee a whole month huh "+ name + ", I give u props. Take care. :D");
                break;

            }
            System.out.println("Your weeks worked is: " + WeeksWorked);


        }
        scanner.close();
    }
}
