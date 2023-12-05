import java.util.Scanner;
public class LeapYear{  
  public static void main(String[] args){
    checkLeapYear();
  }

  public static void checkLeapYear(){
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the year: ");
   int year = input.nextInt();

   if (isLeapYear(year)){
      System.out.println("The year you enterd is a leap year.");
   } else{
      System.out.println("The year you entered is not a leap year.");
   }
   
  }

  public static boolean isLeapYear(int year){
   return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
  }
}import java.util.Scanner;
public class LeapYear{  
  public static void main(String[] args){
    checkLeapYear();
  }

  public static void checkLeapYear(){
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the year: ");
   int year = input.nextInt();

   if (isLeapYear(year)){
      System.out.println("The year you enterd is a leap year.");
   } else{
      System.out.println("The year you entered is not a leap year.");
   }
   
  }

  public static boolean isLeapYear(int year){
   return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
  }
}
