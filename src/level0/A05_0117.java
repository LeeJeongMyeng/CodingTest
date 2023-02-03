package level0;

import java.util.Arrays;

public class A05_0117 {

	
public int solution1_me(int[] sides) {
     /*
     선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
	가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
	삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
	 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
	 
	 나머지합>제일큰수=1, 아니면 2
	 
	 <제한사항>
		sides의 원소는 자연수입니다.
		sides의 길이는 3입니다.
		1 ≤ sides의 원소 ≤ 1,000
      */   
	
        
	int max = Arrays.stream(sides).max().getAsInt();
	int idx=0;
	int tot = 0;
	for(int i=0; i<sides.length;i++) {
		if(sides[i]==max) idx=i;
	}
	for(int j=0; j<sides.length;j++) {if(j!=idx) tot+=sides[j];}
	
	int answer = tot>max?1:2;
        
    return answer;
    }
public int solution1_other(int[] sides) {
	
	
	Arrays.sort(sides);
	
	int answer = sides[0]+sides[1]>sides[2]?1:2;
	
	return answer;
}
	public static void main(String[] args) {
		
		int[] sides= {1,2,3};
		
		
	}

}
