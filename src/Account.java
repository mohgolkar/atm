import java.util.HashMap;

public class Account{
    private int userName = 123456;
    private int PassWord = 654321;
    private int balance = 1000;
    

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getUserName() {
        return this.userName;
    }

    

    public int getPassWord() {
        return this.PassWord;
    }


    @Override
    public String toString() {
        return "{" +
            ", userName='" + getUserName() + "'" +
            ", PassWord='" + getPassWord() + "'" +
            " balance='" + getBalance() + "'" +
            "}";
    }
    

}