public class FiveBanks
{
    String BankName ;
    String ifscCode;
    String Branch;

    FiveBanks(String BankName ,String ifscCode ,String Branch)
    {
        this.BankName = BankName;
        this.ifscCode=ifscCode;
        this.Branch=Branch;
    }

    public void details()
    {
        System.out.println("Your Bank name is :"+BankName);
        System.out.println("Your ifsc code is :"+ifscCode);
        System.out.println("Your Bank Branch name is :"+Branch);
    }
}
