//find if the email id is on gmail
//find username and domain
import java.util.*;
class Check_email
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();//"programmer@gmail.com"//
        int i=str.indexOf("@");
        String username=str.substring(0,i);
        System.out.println("Username is"+ username);
        String domain=str.substring(i+1,str.length());
        System.out.println("Domain is"+ domain);
        //to check email or not
        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));
    }
}

