package lab.pkg14;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab14_Assign_Runner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] ac = new Account[10];
        ac[0] = new Account("123456789", 4100);
        ac[1] = new Account("987456321", 96400);
        ac[2] = new Account("123654789", 38500);
        ac[3] = new Account("987456321", 100000);
        ac[4] = new Account("357916428", 89300);
        ac[5] = new Account("159734862", 2800);
        ac[6] = new Account("056315456", 210000);
        ac[7] = new Account("952048994", 176);
        ac[8] = new Account("410389419", 8700);
        ac[9] = new Account("956148941", 50000);

        ArrayList<Account> Records = new ArrayList<Account>();
        Records.add(ac[0]);
        Records.add(ac[1]);
        Records.add(ac[2]);
        Records.add(ac[3]);
        Records.add(ac[4]);
        Records.add(ac[5]);
        Records.add(ac[6]);
        Records.add(ac[7]);
        Records.add(ac[8]);
        Records.add(ac[9]);

        Account.writeFile(Records);

        System.out.println("Enter the amount to deposit:");
        int n = input.nextInt();

        ac[1].deposit(n);

        ac[3].BalanceInquiry();
        System.out.println("Enter amount to withdraw: ");
        int w = input.nextInt();
        ac[2].withdraw(w);
        System.out.println("Enter the amount to transfer: ");
        int t = input.nextInt();
        ac[8].transfer(ac[9],ac[8],t);

        ac[8].BalanceInquiry();

        Account.writeFile(Records);
//        Account.readFile(Records);



    }

    }