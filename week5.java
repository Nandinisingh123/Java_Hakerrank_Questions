import java.io.*;
import java.util.*;
class Employee
    {
        int Eid,Eage;
        Employee(int id, int age)
        {
            Eid=id;
            Eage=age;
        }
    }
public class Solution 
{
    
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i;
        if(n<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            
            for(i=0;i<n;i++)
            {
                int a =input.nextInt();
                int b=input.nextInt();
                Employee E=new Employee(a,b);
                if((E.Eid<10 ||E.Eid>1000)&&(E.Eage<18||E.Eage>50))
                {
                    System.out.println("Invalid data");
                }
                if(E.Eage<30)
                {
                    System.out.println(E.Eid+" "+E.Eage);
                }
            }
            
        }
        
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 5 || n > 15) {
            System.out.println("Invalid");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int choice = sc.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid");
            return;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int[] sortedArr = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            sortedArr[idx++] = num;
        }
        Arrays.sort(sortedArr);
        if (choice == 2) {
            for (int i = sortedArr.length - 1; i >= 0; i--) {
                System.out.print(sortedArr[i] + " ");
            }
        } else {
            for (int i = 0; i < sortedArr.length; i++) {
                System.out.print(sortedArr[i] + " ");
            }
        }
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

class Complex
{
    int a,b;
    Complex()
    {
        a=0;
        b=0;
    }
    Complex(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void Mul_Complex(Complex c1, Complex c2) {
        this.a = c1.a * c2.a - c1.b * c2.b;
        this.b = c1.a * c2.b + c2.a * c1.b;
    }

    public void Display() {
        System.out.println(this.a + "+" + this.b + "i");
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
         int real1 = input.nextInt();
        int imaginary1 = input.nextInt();
        Complex c1 = new Complex(real1, imaginary1);

        int real2 = input.nextInt();
        int imaginary2 = input.nextInt();
        Complex c2 = new Complex(real2, imaginary2);
        
        Complex result = new Complex();
        result.Mul_Complex(c1, c2);

        result.Display();
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;

class Complex
{
    int a,b;
    Complex()
    {
        a=0;
        b=0;
    }
    Complex(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void Mul_Complex(Complex c1, Complex c2) {
        this.a = c1.a * c2.a - c1.b * c2.b;
        this.b = c1.a * c2.b + c2.a * c1.b;
    }

    public void Display() {
        System.out.println(this.a + "+" + this.b + "i");
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
         int real1 = input.nextInt();
        int imaginary1 = input.nextInt();
        Complex c1 = new Complex(real1, imaginary1);

        int real2 = input.nextInt();
        int imaginary2 = input.nextInt();
        Complex c2 = new Complex(real2, imaginary2);
        
        Complex result = new Complex();
        result.Mul_Complex(c1, c2);

        result.Display();
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

class student
{
    String name;
    int regno;
    student()
    {
        name="null";
        regno=0;
    }
    student(String name, int regno)
    {
        this.name=name;
        this.regno=regno;
    }
    void display()
    {
        System.out.println(this.name+','+this.regno);
        
    }
}
public class Solution {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String nam;
        int reg;
        student s=new student();
        if(n==1)
        {
            nam=input.next();
            
            reg=input.nextInt();
            s=new student(nam,reg);
            System.out.println(s.name+','+s.regno);
        }
        else if(n==2)
        {
            s.display();
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int salary=20000;
        int id=input.nextInt();
        String name=input.nextLine();
        String desig=input.nextLine();
        if(id>201)
        {
            salary=salary+1000;
            System.out.println(id);
            System.out.println(name);
            System.out.println(desig);
            System.out.println(salary);
        }
        else
        {
            System.out.println("No Appraisal");
        }
        
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {
    static void factorial(int n)
    {
        int mul=1;
        for(int i=1;i<=n;i++)
        {
            mul=mul*i;
        }
        System.out.println(mul);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        if(m>=1 && m<=10)
        {
            factorial(m);
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        
        int stringCount = 0, integerCount = 0;
        for (String element : arr) {
            try {
                Integer.parseInt(element);
                integerCount++;
            } catch (NumberFormatException e) {
                stringCount++;
            }
        }
        
        System.out.println(integerCount);
        System.out.println(stringCount);
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i,sum=0;
        int[] arr=new int[n];
        double per;
        if(n<=7)
        {
           for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
            sum=sum+arr[i];
        }
        per=sum/n;
        if(per>=90)
        {
            System.out.println("A+");
                               }
        else if(per>=70 && per<=89)
                               {
                                  System.out.println("A"); 
                               }
                               else if(per>=60 && per<=69)
                               {
                                   System.out.println("B");
                               }
                               else if(per>=50 && per<=59)
                               {
                                   System.out.println("C");
                               }
                               else
                               {
                                   System.out.println("D");
                               } 
        
        
                               }
        else
        {
            System.out.println("Invalid");
        }
                               
        
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;

public class Solution {
   static boolean isBigger(int n,int m)
    {
        if(n>m)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(isBigger(a,b));
    }
}
