package com.bridgelabz;

public class EmpwageUC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        //Use case 3 

        System.out.println("Welcome to Employee wage");

        int empCheck = (int)(Math.random() * 3); //Generating Random Number
        int wage = 0;
        int isFulltime = 1;
        int empHrs = 0;
        int empWageperHrs = 20;
        int isPartTime = 2;
  //added full time & part time  values
        if(empCheck==isFulltime){
            System.out.println("The employee is doing full time");
            empHrs = 8;

        }else if(empCheck==isPartTime){
            System.out.println("Employee is doing part time");
            empHrs = 4;
        }else{
            System.out.println("Employee is Absent");
            empHrs = 0;
        }

        wage = empHrs * empWageperHrs;
        System.out.println("The employee wage is  "+ wage);
   

	}

}
