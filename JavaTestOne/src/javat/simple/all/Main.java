package javat.simple.all;

import java.util.Scanner;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
      // System.out.println(factoria(8)); 
      // QuestionOne();
      // QuestionTwo(5, 4);
      // QuestionThree();
      // System.out.println(QuestionFour(1996));
      // QuestionFive(); 
      // System.out.println(QuestionSeven(45.1));
       // JOptionPane.showMessageDialog(null, "Anwser: " + QuestionSix(Integer.parseInt(JOptionPane.showInputDialog("Number one?")), Integer.parseInt(JOptionPane.showInputDialog("Number two?"))));
      // System.out.println(QuestionEight(45,70));
      // QuestionNine("Bob", 1996);
    }
    
    public static void jPaneTest(){
        JOptionPane.showMessageDialog(
           null,
           "Welcome to Java",
           "Display Message",
           JOptionPane.INFORMATION_MESSAGE
         );
    }
    
    public static void QuestionOne(){
        System.out.println("Module Code\\Name: ST1012\\\"Programming Fundamentals\"\n" +
        "CA 1            :40%\n" +
        "CA 2            :20%\n" +
        "EXAM            :40%\n" + 
        "Total---------->:100%");
    }
    
    public static int QuestionTwo(int x, int y){
        return x * y;
    }
    
    public static void QuestionThree(){
        int num = 932;
        int digit1;          //to extract 9
        int digit2;          //to extract 3
        int digit3;          //to extract 2
        int sum;             //sum of all digits

        digit1 = num/100;
        System.out.println(digit1);

        digit2 = (num - digit1*100)/10;
        System.out.println(digit2);

        digit3 = num - digit1*100 - digit2*10;
        System.out.println(digit3);

        sum = digit1 + digit2 + digit3;
        System.out.println(sum);
    }
    
    public static Boolean QuestionFour(int year){
        return (year%4 == 0 && year%100 != 0) || year%400 == 0;
    }
    
    public static void QuestionFive(){
        String name = JOptionPane.showInputDialog("Whats your name?");
        JOptionPane.showMessageDialog(
           null,
           "Welcome to Java, " + name,
           "Display Message",
           JOptionPane.INFORMATION_MESSAGE
         );
    }
    
    public static Boolean QuestionSix(int x, int y){
        return x%y == 0;
    }
    
    public static double QuestionSeven(double f){
        return 5.0/9.0 *(f-32.0);
    } 
    
    public static int QuestionEight(int m, int n){
        int value = m;
        return ((n-m+1)*(n+m))/2;
    }
    
    public static void QuestionNine(String name, int year){
        System.out.println(
        "Name: " + name + "\n" +
        "Year of Birth: " + year + "\n" +
        "Age: " + (2018 - year)
        );
    }    
    
    public static int factoria(int n){
        if(n == 0){
            return 1;
        } else if(n > 0){
            return (n * factoria(n-1)); //recursion
        }
        return 0;
    }

}
