package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobean.AccountService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlbaseconfiguration/beans.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        System.out.println("Before money transfer");
        System.out.println("Account 1 balance: " + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: " + accountService.getAccount(2).getBalance());

        accountService.transferMoney(1,2,5.0);
        System.out.println();
        System.out.println("===================");
        System.out.println("After money transfer");
        System.out.println("Account 1 balance: " + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: " + accountService.getAccount(2).getBalance());
    }
}