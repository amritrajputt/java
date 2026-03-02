package recursion;

import java.util.Scanner;

public class Print1to5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value till you want to print: ");
    int n = sc.nextInt();
    print(1,n);
  }  
  private static void print(int start,int end){
    if(start> end) return;
    System.out.println(start);
    print(start+1, end);
  }
}
