package day01;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};	
		int b[] = new int[5];
		
		// ���ڸ� 5�� �Է¹ް� arr �迭�ȿ� �Է��Ѱ��� ���������� 
		// b�迭�ȿ� �ش� ���� �ε����� ���ʴ�� �����ҷ��� �Ѵ�. 
		// ����) ���࿡ �Է��� ���ڰ� arr �� ������ �ε��� ��� -1 ���� 
	
		// ��) 10, 20, 10, 1, 50
		//  b ={0,1,0,-1,4}
		
		// ��)  30, 40, 1, 10, 2
		
		// b = {2,3,-1,0,-1}
		int arrr[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arrr[i]=scan.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			if(arrr[i]==arr[i]) 
				b[i]=arr[i];
			else b[i]=-1;
		}
		for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		
		
	}

}
