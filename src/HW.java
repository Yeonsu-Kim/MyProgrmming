import java.util.Scanner;

class check{
	private int loop, count =0;
	Scanner scan = new Scanner(System.in); 
	
	void inputLoop() {
		this.loop = scan.nextInt();
	}// ���� Ƚ���� �Է¹���
	
	void checkWord() {
		while(loop>0) {
			char inputWord[]= scan.next().toCharArray();// �ܾ �Է¹޾� �迭�� ����
			int len = inputWord.length;
			
			for (int i = 0;i<len - 1;i++) {
				if (inputWord[i] == inputWord[i+1])
					inputWord[i] = ' ';
			}// ���ִ� ���� ���ĺ� �� �ϳ��� ����� ��� �������� �ٲ�
			
			int temp = 0;
			
			for (int i = 0;i<len - 1;i++) {
				for (int j = i+1; j<len;j++) {
					if (inputWord[i] != ' ' && inputWord[i] == inputWord[j])
						temp++;
				}
			}// ���� �ܾ� �� ���� ������ ���ĺ��� �ִ��� üũ
			
			if (temp == 0)
				count++;
			
			loop--;
		}
		
		System.out.println(count);
	}
}

public class HW {
	public static void main(String[] args) {
		check c = new check();
		c.inputLoop();
		c.checkWord();
	}
}
