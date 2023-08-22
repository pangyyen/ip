import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String helloMessage = "____________________________________________________________\n" +
                " Hello! I'm Najib\n" +
                " What can I do for you?\n" +
                "____________________________________________________________\n";

        String byeMessage = "____________________________________________________________\n" +
                " Bye. Hope to see you again soon!\n" +
                "____________________________________________________________";

        System.out.println(helloMessage);
        String input;
        String printMessage;
        while (true) {
            input = scanner.nextLine();
            printMessage = "____________________________________________________________\n" +
                    input +
                    "\n____________________________________________________________";

            if (input.equals("bye")) {
                System.out.println(byeMessage);
                break;  // Exit the loop when user types "bye"
            } else {
                System.out.println(printMessage);
            }
        }

        scanner.close();
    }
}
