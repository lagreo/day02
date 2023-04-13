
package day02;
   import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String str;
    	int kor;
    	int eng;
    	int math;
    	
    	
    	
    	System.out.print("이름:");
        str = input.next();
    	System.out.print("국어:");
    	kor = input.nextInt();
    	System.out.print("영어:");
    	eng = input.nextInt();
    	System.out.print("수학:");   
    	math = input.nextInt();
    	int sum;
    	sum = kor+eng+math;
    	System.out.println("=========================");
        System.out.println("이 름:"+str);
    	System.out.println("=========================");
        System.out.println("국 어:"+kor);
        System.out.println("영 어:"+eng);
        System.out.println("수 학:"+math);
    	System.out.println("=========================");
        System.out.println("합 계:"+sum);
    	System.out.println("=========================");



    


    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
