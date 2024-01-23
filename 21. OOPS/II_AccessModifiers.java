public class II_AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Amitesh Sharma";
        //myAcc.password = "dsjdfjn"; 
        myAcc.setPassword("bghsdzh");
    }
}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}