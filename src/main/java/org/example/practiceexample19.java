/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 12 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds.
The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:
bmi = (weight / (height × height)) * 703


If the BMI is between 18.5 and 25, display that the person is at a normal weight.
If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.
 */


package org.example;
import java.util.Scanner;

public class practiceexample19 {

        public static void main(String[] args) throws Exception { //beginning of argument
            calculateBMI();
        }

        private static void calculateBMI() throws Exception {
            System.out.print("Please enter your weight in pounds: "); //prompt to enter weight
            Scanner s = new Scanner(System.in);
            float weight = s.nextFloat();
            System.out.print("Please enter your height in inches: "); // prompt for height
            float height = s.nextFloat();


            float bmi = (703*weight)/(height*height); //bmi formula

            System.out.println("Your BMI is: "+bmi); //prints result
            printBMICategory(bmi);

        }

        private static void printBMICategory(float bmi) { //logic for decision
            if(bmi < 18.5) {
                System.out.println("You are underweight. Please consult a doctor."); //when bmi is <18.5 will warn
            }else if (bmi < 25) {
                System.out.println("You are normal"); //prompt normal when 18.5 <bmi < 25
            }else if (bmi < 30) {
                System.out.println("You are overweight and consult a doctor."); //prompt overweight when 25< bmi <30
            }else {
                System.out.println("You are obese and consult a doctor"); //prompt obese when bmi is anything other than 30+
            }
        }
    }
