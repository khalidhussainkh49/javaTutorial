public class Accounts {
    
public String accName;
public int accNumber;
public double accBalance;



Accounts( String accName, int accNumber,double accBalance){

    this.accName = accName;
    this.accBalance = accBalance;
    this.accNumber = accNumber;

}
public String getAccName() {
    return accName;
}
public void setAccName(String accName) {
    this.accName = accName;
}
public int getAccNumber() {
    return accNumber;
}
public void setAccNumber(int accNumber) {
    this.accNumber = accNumber;
}
public double getAccBalance() {
    return accBalance;
}
public void setAccBalance(double accBalance) {
    this.accBalance = accBalance;
}



public void credit(double amount){
    this.accBalance += amount;
    System.out.println(this.accBalance);
}

public void debit(double amount){
    if (this.accBalance<amount){
        System.out.println("Insufficient Balance : " + this.accBalance);
    }
    else{

        this.accBalance -= amount;
        System.out.println(this.accBalance);
    }
    
}

}
