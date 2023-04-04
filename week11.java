import java.util.Scanner;

class Person {
    int age;
    Person(int age) {
        if (age <= 0) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }
}

interface PersonFind {
    void find(Person p[]);
}

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Invalid input");
            return;
        }
        Person[] obj = new Person[n];
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            obj[i] = new Person(age);
        }
        PersonFind finder = (Person[] p) -> {
            int count = 0;
            for (int i = 0; i < p.length; i++) {
                if (p[i].age > 25) {
                    count++;
                }
            }
            System.out.println(count);
        };
        finder.find(obj);
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------
  
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Outer_Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String operator = scanner.next();
        scanner.close();
        
        Inner_Calculator calculator = new Inner_Calculator();
        double result = calculator.calculate(num1, num2, operator);
        
        if (Double.isNaN(result)) {
            System.out.println("Invalid input or operator!");
        } else {
            int value=(int) result;
            System.out.println(value);
        }
    }
    
    static class Inner_Calculator {
        public double calculate(int num1, int num2, String operator) {
            double result = Double.NaN;
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                if (num2 == 0) {
                    result = Double.NaN;
                } else {
                    result = (double) num1 / num2;
                }
            }
            return result;
        }
    }
    
}
-------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        if(n>2)
       {
          for(int i=0;i<n;i++)
          {
              arr[i]=sc.next();
          }
          Arrays.sort(arr);
          for(String a:arr)
          {
              System.out.println(a);
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()>5)
        {
            char str[]=s.toCharArray();
            Arrays.sort(str);
            int[] count = new int[256];
            for (int i = 0; i < str.length; i++) 
            {
            count[str[i]]++;
            }
            for (int i = 0; i < count.length; i++) 
            {
                if (count[i] > 0) {
                System.out.print((char)i + "" + count[i]);
                }
            }
       }
        else
        {
            System.out.println("Invalid Input");
        }
}}
