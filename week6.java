import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<=10 || n>=50)
        {
            System.out.println("Invalid");
        }
        else
        {
            for(int i=2;i<n;i++) 
            {
                while(n%i==0)
                {
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
      
            if(n>2)
            {
                System.out.println(n);
            }
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n=input.nextInt();
        if (n<=0)
        {
            System.out.println("Invalid");
            return;
        }
        else
        {
            String[] arr = new String[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i]=input.next();
        }

        int num_count = 0;
        int alpha_count = 0;

        for (String s : arr) 
        {
            if (s.matches("\\d+")) 
            {
                num_count++;
            }
            else if (s.matches("[a-zA-Z]+"))
            {
                alpha_count++;
            }
        }

        System.out.println(num_count);
        System.out.println(alpha_count);
        }
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;
class Integer1 {
    private int[] arr;

    Integer1(int[] arr) {
        this.arr = arr;
    }

    int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    int multiplication() {
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }
        return mul;
    }
}



public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        
        int size = sc.nextInt();

        if (size < 0) {
            System.out.println("Invalid Array Size");
            return;
        }

        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        
        int choice = sc.nextInt();

        Integer1 integer1 = new Integer1(arr);

        switch (choice) {
            case 1:
                System.out.println(integer1.sum());
                break;
            case 2:
                System.out.println(integer1.multiplication());
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;


public class Solution {
    static boolean check(int n)
        {
            if(n%2==0 && n%3==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a<20 || a>400)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if (check(a)) 
            {
                System.out.println("True");
            } 
            else
            {
                System.out.println("False");
            }
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

class Student {
    private String name;

    public Student(Object obj) {
        if (obj instanceof String) {
            this.name = (String) obj;
        } else {
            this.name = "Unknown";
        }
    }

    public String getName() {
        return this.name;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        Student s1 = new Student(name);
        System.out.println(s1.getName());
        Student s2 = new Student(33);
        System.out.println(s2.getName());
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.util.Scanner;
public class MrsJhunjhunwala {

    public static double[] average_marks(double[][] marks) {
        int n = marks.length;
        double[] averages = new double[n];
        
        for (int i = 0; i < n; i++) {
            // Find the indices of the best 2 academic tasks for this student
            int maxIndex1 = 0;
            int maxIndex2 = 1;
            if (marks[i][1] > marks[i][0]) {
                maxIndex1 = 1;
                maxIndex2 = 0;
            }
            for (int j = 2; j < marks[i].length; j++) {
                if (marks[i][j] > marks[i][maxIndex1]) {
                    maxIndex2 = maxIndex1;
                    maxIndex1 = j;
                } else if (marks[i][j] > marks[i][maxIndex2]) {
                    maxIndex2 = j;
                }
            }
            
            // Calculate the average of the best 2 academic tasks for this student
            double sum = marks[i][maxIndex1] + marks[i][maxIndex2];
            double average = sum / 2.0;
            averages[i] = average;
        }
        
        return averages;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
            }
        }
        
        double[] averages = average_marks(marks);
        for (double average : averages) {
            System.out.print(average + " ");
        }
        System.out.println();
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read in the first array
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Read in the second array
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Read in the third array
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        // Find the common elements in the three arrays
        Set<Integer> common = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < n2; i++) {
            set2.add(arr2[i]);
        }
        for (int i = 0; i < n3; i++) {
            int elem = arr3[i];
            if (set1.contains(elem) && set2.contains(elem)) {
                common.add(elem);
            }
        }

        // Convert the common elements set to an array and sort it in ascending order
        int[] result = new int[common.size()];
        int index = 0;
        for (int elem : common) {
            result[index++] = elem;
        }
        Arrays.sort(result);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;

class Employee {
    int id,age;
    Employee(int id,int age)
    {
        this.id = id;
        this.age = age;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1 || n>10)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        Employee empArr[] = new Employee[n];
        for(int i = 0;i<n;i++)
        {
            int id = sc.nextInt();
            int age = sc.nextInt();
            if(id<10 || id>1000 || age<18 || age>50)
            {
                System.out.println("Invalid data");
                System.exit(0);
            }
            else
                empArr[i] = new Employee(id,age);
        }
        int mini = 0;
        for(int i = 0;i<n;i++)
        {
            if(empArr[i].age<empArr[mini].age)
                mini = i;
        }
        if(empArr[mini].age<30)
            System.out.println(empArr[mini].id+" "+empArr[mini].age);
        
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student {
    String name;
    int registrationNo;

    void show() {
        System.out.println(name + "," + registrationNo);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                student.name = scanner.next();
                student.registrationNo = scanner.nextInt();
                while (student.registrationNo <= 0) {
                    student.registrationNo = scanner.nextInt();
                }
                student.show();
                break;
            case 2:
                student.show();
                break;
            default:
                System.out.println("Wrong Choice");
        }
        scanner.close();
    }
}
