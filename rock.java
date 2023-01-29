import java.util.*;

public class rock {
    public static void main(String args[]) {

        int user_points = 0, mach_points = 0;
        int count = 1, user_input = 0, high_points = 0;
        String val;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        val = "y";

        start: while (val.equals("y")) {
            System.out.println("New Game started");
            System.out.println("Enter the player name");
            String user_name = sc.nextLine();
            System.out.println("The player name is " + user_name);
            System.out.println("1. Rock" + "\n" + "2. Paper" + "\n" + "3. Scissor");
            System.out.println("The highest score is " + high_points);
            
            user_points = 0; mach_points=0; 
            count = 1;
            
            do {
                
                

                System.out.println("Round " + count);

                System.out.println("Enter the choice you want ");

                user_input = sc.nextInt();

                if (user_input == 0000)
                    break;

                if (user_input > 3) {
                    System.out.println("Valid input must be entered");
                    continue;
                }

                String arr[] = { "Rock", "Paper", "Scissor" };
                System.out.println("The user input " + arr[user_input - 1]);

                int mach_input = rand.nextInt(3) + 1;
                System.out.println("The machine input " + arr[mach_input - 1]);

                // rock beats scissors, scissors beat paper, paper beats rock
                // 1 rock 2 paper 3 scissors
                // 1 beats 3, 3 beats 2 , 2 beats 1

                if (user_input == mach_input) {
                    System.out.println("Draw");
                } else {
                    switch (user_input) {
                        case 1:
                            if (mach_input == 2) {
                                System.out.println("Machine wins");
                                mach_points += 1;

                            } else {
                                System.out.println("User wins");
                                user_points += 1;
                            }
                            break;
                        case 2:
                            if (mach_input == 1) {
                                System.out.println("User wins");
                                user_points += 1;
                            } else {
                                System.out.println("Machine wins");
                                mach_points += 1;
                            }
                            break;
                        case 3:
                            if (mach_input == 2) {
                                System.out.println("User wins");
                                user_points += 1;
                            } else {
                                System.out.println("Machine wins");
                                mach_points += 1;
                            }
                            break;
                    }
                }
                count++;
                if (user_points > mach_points)
                    high_points = user_points;
                else if (user_points == mach_points)
                    high_points = user_points;
                else
                    high_points = mach_points;

                System.out.println("To stop type 0000 ");

            } while (user_input != 0000);

            if (user_points > mach_points)
                System.out.println("The overall winner is User with " + user_points + " Points");
            else if (user_points == mach_points)
                System.out.println("The overall Match is a Draw");
            else
                System.out.println("The overall winner is Machine with " + mach_points + " Points");

            Scanner bc = new Scanner(System.in);

            System.out.println("To start a game(y/n) ");
            val = bc.nextLine();

            if (val.equals("y"))
                continue start;
            else {
                System.out.println("Thank you for playing the game");
                break;
            }
        }
    }
}