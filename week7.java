import java.util.Scanner;

public class TestEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the correct answers
        String correctAnswers = scanner.nextLine().toUpperCase();

        // read the number of students
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // iterate over each student's answers
        for (int i = 0; i < numStudents; i++) {
            String studentAnswers = scanner.nextLine().toUpperCase();
            if (studentAnswers.length() != correctAnswers.length()) {
                System.out.println("Incorrect Input");
                return;
            }

            double score = 0.0;
            for (int j = 0; j < correctAnswers.length(); j++) {
                char correct = correctAnswers.charAt(j);
                char student = studentAnswers.charAt(j);
                if (student == 'X') {
                    continue;
                } else if (student == correct) {
                    score += 1.0;
                } else {
                    score -= 0.25;
                }
            }

            System.out.print(score + " ");
        }
    }
}
 
------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.util.Scanner;

public class WordOccurrence {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);

        String paragraph = st.nextLine().toLowerCase();

        String word = st.next().toLowerCase();

        int n = st.nextInt();

        if (n <= 0) {

            System.out.println("Incorrect Input");

            return;

        }

        int count = 0;

        int index = -1;

        int lastOccurrenceIndex = -1;

        while (true) {

            index = paragraph.indexOf(word, index + 1);

            if (index == -1) {

                break; 

            }

            count++;

            if (count == n) {

                System.out.println(index);

                return;

            }

            lastOccurrenceIndex = index;

        }

        if (count == 0) {

            System.out.println("Not Present");

            return;

        }

        System.out.println(lastOccurrenceIndex);

    }

}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        s=s.trim();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
                System.out.print(s.charAt(i));
            else
                System.out.print('$');
        }
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0 && n%13==0)
            System.out.println("True");
        else
            System.out.print("False");
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {

    
    public static boolean canBePalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                // If we have already removed a character, return false
                if (left + 1 == right) {
                    return false;
                }
                // Try removing the character at the left index
                if (str.charAt(left + 1) == str.charAt(right)) {
                    left++;
                }
                // Try removing the character at the right index
                else if (str.charAt(left) == str.charAt(right - 1)) {
                    right--;
                }
                // If we cannot make a palindrome by removing one character, return false
                else {
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcbea";
        boolean result = canBePalindrome(str);
        System.out.println(result); // Output: true
    }

}
------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            // Check if the word contains numbers
            if (word.matches(".*\\d.*")) {
                System.out.println("Invalid input");
                return;
            }
            // Reverse the word and append to StringBuilder
            sb.append(new StringBuilder(word.toLowerCase()).reverse().toString()).append(" ");
        }

        // Print the reversed string
        System.out.println(sb.toString().trim());
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        
        if (!str.matches("[a-zA-Z0-9]+")) {
            System.out.println("Error");
            return;
        }

        int[] frequency = new int[256]; 
        int maxFreq = 0; 
        char maxChar = '\0'; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++; 
            if (frequency[ch] > maxFreq || (frequency[ch] == maxFreq && ch < maxChar)) {
                maxFreq = frequency[ch];
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character is: "+maxChar);
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        String statement=input.nextLine();
        int n=input.nextInt();
        if(n<1 || n>10)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            String[] words=statement.split(" ");  
            int count=0;
            for (String word : words) 
            {
                if (word.length() == n)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
