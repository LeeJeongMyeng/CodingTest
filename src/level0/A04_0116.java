package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class A04_0116 {
	
	 
		 
		  public int solution1_me(int[] dot) {
			  /*
			   사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
			   <제한사항>
					dot의 길이 = 2
					dot[0]은 x좌표를, dot[1]은 y좌표를 나타냅니다
					-500 ≤ dot의 원소 ≤ 500
					dot의 원소는 0이 아닙니다.
			   */
		        int answer=0;
		     
		        if(dot[0]>0){
		            if(dot[1]>0) answer=1;
		            else answer=4;
		        }else{
		            if(dot[1]>0) answer=2;
		            else answer=3;
		        }
		        return answer;
		    }
		 /* public int solution2_me(int[] dot) {
			  IntStream dotstream = Arrays.stream(dot).distinct();
			  //Stream<int> dotstream = Arrays.stream(dot);
			  
			  return dotstream.;
		  }*/
	
//==================================================================================================		  
		  
		  public int solution2_me(int[] array) {
			  /*
			  최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
			  최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
			  
			  제한사항
				0 < array의 길이 < 100
				0 ≤ array의 원소 < 1000
			  */
			  
			  int answer=0; //정답index용 
				int a=0;// index가 두개일경우 확인용
				int len = array.length;
				//배열중 중복값 제거하고 최대값 추출
				int max = Arrays.stream(array).distinct().max().getAsInt(); 
				System.out.println("중복제거 배열최대값:"+max);
				// 최대값+1로 배열 생성
				int[] mode = new int[max+1];
				System.out.println("mode의 배열크기"+mode.length);
				//for문을 돌면서 해당 값을 인덱스로하여 해당 카운트 저장
				for(int i=0; i<len;i++) {
					mode[array[i]]++;
				}
				//System.out.println(Arrays.toString(mode));
				int max2 = Arrays.stream(mode).max().getAsInt();
				System.out.println("mode중 최대값:"+max2);
				
				//for문으로 해당인덱스 값 추출
				for(int i=0; i<mode.length; i++) {
					if(max2==mode[i]) {
						a++;
						answer=i;
					}
				}				
				if(a>=2) {
					answer = -1;
				}
			  return answer;
		  }
		  
		  
		  public int solution2_other(int[] array) {
				int maxCount =0;
				int answer=0;
				
				Map<Integer,Integer> map= new HashMap<>();
				
				for(int num:array) {
					int count=map.getOrDefault(num,0)+1;
					if(count>maxCount) {
						maxCount=count;
						answer=num;
					}else if(count==maxCount){
						answer=-1;
					}
					map.put(num, count);
				}
				return answer;
	  }
//==================================================================================================		  
		  public int solution3_me(int n) {
			 List<Integer> list = new ArrayList<>();
			  for(int i=1; i<=n; i++) {
					if(i%2==1) {
						list.add(i);
					}
				}
				int len = list.size();
				int[] answer = list.stream().mapToInt(i->i).toArray(); //방법 1
				
				//방법2
				int[] answer2= new int[len];
				for(int i=0; i<len; i++) {
					answer2[i]= list.get(i);
				}
				
			  return answer[0];
			  //
		  }
		  
		  public int[] solution3_other(int n) {
			  
			  return IntStream.rangeClosed(0,n).filter(value->value%2==1).toArray();
			  //IntStream.rangeClosed(시작,끝) => 시작숫자부터 끝숫자까지 차례대로 생성
			  // filter( ? -> ?%2==1) => filter에 조건을 넣으면 해당 조건에 맞지않는 값은 걸러짐
			  //.toArray() =>?배열화
		  }
//=============================================================================================
	public static void main(String[] args) {
			int n=25;
		
		
			
		}
}