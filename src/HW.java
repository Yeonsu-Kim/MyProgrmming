import java.util.Scanner;

class check{
	private int temp, loop, count =0;
	Scanner scan = new Scanner(System.in); 
	
	void inputLoop() {
		this.loop = scan.nextInt();
	}// ���� Ƚ���� �Է¹���
	
	void checkWord() {
		while(loop>0) {
			char inputWord[]= scan.next().toCharArray();// �ܾ �Է¹޾� �迭�� ����
			
			for (int i = 0;i<inputWord.length-1;i++) {
				if (inputWord[i] == inputWord[i+1])
					inputWord[i] = ' ';
			}// ���ִ� ���� ���ĺ� �� �ϳ��� ����� ��� �������� �ٲ�
			
			temp = 0;
			
			for (int i = 0;i<inputWord.length;i++) {
				for (int j = i+1; j<inputWord.length;j++) {
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
