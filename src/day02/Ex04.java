package day02;
import java.util.Scanner;
public class Ex04 {
      public static void main(String[] args) {
    	  Scanner scanner = new Scanner(System.in);
    	  /*
    	   상수 : 한번 저장하면 변경할 수 없다.
    	   final을 앞에쓰면 한번 저장하면 바꿀수 없게 만든다.
    	   */
    	  final int num =100;
    	  //num =200;
    	  System.out.println(num);
    	  
    	  
    	  String name = "윤석주";
    	  System.out.println(name);
    	  
    	  
    	  final String KOREA ="대한민국";
    	  System.out.println(KOREA);
    	  
    	  boolean bool =true;
    	  boolean bool2 =false;
    	  System.out.println(bool);
    	  System.out.println(bool2);
    	  
    	  String addr;
    	  addr ="산골짜기";
    	  System.out.println(addr);
          
    	  int n1, n2, sum;
    	  
    	  n1=1;
    	  n2=20;
    	  sum=n1+n2;
    	  System.out.println(sum);
    	  
    	  int num1  ,num2,	sum2;
    	  num1 =scanner.nextInt();
    	  num2 =2;
    	  sum2 = num1 +num2;
    	  System.out.println(sum2);
    	  
    	  String a = null;
    	  
    
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
}
