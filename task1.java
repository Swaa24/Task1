import java.util.Scanner;

class Main
{

private static final String log_in_id="ad_min";
private static final String PW ="ad_min357";
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in); 
  System.out.println("ONLINE RESERVATION SYSTEM"); 
  System.out.print("enter your login_id:");
  String login_id = sc.nextLine();
  System.out.print("enter pw: ");
  String pw= sc.nextLine();
 if (login_id.equals(log_in_id) && pw.equals(PW))
 {
    System.out.println("your login is successful");
    boolean isrunning = true;
    while (isrunning)
    {
       System.out.println("**Menu**");
       System.out.println("//FORM FOR RESERVATION");
       System.out.println("//FORM FOR CANCELLATION");
       System.out.println("//EXIT");
       System.out.print("enter your own choice:");
       int cho_ice = sc.nextInt();
       sc.nextLine();
       switch (cho_ice)
       {
         case 1:
            res_form();
            break;
         case 2:
            cancel_form();
            break;
         case 3:
            isrunning = false;
            System.out.println("THANKS FOR USING THE RES_FORM");
            break;
        default:
            System.out.println("CHOICE IS INVALID //PLEASE TRY AGAIN");
      }
   }
}
 else
{
System.out.println("ACCESS DENIED //INVALID CREDENTIALS");
}
}

private static void res_form()
{
  Scanner sc =new Scanner(System.in);
  System.out.println("/n ***RES_FORM");
  System.out.print("enter the name:");
  String na_me = sc.nextLine();
  System.out.print("enter the train no: ");
  int tn = sc.nextInt();
  sc.nextLine();
  System.out.print("enter the type of the class that u want to choose: ");
  String ct = sc.nextLine(); 
  System.out.print("enter journey date: ");
  String doj=sc.nextLine();
  System.out.print("enter the place(form): ");
  String pl = sc.nextLine();
  System.out.print("enter the final place(to): ");
  String to = sc.nextLine();
  System.out.println("successfully completed your reservation");
}

private static void cancel_form()
{
  Scanner sc = new Scanner(System.in); 
  System.out.println("\n **CANCELLATION_FORM**");
  System.out.print("enter the pnr no:");
  String pnr_no = sc.nextLine();
  System.out.println("cancelled successfully!!!");
}
}
