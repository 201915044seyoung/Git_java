import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("몇 개의 숫자를 입력하시겠습니까? ");
		int count = sc.nextInt(); 
		
		int[] num = new int[count];
		
		for(int i=0; i<num.length; i++) { 
			System.out.print("num[" + i + "] = ");
			num[i] = sc.nextInt();
		}
		sc.close(); 
		
		
		int max = num[0]; 
		for(int i=1; i<num.length; i++) {
			if(max < num[i]) max = num[i]; 
		}
		System.out.println("최댓값 : " + max);
		
		
		int min = num[0]; 
		for(int i=1; i<num.length; i++) { 
			if(min > num[i]) min = num[i]; 
		}
		System.out.println("최솟값 : " + min);
	}
}
