package chap01;
import java.util.Scanner;
// 오른쪽 아래가 직각인 이등변 삼각형 출력

public class TriangleRB {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다");
		
		do {
			System.out.print("몇 단 삼각형입니까?");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j > n) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
