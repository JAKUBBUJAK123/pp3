/**
 * BankAccount
 */
public class BankAccount {
    private int clientId;
    private String accountNumber;
    private String name;
    private String surname;
    private int balance;

    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int value){
    balance += value;
    }
    public String withdraw(int value){
        int money =0;
        if (balance >= value && value < 500){
            balance -= value;
            money += value;
            return "operacja wykonana poprawnie";
        }else{
        return "not enough money or you have exceeded your daily withdraw limit";
        }
    }
    public String display(){
        return "your account balance: " + balance;
    }
    public static void main(String[] args) {
        BankAccount o = new BankAccount();
        o.setBalance(1500);
        o.getBalance();
        o.deposit(500);
        System.out.println(o.display());
        o.deposit(200);
        System.out.println(o.display());
        o.withdraw(300);
        System.out.println(o.display());
    }
}