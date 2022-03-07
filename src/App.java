import java.util.HashMap;
import java.util.Scanner;

public class App {
    static Account account = new Account();
    static HashMap<String,Integer> mapLastTradistion = new HashMap<>();
    public static void main(String[] args) throws Exception {
        
        checkUserPass();
       
}
public static void checkUserPass(){
    
    Scanner input = new Scanner(System.in);
    System.out.println("welcome");
    System.out.print("please enter username:");
    int user = input.nextInt();
    System.out.print("please enter password:");
    int pass = input.nextInt();
    if(user == account.getUserName() && pass == account.getPassWord()){
        showAccountInformation();
    }else{
        System.out.println("username of password is invalid");
        checkUserPass();
    }
}
public static void showAccountInformation(){
    System.out.println("\n1-show balace");
    System.out.println("2-withdraw cash");
    System.out.println("3-deposit founds");
    System.out.println("4-The last 10 transactions ");
    System.out.println("5- exit");
    Scanner input = new Scanner(System.in);
    int intUser = input.nextInt();
    if(intUser == 1){
        System.out.println("your balance is:"+ account.getBalance());
        showAccountInformation();
    }
    else if(intUser == 2){
       withdrawCash();
    }
    else if(intUser == 3){
        depositFounds();
    }
    else if(intUser == 4){
        if(mapLastTradistion.isEmpty()){
            System.out.println("last 10 transactions is empty");
            showAccountInformation();
        }else{
            System.out.println("last 10 transactions is:");
            for (String str : mapLastTradistion.keySet()) {
                System.out.println(str + ": " +mapLastTradistion.get(str) );
            }
            showAccountInformation();
        }
       
    }
    else if(intUser == 5){
        
    }

}
    public static void withdrawCash(){
        System.out.print("please enter amount of withdraw cash:");
        Scanner inpute = new Scanner(System.in);
        int intWithdrawCash = inpute.nextInt();
        if(account.getBalance() > intWithdrawCash){
            account.setBalance(account.getBalance() - intWithdrawCash);
            System.out.println("your new balance account is:"+ account.getBalance());
            mapLastTradistion.put("intWithdrawCash", intWithdrawCash);
            showAccountInformation();
        }else{
            System.out.println("your balance is low from balance");
            showAccountInformation();
        }

    }
    public static void depositFounds(){
        System.out.print("please enter amount of deposit font:");
        Scanner inpute = new Scanner(System.in);
        int intDepositOf = inpute.nextInt();
        account.setBalance(account.getBalance()+ intDepositOf);
        System.out.println("your new balance account is:"+ account.getBalance());
        mapLastTradistion.put("intDepositOf", intDepositOf);
        showAccountInformation();
    }
    
}

