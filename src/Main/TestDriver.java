package Main;

import Account.*;
import Data.DataAccount1;
import Data.DataAccount2;
import EFSM.StateMachine;
import Output.OutputProcessor;
import AbstractFactory.*;

import java.util.Scanner;

/*
    This class serves as the test driver and interface for testing the ATM Account system. It will show the execution and sequence of
    the two accounts handling both user input and providing output.
 */

public class TestDriver {

    static final int account1 = 1;
    static final int account2 = 2;

    public static void main(String[] args) {
        System.out.println("####################### Test Driver #######################");
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose an Account");
        System.out.println("( 1 ) Account1");
        System.out.println("( 2 ) Account2");

        int input = Integer.parseInt(scan.next());

        if (1 != input && 2 != input) {
            System.out.println("Invalid input. Please '1' or '2' to choose your Account.");
        }
        if (input == 1) {
            ConcreteFactory1 cf1 = new ConcreteFactory1();
            OutputProcessor op = new OutputProcessor(cf1.getData(), cf1);
            StateMachine sm = new StateMachine(cf1, op, account1);
            Account1 a1 = new Account1(sm, cf1.getData() );

            System.out.println("####################### Choose from Account 1 Transactions #######################");
            System.out.println("\n1. open");
            System.out.println("\n2. login");
            System.out.println("\n3. deposit");
            System.out.println("\n4. withdraw");
            System.out.println("\n5. balance");
            System.out.println("\n6. pin");
            System.out.println("\n7. logout");
            System.out.println("\n8. lock");
            System.out.println("\n9. unlock");
            System.out.println("\n0. quit");

            while (true) {
                System.out.println("####################### Select Operation #######################");
                System.out.println("1. open, 2. login, 3. deposit, 4. withdraw, 5. balance, 6. pin, 7. logout, 8. lock, 9. unlock, 0. quit");

                input = Integer.parseInt(scan.next());

                if (input > 9) {
                    System.out.println("Please enter a valid input");
                    continue;
                }
                if (input == 0) {
                    break;
                }

                int a, p, y, w, x, d;

                switch (input) {
                    case 1://open
                        System.out.println("\nEnter your pin: ");
                        p = scan.nextInt();

                        System.out.println("\nPlease enter the ID you'd like for your Account Login");
                        y = scan.nextInt();

                        System.out.println("\nEnter your initial balance");
                        a = scan.nextInt();

                        System.out.println("#######################");
                        a1.open(p, y, a);
                    case 2://login
                        System.out.println("\n Please enter your ID");
                        y = scan.nextInt();
                        a1.login(y);

                        System.out.println("#######################");

                        System.out.println("\nPlease enter your pin");
                        x = scan.nextInt();
                        a1.pin(x);
                        System.out.println("#######################");
                        break;
                    case 3: //deposit
                        System.out.println("\nEnter the amount you are going to deposit ");
                        d = scan.nextInt();
                        a1.deposit(d);
                        System.out.println("#######################");
                        break;
                    case 4: //withdraw
                        System.out.println("\nEnter the amount you would like to withdraw");
                        w = scan.nextInt();
                        System.out.println("#######################");
                        a1.withdraw(w);
                        break;
                    case 5: //balance
                        System.out.println("#######################");
                        a1.balance();
                        break;
                    case 6: //pin
                        System.out.println("\nEnter your pin");
                        x = scan.nextInt();
                        a1.pin(x);
                        System.out.println("#######################");
                    case 7://logout
                        a1.logout();
                        System.out.println("#######################");
                    case 8://lock
                        System.out.println("Enter your pin");
                        x = scan.nextInt();
                        a1.lock(x);
                        System.out.println("#######################");
                    case 9://unlock
                        System.out.println("\nEnter your pin");
                        x = scan.nextInt();
                        a1.unlock(x);
                        System.out.println("#######################");
                        break;
                    default:
                        System.out.println("Incorrect input. Please try a valid option");
                        break;
                }

            }
        } else {

            ConcreteFactory2 cf2 = new ConcreteFactory2();
            OutputProcessor op = new OutputProcessor(cf2.getData(), cf2);
            StateMachine sm = new StateMachine(cf2, op, account2);
            Account2 a2 = new Account2(sm, cf2.getData() );

            System.out.println("####################### Choose from Account 2 Transactions #######################");
            System.out.println("\n1. OPEN");
            System.out.println("\n2. LOGIN");
            System.out.println("\n3. DEPOSIT");
            System.out.println("\n4. WITHDRAW");
            System.out.println("\n5. BALANCE");
            System.out.println("\n6. PIN");
            System.out.println("\n7. LOGOUT");
            System.out.println("\n8. suspend");
            System.out.println("\n9. activate");
            System.out.println("\n10. close");
            System.out.println("\n0. quit");

            while (true) {
                System.out.println("####################### Select Operation #######################");
                System.out.println("1. open, 2. login, 3. deposit, 4. withdraw, 5. balance, 6. pin, 7. logout, 8. Suspend, 9. Activate, 10. close, 0. quit");

                input = Integer.parseInt(scan.next());

                if (input > 10) {
                    System.out.println("Please enter a valid input");
                    continue;
                }
                if (input == 0) {
                    break;
                }

                int p, y, x;
                float d, w, a;

                switch (input) {
                    case 1://open
                        System.out.println("\nEnter your pin: ");
                        p = scan.nextInt();

                        System.out.println("\nPlease enter the ID you'd like for your Account Login");
                        y = scan.nextInt();

                        System.out.println("\nEnter your initial balance");
                        a = scan.nextFloat();

                        System.out.println("#######################");
                        a2.OPEN(p, y, a);
                    case 2://login
                        System.out.println("\n Please enter your ID");
                        y = scan.nextInt();
                        a2.LOGIN(y);

                        System.out.println("#######################");

                        System.out.println("\nPlease enter your pin");
                        x = scan.nextInt();
                        a2.PIN(x);
                        System.out.println("#######################");
                        break;
                    case 3: //deposit
                        System.out.println("\nEnter the amount you are going to deposit ");
                        d = scan.nextFloat();
                        a2.DEPOSIT(d);
                        System.out.println("#######################");
                        break;
                    case 4: //withdraw
                        System.out.println("\nEnter the amount you would like to withdraw");
                        w = scan.nextFloat();
                        System.out.println("#######################");
                        a2.WITHDRAW(w);
                        break;
                    case 5: //balance
                        System.out.println("#######################");
                        a2.BALANCE();
                        break;
                    case 6: //pin
                        System.out.println("\nEnter your pin");
                        x = scan.nextInt();
                        a2.PIN(x);
                        System.out.println("#######################");
                    case 7://logout
                        a2.LOGOUT();
                        System.out.println("#######################");
                    case 8://suspend
                        System.out.println("#######################");
                        a2.suspend();
                        System.out.println("#######################");
                        break;
                    case 9: //activate
                        System.out.println("#######################");
                        a2.activate();
                        System.out.println("#######################");
                        break;
                    case 10: //close
                        System.out.println("#######################");
                        a2.close();
                        break;
                    default:
                        System.out.println("Incorrect input. Please try a valid option");
                        break;
                }

            }
        }
        System.out.println("####################### Test Driver #######################");
        scan.close();
    }

}
