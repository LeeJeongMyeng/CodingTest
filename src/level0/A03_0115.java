package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class A03_0115 {

//========================================================================================
	   public int solution1_me(int[] array, int height) {
		   
		  /*
		   머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
		    머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
		     머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
		     
		     <제한사항>
				1 ≤ array의 길이 ≤ 100
				1 ≤ height ≤ 200
				1 ≤ array의 원소 ≤ 200
		   */
		   
	        int answer = 0;

	        for(int i=0; i<array.length; i++){
	            if(array[i]>height){
	                answer++;
	            }
	        }

	        return answer;
	    }
	 //========================================================================================	
	   public int[] solution2_me(String[] strlist) {
		   
		   /*
		    문자열 배열 strlist가 매개변수로 주어집니다.
			strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
			
			<제한사항>
			1 ≤ strlist 원소의 길이 ≤ 100
			strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.

		    */
		   
	  
	        int[] answer = new int[strlist.length];
	        int a=0;
	        for(String i: strlist){
	             answer[a]=i.length();
	                 a++;
	        } 
	        return answer;
	    }
	   
	 
		public ArrayList<Integer> solution2_other(String[] strlist) {
		  ArrayList<Integer> answer = new ArrayList<Integer>();
		        for(String str : strlist){
		            answer.add(str.length());
		        }
		        return answer;
		    }
		
		//========================================================================================	
		 public ArrayList<Integer> solution3_me(int[] num_list) {
			 
			 /*
			  정수가 담긴 리스트 num_list가 주어질 때,
			  num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	
			<제한사항>
			1 ≤ num_list의 길이 ≤ 100
			0 ≤ num_list의 원소 ≤ 1,000
			  */
			 
		        ArrayList<Integer> answer = new ArrayList<Integer>();
		        int a=0,b=0;

		        for(int i:num_list){
		            if(i%2==0){a++;}
		            else{b++;}}
		        answer.add(a);
		        answer.add(b);

		        return answer;
		    }
		 public int[] solution3_other(int[] num_list) {
			 
		        int[] answer = new int[2];
		        for(int i = 0; i < num_list.length; i++)
		            answer[num_list[i] % 2]++;

		        return answer;
		    }
		 //======================================================================================== 
		 
			    public int[] solution4_other_fail(int[] numbers, int num1, int num2) {
			    	/*
			    	정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
			    	 numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 
			    	 return 하도록 solution 함수를 완성해보세요.
			        */
			        return Arrays.copyOfRange(numbers,num1,num2+1);
			    }
		 
		 //=================================================================================
			    public int solution5_me(int n) {
			     /*
			      <피자 1단계>
			      머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
			      피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를
			      return 하는 solution 함수를 완성해보세요.

   					<제한사항>
					1 ≤ n ≤ 100
					
			      */ 
			        return (int)Math.ceil((double)n/7);
			    }
		//=================================================================================
			    public int solution6_me(int[] numbers) {
			        
			    	/*
			    	 정수 배열 numbers가 매개변수로 주어집니다.
			    	  numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
					
					제한사항
					0 ≤ numbers의 원소 ≤ 10,000
					2 ≤ numbers의 길이 ≤ 100
			    	 */
			    	
			        int first=0;
			        int second =0;
			        int index = 0;
			        
			        for(int i=0; i<numbers.length; i++){
			            if(numbers[i]>first){
			                first=numbers[i];
			                index=i;
			            }
			        } 
			        for(int i=0; i<numbers.length; i++){
			            // 해당 인덱스 제외
			            
			            if(i!=index && second<numbers[i]){
			                second=numbers[i];
			            }
			        }
			        return first*second;
			    }
			  
			        public int solution6_other(int[] numbers) {
			            
			           Arrays.sort(numbers);
			            return numbers[numbers.length-1]*numbers[numbers.length-2];
			        }
	//=======================================================================================
	     public int solution7_me(int slice,int n) {
	    	/*
	    	  머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
	    	   피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
	    	   n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를
	    	   return 하도록 solution 함수를 완성해보세요.
	    	   
	    	   제한사항
				2 ≤ slice ≤ 10
				1 ≤ n ≤ 100
	    	 */


	    	 int a=0;
	    	 boolean check = (2<=slice && slice<=10
	    			 &&1<=n && n<=100)?true:false;
	    	 if(check) {
	    		 a = (int)Math.ceil(n/(double)slice);
	    	 }
	    	 
	    	 return a;
	     }
	     
	     
	     public int solution7_other(int slice,int n) {
	    	 int a=0;
	    	 
	    	 if(slice%n==0) {
	    		 a=slice/n;
	    	 }
	    	 
	    	 return a;
	     }
	     public int solution(int slice, int n) {
	         int a=0;
	            
	            if(n%slice==0){
	                a = n/slice;
	            }else{
	                a=n/slice+1;
	            }
	            
	    	    	 return a;
	        }
	   //=======================================================================================
	     public int solution8_me(int n) {
	         /*
	          <피자 2단계>
	          머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
	           피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
	           n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
	           최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	           
	           <제한사항>
				1 ≤ n ≤ 100
	          */
	    	 
	    	 int answer = 1; // 피자 판수
	         
	         boolean a = true;
	         
	         while(a){
	             int pizza = answer*6;
	             if(pizza%n==0){
	                 a=false;
	             }else{
	                 answer++;
	             }
	         }
	         
	         
	         return answer;
	     }
	     //=======================================================================================
	     public int solution8_me(int[] array) {
	    	 /*
	    	  중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
	    	   예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
	    	   정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
	    	  */
	    	 
	         //1. sort를 이용하여 배열을 정리한다.
	         Arrays.sort(array);
	         //2. 공식을 써서 배열길이/2로 나눈값이 중앙의 값이다.( 배열은 0번부터이기 때문이다.)
	         int len = array.length/2; 
	         
	         
	             
	         return array[len];
	     }
	     
		 public static void main(String[] args) {
			// A03_0115 a= new A03_0115();
		int[] a = {1,2,3,-1,4,5,-2,6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
			 
	}

}
