package JavaBank;

public class CreditAccount extends AbstractBankAccount{

    int creditLimit;

    //default constructor for CreditAccount
    CreditAccount(String name, int num, int amt)
    {
        super(name,num,amt);
        this.creditLimit=calculateCreditLimit(amt);
    }//end constructor

    //overloaded constructor for CreditAccount
    CreditAccount(String name, int num,int amt,int credit)
    {
        super(name,num,amt);
        this.creditLimit=credit;
    }//end constructor

    private static int calculateCreditLimit(int amt)
    {
        if(amt>1 && amt<=2000)
            return 100;
        else if(amt<=4000)
            return 200;
        else
            return 300;
        //endif
    }//end method calculateCreditLimit

    //modifier to set the account creditLimit
    public void setCreditLimit(int num)
    {
        creditLimit = num;
    }//end method setCreditLimit

    //accessor to get the account creditLimit
    public int getCreditLimit ( )
    {
        return creditLimit;
    }//end method getCreditLimit

    //print method
    public void print()
    {
        System.out.println("\nBank Name : " + getBankName() +
                "\nAccount Holder : " + accountName +
                "\nAccount Number : " + accountNum +
                "\nAccount balance: " + balance +
                "\nCredit Limit : " + creditLimit);
    }//end method print

    public String toString() {
        return super.toString() +
                "\nCredit Limit : " + creditLimit;
    }//end method toString

    public void deposit(int amt) {
        balance=balance+amt;
    }//end method deposit

}//end class CreditAccount

