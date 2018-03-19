package quicksort;

import java.util.Random;

public class program{
	 static int N = 8;
		
	 public static void main(String[] args) {
		int i;
		int t[] =  new int[N];
		Random r = new Random();
			
		System.out.print("Before:");
		
		for(i = 0; i < N; i++){
	        t[i] = r.nextInt() % 100;
			
	        System.out.print(" " + t[i]);
		}
			
		System.out.println();
		
		quicksort(0, N-1, t);
		
		System.out.print("After:");
		
		for(i = 0; i < N; i++){
			System.out.print(" " + t[i]);
		}
		    System.out.println();
		}
		
	    static void quicksort(int low, int high, int t[]){
		    int l = low;
		    int h = high;
		    int x = t[(l + h)/2];
		    int tmp;
		    do {
		        while(t[l] < x) l++;
		        while(t[h] > x) h--;
		        if(l <= h){
		            tmp = t[l];
		            t[l] = t[h];
		            t[h] = tmp;
		            l++;
		            h--;
		        }
		    } while(l <= h);
		    if(low < h) quicksort(low, h, t);
		    if(l < high) quicksort(l, high, t);
		}
	}

