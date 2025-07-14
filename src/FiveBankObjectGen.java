public class FiveBankObjectGen
{
    public static void main(String[] args)
    {
//        FiveBanks bank1 = new FiveBanks("Indusind Bank", "INDB000738", "Vadapalani");
//        FiveBanks bank2 = new FiveBanks("Canara Bank","CNRB000345","Vadapalani");
//        FiveBanks bank3 = new FiveBanks("HDFC Bank","HDBI23400","Arumbakkam");
//        FiveBanks bank4 = new FiveBanks("Indian Bank","INBI123403","Chrompet");
//        FiveBanks bank5 = new FiveBanks("Indian Oversease Bank","IOBA54673","Koyembedu");

//        FiveBanks [] FiveBanks = {bank1,bank2,bank3,bank4,bank5};
//        System.out.println("List of Bank Names");
//        for (int i = 0; i < FiveBanks.length; i++)
//        {
//            System.out.println(FiveBanks[i].BankName);
//        }
//        //Alternative Method
//        System.out.println(bank1.BankName);
//        System.out.println(bank2.BankName);
//        System.out.println(bank3.BankName);
//        System.out.println(bank4.BankName);
//        System.out.println(bank5.BankName);

        FiveBanks [] banks = {
                new FiveBanks("Indusind Bank", "INDB000738", "Vadapalani"),
                new FiveBanks("Canara Bank", "CNRB000345", "Vadapalani"),
                new FiveBanks("HDFC Bank", "HDBI23400", "Arumbakkam"),
                new FiveBanks("Indian Bank", "INBI123403", "Chrompet"),
                new FiveBanks("Indian Oversease Bank", "IOBA54673", "Koyembedu")
        };
        System.out.println("List of Bank Name");
        for (int i = 0; i < banks.length; i++)
        {
            System.out.println(banks[i].BankName);
        }
    }
}
