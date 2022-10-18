package com.bridgelabz;

public class EmpwageUC6 {


	static final int IS_FULL_TIME = 1; // Constance value added
    static final int IS_PART_TIME = 2;  // Constance value added
    static final int EMP_WAGE_HRS = 20; // also this is final value initialize

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//UC6 switch case statement added monthly + Hrs wage
		
		 System.out.println("Welcome to Employee wage");

	        int wage = 0;
	        int empHrs = 0;
	        int monthlyWage = 0;
	        int totalHrs = 0;
	        int workingDays = 0;

	        while(totalHrs<100 && workingDays<20) {

	            int empCheck = (int)(Math.random() * 3); //Generating Random Number

	            switch (empCheck) {
	                case IS_FULL_TIME:
	                    System.out.println("The employee is doing full time");
	                    empHrs = 8;
	                    workingDays++;
	                    break;
	                case IS_PART_TIME:
	                    System.out.println("Employee is doing part time");
	                    empHrs = 4;
	                    workingDays++;
	                    break;
	                default:
	                    System.out.println("Employee is Absent");
	                    empHrs = 0;
	            }

	            wage = empHrs * EMP_WAGE_HRS;
	            System.out.println("The employee wage is  " + wage);
	            System.out.println("-----------------------------------");

	            totalHrs += empHrs;
	            monthlyWage += wage;
	        }
	        System.out.println("Monthly hour  " +totalHrs);
	        System.out.println("Total working days are " +workingDays);
	        System.out.println(" Monthly wage  " +monthlyWage);
		
		

	}

}
