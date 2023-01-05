import java.util.Arrays;
import java.util.Scanner;

public class No_3 {
	// 숫자 카드 게임

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int num[][] = new int[N][M];
		int result = 0;
		
		for(int i=0; i<N ; i++) {
			int min = 10001; // 이 행이 for문 밖에 있으면, min값이 두번째 for문 실행마다 초기화 되지 않아서 정확한 min, result값을 찾지 못함.
			for(int j=0; j<M; j++) {
				int value = scan.nextInt();
				min = Math.min(min, value);
			}
			result = Math.max(result, min);
		}
		
		System.out.println(result);
	}

}
