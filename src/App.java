public class App {
    public static void main(String[] args)  {
       Accounts person =  new Accounts("man", 012345, 5000);

        person.credit(200.00);
        System.out.println(person.accName);

        Atm person2 = new Atm();
        person2.checkBalance(person);

        Cards personCards = new Cards();
        personCards.withdraw(person, 800);

    }

}  