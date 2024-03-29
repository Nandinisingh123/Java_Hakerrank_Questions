

import java.io.*;
import java.util.*;


public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
    int number = 0;
    for (int i = input.length() - 2; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c >= '0' && c <= '9') {
        number = number * 10 + (c - '0');
      } else {
        System.out.println("Invalid Input");
        return;
      }
    }
    
    if (number < 10 || number >= 100) {
      System.out.println("Invalid Input");
      return;
    }
    
    int sumOfDigits = (number / 10) + (number % 10);
    int productOfDigits = (number / 10) * (number % 10);
    
    if (sumOfDigits + productOfDigits == number) {
      System.out.println("Special two digit number");
    } else {
      System.out.println("Not a special two digit number");
    }
  }
}
