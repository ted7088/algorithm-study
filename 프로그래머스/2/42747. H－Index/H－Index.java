import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] citaitions = new int[n];
		
		for (int i = 0; i < citaitions.length; i++) {
			citaitions[i]=sc.nextInt();
		}
		
        System.out.println(solution(citaitions));
	}
	
	public static int solution(int[] citaitions) {
		
		Arrays.sort(citaitions);
		
		int n = citaitions.length;
		
		System.out.println(n);
		
		int hIndex=0;
		
		for (int i = 0; i < n; i++) {
			int h = n-i;
			if(citaitions[i]>=h) {
				hIndex=h;
				break;
			}
		}
		
		
		return hIndex;
		
	}

}