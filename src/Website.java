//type the website and protocol
import java.util.*;
class Website
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String url=sc.nextLine();//http:www.google.com
        String protocol=url.substring(0,url.indexOf(":"));
        if(protocol.equals("https"))
        {
            System.out.println("Hypertext transfer");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("file transfer protocol");
        }

        String ext=url.substring(url.lastIndexOf(".")+1);
        if(ext.equals("com"))
        {
            System.out.println("commercial");
        }
    }
}

