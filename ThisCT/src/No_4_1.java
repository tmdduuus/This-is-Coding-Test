import java.util.Scanner;

public class No_4_1 {

	// 1�� �� ������ _ ���� �ۼ��� �ڵ�
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
