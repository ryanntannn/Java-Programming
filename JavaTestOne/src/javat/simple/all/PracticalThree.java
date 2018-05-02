package javat.simple.all;

import javax.swing.*;
import java.text.DecimalFormat;

public class PracticalThree {
    public static void main(String[] args){
    	questionSix();
    }

    public static void questionOne(){//Max
    	int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
    	int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
    	if(firstNumber > secondNumber){
    		JOptionPane.showMessageDialog(null, firstNumber + " is bigger than " + secondNumber);
    	} else {
    		JOptionPane.showMessageDialog(null, secondNumber + " is bigger than " + firstNumber);
    	}
    }

    public static void questionTwo(){//Grade
    	int marksObtained = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks:"));
    	String grade;
    	if(marksObtained > 80){
    		grade = "A";
    	} else if(marksObtained > 70){
    		grade = "B";
    	} else if(marksObtained > 60){
    		grade = "C";
    	} else if(marksObtained > 50){
    		grade = "D";
    	} else {
    		grade = "F";
    	}
    	JOptionPane.showMessageDialog(null, "Grade Obtained: " + grade);
    }

    public static void questionThree(){//CheckNumber
    	int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
    	Boolean divisableByFive = (number%5 == 0);
    	Boolean divisableBySix = (number%6 == 0);

    	if(divisableByFive && divisableBySix){
    		JOptionPane.showMessageDialog(null, number + " is divisable by both 5 and 6");
    	} else if (divisableByFive || divisableBySix){
    		JOptionPane.showMessageDialog(null, number + " is divisable by either 5 and 6");
    	} else {
    		JOptionPane.showMessageDialog(null, number + " is not divisable by neither 5 nor 6");
    	}
    }

    public static void questionFour(){//IncrementCalculator
    	int year = Integer.parseInt(JOptionPane.showInputDialog("How long have you worked for us?"));
    	int salary = Integer.parseInt(JOptionPane.showInputDialog("What is your current salary"));
    	int increment = 0;

    	if(year < 10){
    		if(salary < 1000){
    			increment = 100;
    		} else if(salary <2000){
    			increment = 200;
    		} else {
    			increment  = 300;
    		}
    	} else{
    		if(salary < 1000){
    			increment = 200;
    		} else if(salary <2000){
    			increment = 300;
    		} else {
    			increment = 400;
    		}
    	}

    	JOptionPane.showMessageDialog(null, "Increment is: $" + increment);
    }

    public static void questionFive(){//PrizeMoney
    	int rank = Integer.parseInt(JOptionPane.showInputDialog("What is your rank?"));
    	int prizeMoney = 0;

    	switch(rank){
    		case 1: prizeMoney = 1000;
    				break;
    		case 2: prizeMoney = 800;
    				break;
    		case 3: prizeMoney = 700;
    				break;
    		case 4: prizeMoney = 300;
    				break;
    		case 5: prizeMoney = 300;
    				break;
    		default: prizeMoney = 20;
    				break;
    	}

    	JOptionPane.showMessageDialog(null, "Your prize money is: $" + prizeMoney);
    }

    public static void questionSix(){
    	int bicycleType = Integer.parseInt(JOptionPane.showInputDialog("What is your bicycle type?\n1)Single Seater 2)Double seater"));
    	int hoursRented = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of hours rented"));
    	double ammountPayable = 0;

    	if(bicycleType == 1){
    		ammountPayable = 5.5 * hoursRented;
    	} else if(bicycleType == 2){
    		ammountPayable = 7.8 * hoursRented;
    	}

    	if(hoursRented >= 3){
    		ammountPayable *= 0.7;
    	}

    	DecimalFormat df2 = new DecimalFormat(".##");

    	JOptionPane.showMessageDialog(null, "The ammount payable is: $" + df2.format(ammountPayable));
    }

    public static void questionSeven(){//Triangles
    	int side1 = Integer.parseInt(JOptionPane.showInputDialog("Enter side 1"));
    	int side2 = Integer.parseInt(JOptionPane.showInputDialog("Enter side 2"));
    	int side3 = Integer.parseInt(JOptionPane.showInputDialog("Enter side 3"));
    	String type = "";

    	if(side1+side2>side3 && side2+side3>side2 && side1+side3>side2){//test for invalid
    		type = "invalid";
    	}else if(side1 == side2 && side2 == side3){//Equilateral
    		type = "Equilateral";
    	} else if(side1 == side2 || side2 == side3 || side1 == side3){//Isoceles
    		type = "Isoceles";
    	} else {
    		type = "Scalene";
    	}

    	JOptionPane.showMessageDialog(null, "The type of triangle is: " + type);
    }

    public static void questionEight(){
    	int month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month: "));
    	int years = Integer.parseInt(JOptionPane.showInputDialog("Enter the year: "));
    	Boolean isLeap = (years%4 == 0);
    	int days = 0;
    	String monthString = "";

    	if(isLeap && month == 2){
    		days = 29;
    		monthString = "February";
    	} else {
    		switch(month){
    			case 1: days = 31;
    					monthString = "January";
    					break;
    			case 2: days = 28;
    					monthString = "February";
    					break;
    			case 3: days = 31;
    					monthString = "March";
    					break;
    			case 4: days = 30;
    					monthString = "April";
    					break;
    			case 5: days = 31;
    					monthString = "May";
    					break;
    			case 6: days = 30;
    					monthString = "June";
    					break;
    			case 7: days = 31;
    					monthString = "July";
    					break;
    			case 8: days = 31;
    					monthString = "August";
    					break;
    			case 9: days = 30;
    					monthString = "September";
    					break;
    			case 10: days = 31;
    					monthString = "October";
    					break;
    			case 11: days = 30;
    					monthString = "November";
    					break;
    			case 12: days = 31;
    					monthString = "December";
    					break;
    		}
    	}

    	JOptionPane.showMessageDialog(null, monthString + " " + years + " has " + days + " days");
	}
}