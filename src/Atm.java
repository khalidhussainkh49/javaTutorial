public class Atm  {
        
    
    
    public void withdraw(Accounts from, int amount){
            if (amount >from.accBalance){
                System.out.println("Insufficient Balance");

            }
            else{
                from.credit(amount);
            }
        }

public void checkBalance(Accounts from){
    System.out.println(from.getAccBalance());

  
}

public void ActivateCard(Accounts from){


}


}