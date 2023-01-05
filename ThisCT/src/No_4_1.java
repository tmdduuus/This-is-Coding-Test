import java.util.Scanner;

public class No_4_1 {

	// 1이 될 때까지 _ 내가 작성한 코드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int count = 0;
		
		while(N != 1) {
			if(N % K == 0) {
				N = N/K;
			}else {
				N--;
			}
			count++;
		}
		
		System.out.println(count);
	}

}
