package level0;

import java.util.Arrays;

public class A01_0111 {

	
	public int solution1_me(int num1,int num2) {
	/*
	 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
	 <제한사항>
		0 < num1 ≤ 100
		0 < num2 ≤ 100
	<입출력 예#1>
		num1이 3, num2가 2이므로 3을 2로 나눈 나머지 1을 return 합니다.
	<입출력 예#1>
		num1이 10, num2가 5이므로 10을 5로 나눈 나머지 0을 return 합니다.
			 */
			
		//나의 풀이
		int answer=-1;
		return answer=num1%num2;
	}
	public int solution1_other(int num1,int num2) { // 나누지않고도 할수있는 방법이 있단걸 알아두자
		//다른사람 풀이
		
		while (num1 >= num2) {
            num1 = num1 - num2;
        }
        int answer = num1;
        return answer;
	}
//=======================================================================================
	
	public int solution_minus_me(int num1,int num2) {
		/*
		 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
		 <제한사항>
			-50000 ≤ num1 ≤ 50000
			-50000 ≤ num2 ≤ 50000
		<입출력 예 #1>
		num1이 2이고 num2가 3이므로 2 - 3 = -1을 return합니다.
		<입출력 예 #2>
		num1이 100이고 num2가 2이므로 100 - 2 = 98을 return합니다.
		 */
		
		int answer = 0;
        return answer=num1-num2;
	}
	//=======================================================================================
	public int solution_boolen_me(int num1,int num2) {
		 /*
		  정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
		 <제한사항>
			0 ≤ num1 ≤ 10,000
			0 ≤ num2 ≤ 10,000
		
		<입출력 예 설명 #1>
		num1이 2이고 num2가 3이므로 다릅니다. 따라서 -1을 return합니다.
		<입출력 예 설명 #2>
		num1이 11이고 num2가 11이므로 같습니다. 따라서 1을 return합니다.
		<입출력 예 설명 #3>
		num1이 7이고 num2가 99이므로 다릅니다. 따라서 -1을 return합니다.
		  */
		
		int answer=0;
	        if(num1==num2){
	            answer=1;
	        }else{
	            answer=-1;
	        }
	        
	        return answer;
	}
	public int solution_boolen_other(int num1,int num2) {
		
		int answer=0;
		boolean check = (0<=num1 &&num1<=10000 && 0<=num2 && num2<=10000);
		
		if(check){answer=(num1==num2)?1:-1;}
		
		return answer;
	}
//==============================================================================================
	public int solution_multiply_me(int num1,int num2) {
	/*
	  정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
	    <제한사항>
			0 ≤ num1 ≤ 100
			0 ≤ num2 ≤ 100
		
		<입출력 예 #1>
			num1이 3, num2가 4이므로 3 * 4 = 12를 return합니다.
		<입출력 예 #2>
			num1이 27, num2가 19이므로 27 * 19 = 513을 return합니다.

	 */
			int answer = 1; // true/false에서 반환타입이 int형일때는 -1/1을 반환한다.
	        
	        if(0<=num1&&num1<=100 && 0<=num2&&num2<=100){
	            answer=num1*num2;
	        }
	        return answer;
		}
	
	public int solution_multiply_other(int num1,int num2) {
		
		double answerD = num1/num2;
		int answer = (int)answerD;
		return answer;
	}
//==============================================================================================
	public int solution_division_me(int num1,int num2) {
		/*
		 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
		 <제한사항>
			0 < num1 ≤ 100
			0 < num2 ≤ 100
		<입출력 예 #1>
		num1이 3, num2가 2이므로 3 / 2 = 1.5에 1,000을 곱하면 1500이 됩니다.
		<입출력 예 #2>
		num1이 7, num2가 3이므로 7 / 3 = 2.33333...에 1,000을 곱하면 2333.3333.... 이 되며, 정수 부분은 2333입니다.
		<입출력 예 #3>
		num1이 1, num2가 16이므로 1 / 16 = 0.0625에 1,000을 곱하면 62.5가 되며, 정수 부분은 62입니다.
		 */
		
	     int answer = 0;
	        boolean check = (0<=num1 &&num1<=100 && 0<=num2 && num2<=100);
	        if(check){
	        double num1D = (double)num1;
	        double num2D = (double)num2;
	        double answerD = num1D/num2D*1000;
	        answer = (int)answerD;
	        }
	        return answer;
	}
	public int solution_division_other(int num1,int num2) { //코드 줄이는 방법을 더 고민해보자
		  int answer = 0;
	      double answerD=0.0; 
	      boolean check = (0<=num1 &&num1<=100 && 0<=num2 && num2<=100);
	        if(check){
			answerD = (double)num1/(double)num2;
	        }
	        
	        return answer=(int)(answerD*1000);
	}
	
	public String solution_diviplus_fail(int numer1, int denom1, int numer2, int denom2) {
		/*
		 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
		  두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		<제한사항>
		0 <numer1, denom1, numer2, denom2 < 1,000
		<입출력 예 #1>
		1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.
		<입출력 예 #2>
		9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.
		 */
		
		
		  int[] answer = new int[2];
			int son = numer1*denom2+numer2*denom1; //분자의 값
			int mom = denom1*denom2; //분모의 값
			int maxnum = 0;
			
			for(int i=2; i<=son; i++) { //1부터 분자의 숫자까지 계속해서 반복
				if(son%i==0 && mom%i==0) { // 해당 구문이 실패해도 종료가 아니기 때문에 최대공약수를 구할수 있음.
					maxnum=i; // 최대공약수
				}
			}
			
			answer[0]= son/maxnum; //분자를 최대 공약수로 나눔 저장
			answer[1]= mom/maxnum;// 분모를 최대 공약수로 나누고 저장
			
			return Arrays.toString(answer);
	}
	public static void main(String[] args) {
			int a = -100;
			int a2 = Math.abs(a);
	        boolean b = (0<a2 &&a2<=180);
	        System.out.println(b);
	        
	        
	       
	

  
		
		
	}

}
