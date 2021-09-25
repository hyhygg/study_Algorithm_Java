package chap02;
// 1,000 이하의 소수를 열거(버전 1)

public class PrimeNumber1 {
	public static void main(String[] args) {
		int counter = 0;	// 나눗셈 횟수
		
		for(int n = 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				if (n % i == 0) {	// 나누어 떨어지면 소수 아님
					break;
				}
			}
			// 소수만 찍음
			if (n == i) {
				System.out.println(n);
			}
		}
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
