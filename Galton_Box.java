
import java.util.Scanner;
public class Galton_Box {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variables
        int num_of_balls;
        int num_of_slots;
        int ball_in_slot;

        // Prompting user to enter the number of balls to drop
        System.out.print("Enter the number of balls to drop: ");
        num_of_balls = input.nextInt();
        String[] ballPaths = new String[num_of_balls]; // Putting user's inputs into an array

        // Prompting user to enter the number of slots in the bean machine
        System.out.print("Enter the number of slots in the bean machine: ");
        num_of_slots = input.nextInt();
        int[] slots = new int[num_of_slots]; // Putting user's inputs into an array

            int[] frequency = new int[num_of_slots]; // Declaring frequency variable
            int num_in_each_slot = 0;

            // Determining the direction of the ball as it drops

            for (int i = 1; i < ballPaths.length + 1; i++) {
                System.out.print("Ball " + i + ": "); // Displaying the ball number
                ball_in_slot = 0;
                for (int j = 1; j < slots.length - 1; j++) {
                    int direction = (int)(Math.random() * 2); // Randomly generates a number between 0 and 1
                    if (direction == 0) { // If the random number is 0, then the ball goes left
                        System.out.print("L");
                    }
                    else { // If the random number is 1, then the ball goes right
                        System.out.print("R");
                        ball_in_slot++;
                    }
                }
                System.out.println();
                frequency[ball_in_slot] = frequency[ball_in_slot] + 1; // Counting the frequency the balls in each slot
              if (frequency[ball_in_slot] > num_in_each_slot) { // If there's a ball in the slot, then set num_in_each_slot to ball frequency
                  num_in_each_slot = frequency[ball_in_slot];
               }

            }

            System.out.println();
            System.out.println("___________HISTOGRAM___________");
            System.out.println();

        // Displaying the histogram
        for (int i = num_in_each_slot; i >= 0; i-- ) {
            for (int j = 0; j < num_of_slots; j++ ) {
                if (i <=frequency[j]) {
                    System.out.print(" * "); // Print a * every time a ball is in the slot
                }
                else {
                    System.out.print("   "); // Print a space when there are no balls
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= num_of_slots; i++){
            System.out.print(" " + i + " "); // Displays the slot number at the bottom
        }
        }
    }


