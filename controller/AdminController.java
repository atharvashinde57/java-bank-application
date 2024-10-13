package com.vilgax.bankapplication.controller;

	import java.util.Scanner;
	import com.vilgax.bankapplication.service.RBI;
	import com.vilgax.bankapplication.serviceexample.SBI;

	public class AdminController {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        RBI rbi = (RBI) new SBI();
	        boolean flag = true;
	        while (flag) {
	            System.out.println("***********WELCOME TO SBI BANK***************");
	            System.out.println("1: CREATE BANK ACCOUNT");
	            System.out.println("2: SHOW ACCOUNT DETAILS");
	            System.out.println("3: SHOW ACCOUNT BALANCE");
	            System.out.println("4: DEPOSIT MONEY");
	            System.out.println("5: WITHDRAW MONEY");
	            System.out.println("6: UPDATE ACCOUNT DETAILS");
	            System.out.println("7: EXIT");
	            System.out.println("*********************************************");
	            System.out.println("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    rbi.createAccount();
	                    break;
	                case 2:
	                    rbi.showAccountDetails();
	                    break;
	                case 3:
	                    rbi.showAccountBalance();
	                    break;
	                case 4:
	                    rbi.depositMoney();
	                    break;
	                case 5:
	                    rbi.withdrawMoney();
	                    break;
	                case 6:
	                    rbi.updateAccountDetails();
	                    break;
	                case 7:
	                    flag = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please enter the correct choice.");
	            }
	        }
	        sc.close();
	        System.out.println("Thank you for banking with us!");
	    }
	}
