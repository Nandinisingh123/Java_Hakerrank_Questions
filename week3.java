
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        char c=input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == c) 
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double amount,interest;
        double emi;
        Scanner input=new Scanner(System.in);
        amount=input.nextInt();
        interest=(0.1*amount);
        double total=amount+interest;
        emi=total/12;
        String sf2=String.format("%.2f",emi);
        System.out.println((int)total);
        System.out.println(sf2);
        
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
        int count1=0,count2=0;
        if(s1.length()%2!=0)
        {
            System.out.println("Similar");
        }
        else
        {
            System.out.println("Not Similar");
        }
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                    System.out.print("&");
                System.out.println();
            }
        }
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n % 100 != 0) {
      System.out.println("Invalid Input");
      return;
    }
    int numOf2000Notes = n / 2000;
    n = n % 2000;
    int numOf500Notes = n / 500;
    n = n % 500;
    int numOf200Notes = n / 200;
    n = n % 200;
    int numOf100Notes = n / 100;
      
    if (numOf100Notes > 0) {
      System.out.println(numOf100Notes + " 100 Notes");
    }
    if (numOf200Notes > 0) {
      System.out.println(numOf200Notes + " 200 Notes");
    }
    if (numOf500Notes > 0) {
      System.out.println(numOf500Notes + " 500 Notes");
    }
    if (numOf2000Notes > 0) {
      System.out.println(numOf2000Notes + " 2000 Notes");
    }

  }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.util.*;
public class Solution {
     static void prime(int n) {
        int flag=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            flag=1;
            break;   
        }
            if(flag==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    static void fact(int p) {
        int i,f=1;
        for(i=1;i<=p;i++){
            f=f*i;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int choice=sc.nextInt();
        switch(choice)
      {
        case 1:
          if(a%2==0)
          {
              System.out.println("YES");
          }
          else
          {
              System.out.println("NO");
          }
          break;
          
        case 2:
          if(a%2!=0)
          {
              System.out.println("YES");
          }
          else
          {
              System.out.println("NO");
          }
          break;
        case 3:
          prime(a);
          break;
        case 4:
          fact(a);
          break;
        
        }
              
        
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid Rows");
        }
        else
        {
            for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        }
        
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        double amount,interest,emi;
        amount=input.nextDouble();
        interest=0.1*amount;
        double total=amount+interest;
        emi=total/12;
        String sf1=String.format("%.2f",emi);
        System.out.println((int)total);
        System.out.println(sf1);
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        double amount=input.nextDouble();
        int choice=input.nextInt();
        switch(choice)
        {
            case 1:double withdrawl=input.nextDouble();
                        if(withdrawl>amount)
                        {
                            System.out.println("error");
                        }
                        else
                        {
                            amount=amount-withdrawl;
                            System.out.printf("%.2f",amount);
                        }
                break;
            case 2:double deposit=input.nextDouble();
                    amount=amount+deposit;
                    System.out.printf("%.2f",amount);
                break;
            case 3:System.out.println(amount);
                break;
            default:System.out.println("Error");
        }
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            for(int i=0;i<=n;i++)
                System.out.println(i);
            System.out.println("Games End");
        }
    }
}
