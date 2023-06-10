package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A0602 {
    public void A01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] A1 = new int[2];
        int[] A2 = new int[2];
        int[] A3 = new int[2];

        int x,y;

        st = new StringTokenizer(br.readLine());
        A1[0] = Integer.parseInt(st.nextToken());
        A1[1] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        A2[0] = Integer.parseInt(st.nextToken());
        A2[1] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        A3[0] = Integer.parseInt(st.nextToken());
        A3[1] = Integer.parseInt(st.nextToken());

        if(A1[0]==A2[0]){
            x = A3[0];
        } else if (A1[0]==A3[0]) {
            x = A2[0];
        }else{
            x = A1[0];
        }

        if(A1[1]==A2[1]){
            y = A3[1];
        } else if (A1[1]==A3[1]) {
            y = A2[1];
        }else{
            y = A1[1];
        }

        System.out.println(x+" "+y);
    }

    public void A02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int maxX=-10000,minX=10000,maxY=-10000,minY=10000;
        int[][] A = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i][0] = Integer.parseInt(st.nextToken());
            A[i][1] = Integer.parseInt(st.nextToken());
            maxX = Math.max(maxX,A[i][0]);
            maxY = Math.max(maxY,A[i][1]);
            minX = Math.min(minX,A[i][0]);
            minY = Math.min(minY,A[i][1]);

        }
        System.out.println((maxX-minX)*(maxY-minY));
    }

    public void A03() throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String result = "Error";

        boolean check1 = A + B + C == 180;

        if(check1){
            if (A == B && A != C || A != B && B == C || A == C && B != C) {
                result = "Isosceles";
            } else if (A == B && A == C) {
                result = "Equilateral";
            } else {
                result = "Scalene";
            }
        }

        System.out.println(result);
    }

    public void A04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int[] array = {
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            };

            if (Arrays.stream(array).sum() == 0) break;

            int max = Arrays.stream(array).max().getAsInt();
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if(max==array[i]){
                    index = i;
                    break;
                }
            }

            int[] array2 = new int[3];

            for (int i =0; i<array2.length; i++) {
                if(i!=index){
                    array2[i] = array[i];
                }else{
                    array2[i] = 0;
                }
            }

            int sum = Arrays.stream(array2).sum();

            if(max>=sum){
                System.out.println("Invalid");
            }else{
                if(array[0]!=array[1] && array[1]!=array[2] && array[0]!=array[2]){
                    System.out.println("Scalene ");
                } else if (array[0]==array[1] && array[1]==array[2]) {
                    System.out.println("Equilateral");
                }else{
                    System.out.println("Isosceles ");
                }
            }

        }

    }
}
