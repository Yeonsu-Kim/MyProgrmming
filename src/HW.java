import java.util.Scanner;

class check{
	private int loop, count =0;
	Scanner scan = new Scanner(System.in); 
	
	void inputLoop() {
		this.loop = scan.nextInt();
	}// 루프 횟수를 입력받음
	
	void checkWord() {
		while(loop>0) {
			char inputWord[]= scan.next().toCharArray();// 단어를 입력받아 배열에 저장
			int len = inputWord.length;
			
			for (int i = 0;i<len - 1;i++) {
				if (inputWord[i] == inputWord[i+1])
					inputWord[i] = ' ';
			}// 모여있는 같은 알파벳 중 하나만 남기고 모두 공백으로 바꿈
			
			int temp = 0;
			
			for (int i = 0;i<len - 1;i++) {
				for (int j = i+1; j<len;j++) {
					if (inputWord[i] != ' ' && inputWord[i] == inputWord[j])
						temp++;
				}
			}// 남은 단어 중 같은 종류의 알파벳이 있는지 체크
			
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
