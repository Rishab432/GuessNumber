/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guessnumber;

/**
 *
 * @author rish006
 */
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int userInput;
        int upperLimit = 10;
        boolean correct = false;
        Random rand = new Random();
        Scanner myObj = new Scanner(System.in);
        int random_int = rand.nextInt(upperLimit+1);
        while (correct == false){
          System.out.println("Enter a numbetween 0 and "+upperLimit);
          userInput = myObj.nextInt();
          if (userInput == random_int){
              System.out.println("You are correct, well done!");
              correct = true;
              break;
          }
          else if (userInput > random_int){
              System.out.println("Too high.");
          }
          else{
              System.out.println("Too low.");
          }
        }
    }
}


