import java.util.Scanner;

public class AadharObjectGenerator
{
   static AadharObject person1 = new AadharObject("Arunmozhi",123,321,"Tamilnadu");
   static AadharObject person2 = new AadharObject("Yohanan",456,654,"Kerala");
   static AadharObject person3 =new AadharObject("Vidhan",789,987,"Karnataka");

   static Scanner ref = new Scanner(System.in);
  static AadharObject [] Applicant = {person1,person2,person3};


   public static void main(String[] args)
   {
       boolean home = true;
       do {

          switch ()
          {
             case 1:{break;}
          }

       }while (home)
      System.out.println("thank you");

   }
   public static void getinfo(int index)
   {
      boolean flag = true;
      do
      {

         System.out.println("Select the input");
         System.out.println("1.Name");
         System.out.println("2.Aadhar-No");
         System.out.println("3.Contact-No");
         System.out.println("4.Address");
         System.out.println("5.Exit");
         System.out.println();
         int input = ref.nextInt();
         switch (input)
         {
            case 1:{
               System.out.println("Name:"+Applicant[index].getName());
               break;
            }
         }
      }while (flag);
      System.out.println("Redirecting to first page");
   }

}
