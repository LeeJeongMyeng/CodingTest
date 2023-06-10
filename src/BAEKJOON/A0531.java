package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A0531 {

    public void A01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int Quarter = 25, Dime = 10, Nickel = 5, Penny = 1;

        for (int i = 0; i < T; i++) {
            int Qcnt = 0, Dcnt = 0, Ncnt = 0;
            int C = Integer.parseInt(br.readLine());

            Qcnt = C/Quarter;
            C %= Quarter;

            if(C!=0){
                Dcnt = C/Dime;
                C %= C%Dime;
            }

            if(C!=0){
                Ncnt = C/Nickel;
                C %= C%Nickel;
            }
            System.out.println(Qcnt+" "+Dcnt+" "+Ncnt+" "+C);
        }
    }

    public void A02() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int a = 2;
//        int point =0;
        for (int i = 0; i < N; i++) {
            a=a*2-1;
        }
        System.out.println(a*a);
    }

    public void A03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int a = 1;
        int six =6;
        int cnt =1;

        while(a<N){

            a += six*cnt++;
        }
        System.out.println(cnt);
    }

    public void A04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int  i =1;
        int tot = 0;
        int up,down;
        while (X>tot){
            tot+=i;
            i++;
        }
        if((i-1)%2==0){
            //큰수가 분모부터 시작
            down = 1 + (tot - X);
            up = (i - 1) - (tot - X);
        }else{
            // 큰수가 분자부터 시작
            down =(i - 1) - (tot - X);
            up = 1 + (tot - X);
        }
        System.out.println(up+"/"+down);
    }

    public void A05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());



        int current = (V-B)/(A-B);

        if((V-B)%(A-B)!=0) {current++;}

        System.out.println(current);
    }

    public void A06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        while (true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 || B == 0) {
                break;
            }



            if(A>B && A%B==0){
                System.out.println("multiple");
            } else if (A < B && B % A == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }

    public void A07() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int point = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                list.add(i);
            }
        }

        if(list.size()<point){
            System.out.println("0");
        }else{
            System.out.println(list.get(point-1));
        }
    }

    public void A08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        while (true){
            sb.setLength(0);
            int A = Integer.parseInt(br.readLine());
            if(A==-1) break;

            List<Integer> list = new ArrayList<Integer>();

            int tot = 0;
            for (int i = 1; i < A; i++) {
                if(A%i==0){
                    list.add(i);
                    tot+=i;
                }
            }

            sb.append(A);

            if (tot == A) {
                sb.append(" = ");
                for (int j = 0; j < list.size(); j++) {
                    sb.append(list.get(j));
                    if (j != list.size() - 1) {
                        sb.append(" + ");
                    }
                }

            } else {
                sb.append(" is NOT perfect.");
            }
            System.out.println(sb);
        }
    }
    public void A09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int cnt2 = 0;
        for (int i = 0; i < cnt; i++) {
            int A = Integer.parseInt(st.nextToken());

            boolean check = true;
            if (A > 1) {
                for (int j = 2; j < Math.sqrt(A); j++) {
                    if (A % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) cnt2++;
            }
        }
        System.out.println(cnt2);
    }


    public void A10() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] array = new boolean[N+1];

        int min = 10000;



        array[0] = true;
        array[1] = true;

        for (int j = 2; j < Math.sqrt(N); j++) {
            for(int k = j*j; k<=N; k+=j){
                array[k] = true;
            }
        }
        int sum = 0;
        for(int i=M; i <= N; i++){
            if(!array[i]){
                sum+= i;
                if(min>i) min=i;
            }

        }
        if(min == 10000){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public void A11() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count=2;
        while(N!=1){
            if(N%count==0){
                N/=count;
                System.out.println(count);
            }else{
                count++;
            }
        }

    }

}
