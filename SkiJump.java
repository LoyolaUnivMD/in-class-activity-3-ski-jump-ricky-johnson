// Programmer: Ricky Johnson
// Course: CS-212
// Due Date: 2/1/24
// Assignment: In Class Activity 3
// Problem Statement: Calculate the distance traveled of a ski jump based on speed.
//                    Determine how many points the jumper receives based on that distance.
// Data In: Type of jump, jumper's speed
// Data Out: Points, distance, comment about performance
// Credits: None


// Import Scanner Class
import java.util.Scanner;
// Import Math Class
import static java.lang.Math.sqrt;

class SkiJump {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);


        // Introduce Program
        System.out.println();
        System.out.println("This program calculates the distance traveled of a ski jump based on speed and \n" +
                "determines how many points the jumper receives based on that distance.");
        System.out.println();


        // User inputs //
        // Hill type
        System.out.println("Enter hill type (normal or large): ");
        String hillTypeInput = input.nextLine();
        // Convert to lowercase
        String hillType = hillTypeInput.toLowerCase();

        // Speed
        System.out.println("Enter jumper's speed: ");
        double speed = input.nextDouble();
        System.out.println();


        // Determine correct calculation and output based on hill type //
        // Normal Hill
        if (hillType.equals("normal")) {
            // Calculations
            double height = 46;
            double timeInAir = sqrt((2 * height)/9.8);
            double distance = timeInAir * speed;
            double points = 60 + (distance - 90) * 2;

            // Output points and distance
            System.out.println("-------------------------------------------");
            System.out.println("Points: " + points);
            System.out.println("Distance: " + distance + " meters");
            System.out.println();

            // Output comment based on points
            if (points >= 61)
                System.out.println("Great job for doing better than par!");
            else if (points < 10)
                System.out.println("What happened??");
            else
                System.out.println("Sorry, you didn’t go very far.");
            }

        // Large Hill
        else if (hillType.equals("large")) {
            // Calculations
            double height = 70;
            double timeInAir = sqrt((2 * height)/9.8);
            double distance = timeInAir * speed;
            double points = 60 + (distance - 120) * 1.8;

            // Output points and distance
            System.out.println("-------------------------------------------");
            System.out.println("Points: " + points);
            System.out.println("Distance: " + distance + " meters");
            System.out.println();

            // Output comment based on points
            if (points >= 61)
                System.out.println("Great job for doing better than par!");
            else if (points < 10)
                System.out.println("What happened??");
            else
                System.out.println("Sorry, you didn’t go very far.");
        }

        System.out.println("-------------------------------------------");
    }
}
