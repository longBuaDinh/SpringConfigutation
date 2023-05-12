package scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobean.Account;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beansscopes/beans.xml");
        Account accountSingleton = applicationContext.getBean("account1", Account.class);
        accountSingleton.setOwnerName("Long Bua Dinh");
        System.out.println("Account 1: " + accountSingleton.getOwnerName());

        Account accountBefore = applicationContext.getBean("account2",Account.class);
        accountBefore.setOwnerName("XXX");
        Account accountAfter = applicationContext.getBean("account2",Account.class);
        System.out.println("Account 2: " + accountAfter.getOwnerName() + accountBefore.getOwnerName());
    }
}
