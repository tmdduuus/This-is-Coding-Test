import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No_2 {
	// ū ���� ��Ģ
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); //
		int M = scan.nextInt();
		int K = scan.nextInt();
		int num[] = new int[N];
		int total = 0;
		
		for(int i=0; i<N; i++) {
			num[i] = scan.nextInt();
		}
		
		//num �迭 ����
		Arrays.sort(num);
		
		int first = num[N-1];
		int second = num[N-2];
		
		int count = (M/(K+1))*K; // ���� ū ���ڰ� �������� Ƚ��
		
		total += (count * first);
		total += (M - count)*second;
		
		System.out.println(total);
		
		
	}

}
