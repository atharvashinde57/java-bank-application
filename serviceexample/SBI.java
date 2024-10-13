package com.vilgax.bankapplication.serviceexample;
import java.util.Scanner;

import com.vilgax.bankapplication.model.Account;
import com.vilgax.bankapplication.service.RBI;





	public class SBI implements RBI {
	    Account ac = new Account();
	    Scanner sc = new Scanner(System.in);

	    @Override
	    public void createAccount() {
	        System.out.println("Enter account number: ");
	        ac.setAccountNo(sc.nextInt());
	        System.out.println("Enter Password: ");
	        ac.setPassword(sc.nextLong());
	        System.out.println("Enter name: ");
	        ac.setName(sc.next());
	        System.out.println("Enter Aadhar number: ");
	        ac.setAdharNo(sc.nextInt());
	        System.out.println("Enter PAN card number: ");
	        ac.setPanNo(sc.next());
	        System.out.println("Enter contact number: ");
	        ac.setContactNo(sc.nextLong());
	        System.out.println("Enter email: ");
	        ac.setEmail(sc.next());
	        System.out.println("Enter account balance: ");
	        ac.setAccountBalance(sc.nextDouble());
	        System.out.println("Account creation success!!!");
	    }

	    @Override
	    public void showAccountDetails() {
	        System.out.println("Enter your account: ");
	        int accNo = sc.nextInt();
	        System.out.println("Enter Passwors: ");
	        long password=sc.nextLong();
	        if (accNo == ac.getAccountNo() && password == ac.getPassword() ) {
	            System.out.println("Account Details: " + ac.toString());
	        } else {
	            System.out.println("Account doesn't exist!!!");
	        }
	    }

	    

		@Override
	    public void showAccountBalance() {
	        System.out.println("Enter your account: ");
	        int accNo = sc.nextInt();
	        System.out.println("Enter Passwors: ");
	        long password=sc.nextLong();
	        if (accNo == ac.getAccountNo() && password == ac.getPassword() ) {
	            System.out.println("CURRENT ACCOUNT BALANCE: " + ac.getAccountBalance());
	        } else {
	            System.out.println("Account doesn't exist!!!");
	        }
	    }

	    @Override
	    public void depositMoney() {
	        System.out.println("Enter amount to deposit: ");
	        double newAmount = sc.nextDouble();
	        ac.setAccountBalance(ac.getAccountBalance() + newAmount);
	        System.out.println("Updated balance: " + ac.getAccountBalance());
	    }

	    @Override
	    public void withdrawMoney() {
	    System.out.println("Enter your account: ");
        int accNo = sc.nextInt();
        System.out.println("Enter Password: ");
        long password=sc.nextLong();
        if (accNo == ac.getAccountNo() && password == ac.getPassword() ){
	        System.out.println("Enter amount to withdraw: ");
	        double amount = sc.nextDouble();
	        if (ac.getAccountBalance() >= amount) {
	            ac.setAccountBalance(ac.getAccountBalance() - amount);
	            System.out.println("Updated balance: " + ac.getAccountBalance());
	        } else {
	            System.out.println("Insufficient balance!");
	            }}
	        
	        else {System.out.println("Invalid Account Number or Password!");}
	    }

	    @Override
	    public void updateAccountDetails() {
	        System.out.println("Update account details: ");
	        System.out.println("Enter new name: ");
	        ac.setName(sc.next());
	        System.out.println("Enter Password: ");
	        ac.setPassword(sc.nextLong());
	        System.out.println("Enter name: ");
	        ac.setName(sc.next());
	        System.out.println("Enter Aadhar number: ");
	        ac.setAdharNo(sc.nextInt());
	        System.out.println("Enter PAN card number: ");
	        ac.setPanNo(sc.next());
	        System.out.println("Enter contact number: ");
	        ac.setContactNo(sc.nextLong());
	        System.out.println("Enter email: ");
	        ac.setEmail(sc.next());
	        System.out.println("Enter account balance: ");
	        ac.setAccountBalance(sc.nextDouble());
	        
	        System.out.println("Account details updated.");
	    }
}
