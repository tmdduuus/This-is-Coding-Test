import java.util.Arrays;
import java.util.Scanner;

public class No_3 {
	// ���� ī�� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int num[][] = new int[N][M];
		int result = 0;
		
		for(int i=0; i<N ; i++) {
			int min = 10001; // �� ���� for�� �ۿ� ������, min���� �ι�° for�� ���ึ�� �ʱ�ȭ ���� �ʾƼ� ��Ȯ�� min, result���� ã�� ����.
			for(int j=0; j<M; j++) {
				int value = scan.nextInt();
				min = Math.min(min, value);
			}
			result = Math.max(result, min);
		}
		
		System.out.println(result);
	}

}
