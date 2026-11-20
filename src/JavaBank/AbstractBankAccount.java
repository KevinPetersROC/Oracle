package JavaBank;

abstract public class AbstractBankAccount
{
    final String BANK= "JavaBank";
    protected String accountName;
    protected int accountNum;
    protected int balance;

    public AbstractBankAccount(String name, int num,int amt)
    {
        accountName=name;
        accountNum=num;
        balance=amt;
    }//end constructor

    abstract public void deposit(int amt);

    //make a withdrawal from the balance
    public void withdraw(int amt)
    {
        balance=balance-amt;
    }//end method withdraw

    //modifier to set the accountName
    public void setAccountName(String name)
    {
        accountName = name;
    }//end method setAccountName

    //modifier to set the accountNumber
    public void setAccountNum(int num)
    {
        accountNum = num;
    }//end method setAccountNum

    //modifier to set the balance
    public void setBalance(int num)
    {
        balance = num;
    }//end method setBalance

    //accessor to get the accountName
    public String getAccountName ( )
    {
        return accountName;
    }//end method getAccountName

    //accessor to get the accountNumber
    public int getAccountNum ( )
    {
        return accountNum;
    }//end method getAccountNum

    //accessor to get the account balance
    public int getBalance ( )
    {
        return balance;
    }//end method getBalance

    public String getBankName() {
        return InterfaceBankAccount.BANK;
    }//end method getBankName

    public String toString()
    {
        return "\n\nBank Name : " + getBankName() +
                "\nAccount Holder : " + accountName +
                "\nAccount Number : " + accountNum +
                "\nAccount balance: " + balance;
    }//end method toString

}//end class AbstractBankAccount
