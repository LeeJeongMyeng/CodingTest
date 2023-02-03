package level0;

import java.util.Arrays;
import java.util.stream.Stream;

public class A02_0112 {

	
	
 public int solution1_me(int angle) {
	 /*
	  각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
	  각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
	  
	  <제한사항>
	    0 < angle ≤ 180
		angle은 정수입니다.
	  */
     int answer = 0;
     int angle2 = Math.abs(angle); //절대값
     double angle3 = 180/(double)angle2; 
     boolean check = (0<angle2&&angle<=180);
      if(check){
         if(angle3==1){
             answer=4;
         }
         else if(angle3<2){
             answer=3;
         }else if(angle3==2){
             answer=2;
         }else{
             answer=1;
         }
      }
     return answer;
 }
 public int solution1_other(int angle) {
	 int answer=0;
     int angle2 = Math.abs(angle);
     boolean check = ( 0< angle2 && angle2<=180)?true:false;
     
     if(check){
     answer = (angle2 == 180) ? 4 : (angle2>90) ? 3 : (angle2 == 90) ? 2 : (angle2<90) ? 1 :0;
     }
     return answer;
 }
//============================================================================================	
 public double solution2_me(int[] numbers) {
	 /*
	 정수 배열 numbers가 매개변수로 주어집니다.
	 numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
	 <제한사항>
		0 ≤ numbers의 원소 ≤ 1,000
		1 ≤ numbers의 길이 ≤ 100
		****정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.****
	 
	 */
	 
	 double answer = 0;
     int total=0;
     int numlen = numbers.length;
     
     for(int i=0; i<numbers.length;i++ ){
    	 total+= numbers[i];
     }
     answer = (double)total/(double)numlen;
    
     return answer;
 }
 public double solution2_other(int[] numbers) {
	 /*
	  // 메인에서 선언했을떄
	    A02_0112 dao = new A02_0112();
		Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
		Stream<Integer> list=Arrays.stream(numbers);
		System.out.println(list);
	  */
	 Stream<Integer> list=Arrays.stream(numbers).boxed();
	 return list.mapToDouble(Integer::doubleValue).average().getAsDouble();
 }
 
//============================================================================================ 
 
 public int solution4_me(int n) {
	 /*
	  정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
	  <제한사항>
		0 < n ≤ 1000
	   */
     int answer = 0;  
     for(int i=1; i<=n; i++){
         if(i%2==0){
             answer+=i;
         }
     }
     return answer;
 }
 public int solution4_other(int n) {
	 int answer = 0;
     
     for(int i=2; i<=n; i+=2){
         answer+=i;
     }
      return answer;
 }
//============================================================================================
 public int solution5_me(int n, int k) {
     //int answer = 0;
     
     //int did = 12000*n; // 양꼬치의 가격
     //int cnt = n/10; // 양10개당 음료수 1개 개수
     //int zhffk = 2000*(k-cnt); // 총음료갯수-cnt
     
     //answer = did+zhffk;
     return 12000*n+2000*(k-n/10);
 }
//============================================================================================
 public int solution6_me(int[] array, int n) {
	 
	 /*
	  정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
	   array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
	   <제한사항>
		1 ≤ array의 길이 ≤ 100
		0 ≤ array의 원소 ≤ 1,000
		0 ≤ n ≤ 1,000
	  */
     int answer = 0;
     for(int i=0; i<array.length; i++){
         if(array[i]==n){
             answer++;
         }
     }    
     return answer;
 }
 public int solution6_other(int[] array, int n) {
	 
	 int answer = 0;
	 for(int num : array) {
		 if(num==n) {
			 answer++;
		 }
	 }
	 return answer;
 }
//============================================================================================
 public int[] solution7_me(int[] num_list) {
	 /*
	  정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
	   num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
	  <제한사항>
		1 ≤ num_list의 길이 ≤ 1,000
		0 ≤ num_list의 원소 ≤ 1,000

	  */
	 int len = num_list.length;
     int[] answer = new int[len];

		 for(int i=0; i<len; i++ ){
			 answer[i]=num_list[len-1-i];
			 }
     return answer;
 }
//============================================================================================ 
 public int[] solution8_me(int[] numbers) {
	 /*
	  정수 배열 numbers가 매개변수로 주어집니다. 
	  numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
	  <제한사항>
		-10,000 ≤ numbers의 원소 ≤ 10,000
		1 ≤ numbers의 길이 ≤ 1,000
	  */
     int len = numbers.length;
     int[] answer = new int[len];
     
     for(int i=0; i<len; i++){
         answer[i] = numbers[i]*2;
     }    
     return answer;
 }

	public static void main(String[] args) {
		A02_0112 dao = new A02_0112();
		
		
		

	}

}
