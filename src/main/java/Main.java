import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private final int ADD = 1;
    private final int VIEWTOTAL = 2;
    private final int CHECKGRADUATION = 3;
    private final int EXIT = 4;

    public static void menu() {
        System.out.println("===== Aikido Practice Tracker =====");
        System.out.println("SELECT 1, 2, 3, 4");
        System.out.print("1. Add Practice Session\n" +
                "2. View Total Practice Time\n" +
                "3. Check Graduation Eligibility\n" +
                "4. Exit Choose an option:\n");
    }

    public static void AddPracticeSession(Aikido aikido, Scanner scanner) {
        System.out.println("Add Practice Session to Aikido by entering the date 'YYYY-MM-DD' then duration 'ex. 20' in minutes");
        System.out.println("Enter year 'YYYY':");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter month 'MM':");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter day 'DD'. If day less than 10 then 'D':");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter duration 'ex 20':");
        int duration = Integer.parseInt(scanner.nextLine());

        TrainingSession trainingSession = new TrainingSession(LocalDate.of(year, month, day), duration);
        aikido.addTrainingSession(trainingSession);
        System.out.println("New training session created");
    }

    public static void ViewTotalPracticeTime(Aikido aikido, Scanner scanner) {
        System.out.println("Your Total Practice Time");
        System.out.println("Total training time: " + aikido.getTotalTrainingTime());
        System.out.println("Total training duration: " + aikido.getTotalTrainingSessions());
        System.out.println("Total training sessions: " + aikido.getTrainingSessions().toString());
    }

    public static void CheckGraduationEligibility(Aikido aikido, Scanner scanner) {
        System.out.println("Your Graduation Eligibility");
        if (aikido.getEligibleForGraduation()) {
            System.out.println("You are Eligible for graduation!");
        } else {
            System.out.println("You are not Eligible for graduation.");
        }
        System.out.println("Total training time: " + aikido.getTotalTrainingTime());
        System.out.println("Total training duration: " + aikido.getTotalTrainingSessions());
    }

    public static void Exit() {
        System.out.println("You exited the program.");
        System.exit(0);
    }
    public static void main(String[] args) {
        boolean running = true;
        Aikido aikido = new Aikido();
        Scanner scanner = new Scanner(System.in);
        while (running) {
            menu();
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    AddPracticeSession(aikido, scanner);
                    break;
                case 2:
                    ViewTotalPracticeTime(aikido, scanner);
                    break;
                case 3:
                    CheckGraduationEligibility(aikido, scanner);
                    break;
                case 4:
                    Exit();
                    break;
            }
        }
    }
}
