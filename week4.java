import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        String[][] data = {
            {"Java", "4", "Shruti"},
            {"OS", "3", "Puneet Kumar"},
            {"AI", "2", "James William Android"},
            {"Android", "3", "Md. Adil Khan"},
        };
        int c=0;
        String a=obj.next();
        for(int i=0;i<=3;i++)
        { 
            if(a.equals(data[i][0]))
            {
                System.out.println(data[i][2]+" "+data[i][1]);
            }
            else{
                c=c+1;
            }
        }
        
        if(c==4)
        {
            System.out.println("This subject is not running in this semester.");
        }
        
        
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] marks=new int[10];
        int sum=0;
        if(n<=0)
        {
            System.out.println("Invalid");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                marks[i]=input.nextInt();
            }
            for(int j=1;j<=n;j++)
            {
                sum=sum+marks[j];
            }
            System.out.println(sum);
        }
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------
 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n,flag=0;
        n=input.nextInt();
        int i;
        float arr[]=new float[n];
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextFloat();
            if(arr[i]<0)
            {
                flag=1;
            }
        }
        
            if(flag==1)
            {
                System.out.println("Invalid Array Elements");
            }
            else
            {
                for(i=0;i<n;i++)
                {
                    System.out.println((int)arr[i]);
                }
            }
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTests = input.nextInt();

        for (int i = 0; i < numTests; i++) {

            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += input.nextInt();
            }

            if (total == 56) {
                System.out.println(1); // Win
            } else {
                System.out.println(0); // Loss
            }
        }

        input.close();
    }
}

------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,i,flag=0;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
            if(arr[i]<0)
            {
                flag=1;
            }
        }
        int max=arr[0];
        int smax=arr[0];
        for(i=0;i<n; i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
            if(arr[i]!=max)
            {
                if(arr[i]>smax)
                smax=arr[i];
            }
        }
        if(flag==1)
        {
            System.out.println("Invalid Array Elements");
        }
        else
        {
            System.out.println(smax);
        }
        
        
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n,i;
        n=input.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(i=0;i<n;i++)
        {
            arr1[i]=arr[i];
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,i,sum=0;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
enum time 
{
    Monday("8:30", "5:30"),
    Tuesday("8:30", "5:30"),
    Friday("8:30", "5:30"),
    Saturday("9:30", "4:30");
    String intime, outtime;
    time(String intime, String outtime) 
    {
        this.intime = intime;
        this.outtime = outtime;
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        time t = null;
        try 
        {
            t = time.valueOf(day);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Library is closed");
        }

        if (t != null) 
        {
            System.out.println(t.intime + " " + t.outtime);
        }
    }
}
   
-----------------------------------------------------------------------------------------------------------------------------------------------------
  import java.util.Scanner;

public class SubjectMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSubjects = scanner.nextInt();

        double[][] marks = new double[numSubjects][];
        for (int i = 0; i < numSubjects; i++) {
            int numTasks = scanner.nextInt();

            marks[i] = new double[numTasks];
            for (int j = 0; j < numTasks; j++) {
                marks[i][j] = scanner.nextDouble();
            }
        }

        int subjectNum = scanner.nextInt();

        double sum = 0.0;
        int numTasks = marks[subjectNum-1].length;
        for (int i = 0; i < numTasks; i++) {
            sum += marks[subjectNum-1][i];
        }
        double avg = sum / numTasks;

        System.out.println("Average in Subject-" + subjectNum + " is " +avg);
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a1=input.nextLine();
        String a2=input.nextLine();
        int count=0,i,j;
        String st[] = a1.split(" ");
        String st1[] = a2.split(" ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
            if(st[i].equals(st1[j]))
            {           
                count++;
            }          
            }
        }
        System.out.println(count);
    }
}
