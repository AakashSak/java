//import java.util.*;
//public class AadharObjectGenerator
//{
//   static AadharObject person1 = new AadharObject("Vaishnav","Tamil-Nadu",9908765432L,908765432345L);
//   static AadharObject person2 = new AadharObject("Hari","Tamil-Nadu",8907654322L,902345678908L);
//
//    static AadharObject [] applicants = {person1,person2};
//    static Scanner ref = new Scanner(System.in);
//
//
//    public static void main(String[] args) {
//        boolean Applications = true;
//        do{
//            boolean flag = true;
//            System.out.println("\t\t\tWelcome to Aadhar Portal");
//            System.out.println();
//            System.out.println("1.Get Info\n2.Set info");
//            int input = ref.nextInt();
//            switch (input)
//            {
//                case 1:{//get infor
//                    boolean flag = true;
//                    do {
//                        System.out.println("\t\t\tGet Info");
//                        System.out.println();
//                        for (int i = 0; i < applicants.length; i++)
//                        {
//                            System.out.println((i+1)+applicants[i].getName());
//                            System.out.println("3.Exit");
//                            System.out.println("Select the input");
//                            int input = ref.nextInt()-1;
//                            if (index < 2)
//                                getInfo(index);
//                            if (index==2)
//                                getInfo(index);
//                        }
//
//                } while (flag);
//                    break;}
//
//                case 2:{
//                    boolean flag = true;
//                    do {
//                        System.out.println("\t\t\tSet Info");
//                        System.out.println();
//                        for (int i = 0; i < applicants.length; i++)
//                        {
//                            System.out.println((i+1)+applicants[i].getName());
//                            System.out.println("3.Exit");
//                            System.out.println("Select the input");
//                            int index = ref.nextInt()-1;
//
//                        }
//
//                    }while (flag);
//                    break;}
//
//                case 3 :{
//                    Applications =false;
//                    break;
//                }
//            }
//        }
//        while (Applications);
//        System.out.println("\t\t\t Thank you");
//    }
//    public void getInfo(int index)
//
//    {boolean flag = true;
//        do {
//            System.out.println("Enter Your Input");
//            System.out.println("1.Address\n2.Contact");
//            System.out.println("3.Aadhar-No\n4.Exit");
//            int input = ref.nextInt();
//            switch (input)
//            {
//                case 1:{
//                    System.out.println(applicants[index].getAddress());
//                    break;}
//                case 2:{
//                    System.out.println(applicants[index].getContact());
//                    break;}
//                case 3:{
//                    System.out.println(applicants[index].getAadharNo());
//                    break;}
//                case 4:{
//                    flag =false;
//                    break;}
//            }
//        }while (flag);
//        System.out.println("Redirecting to prevous page");
//    }
//
//    public void setInfo(int index);
//        boolean flag = true;
//    {
//        do {
//            System.out.println("Enter Your Input");
//            System.out.println("1.Address\n2.Contact");
//            System.out.println("3.Name\n4.Exit");
//            int input = ref.nextInt();
//            switch (input)
//            {
//                case 1 :{
//                    break;}
//                case 1 :{break;}
//                case 1 :{break;}
//            }
//
//
//        }while (flag);
//        System.out.println("Redirecting to previous page");
//    }
//}