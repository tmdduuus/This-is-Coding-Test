import java.util.Scanner;

public class No_4_2 {

	// 1�� �� ������_����ȭ �ڵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int result = 0;
		
		while (true) {
            // N�� K�� ������ �������� ���� �� �������� 1�� ����
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N�� K���� ���� �� (�� �̻� ���� �� ���� ��) �ݺ��� Ż��
            if (n < k) break;
            // K�� ������
            result += 1;
            n /= k;
        }

        // ���������� ���� ���� ���Ͽ� 1�� ����
        result += (n - 1);
        System.out.println(result);
	
	}

}
