import java.util.Scanner;
public class FinalTest {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력할 구구단은? <(숫자,숫자) 형식으로 입력>");
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(","); 
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		for(int i = 1; i<=second; i++) {
			System.out.println(first * i);
		}
	}

}
