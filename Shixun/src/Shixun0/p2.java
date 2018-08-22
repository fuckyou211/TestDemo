package Shixun0;

import java.util.Arrays;
import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {  
        int[] a = new int[10];
        Scanner reader = new Scanner(System.in);
        for(int i = 0;i < 10;i++)
        {
        	a[i] = reader.nextInt();
        }
       // System.out.println(Arrays.toString(a));  
        quickSort(a);  
        System.out.println(Arrays.toString(a));  
    }  
  
    public static void quickSort(int[] a) {  
        if(a.length>0) {  
            quickSort(a, 0 , a.length-1);  
        }  
    }  
  
    private static void quickSort(int[] a, int low, int high) {  
        if( low > high) {  
            return;  
        }  
        int i = low;  
        int j = high;   
        int key = a[ low ];  
        while( i< j) {  
            while(i<j && a[j] > key){  
                j--;  
            }  
            while( i<j && a[i] <= key) {  
                i++;  
            }  
            if(i<j) {  
                int p = a[i];  
                a[i] = a[j];  
                a[j] = p;  
            }  
        }  
        int p = a[i];  
        a[i] = a[low];  
        a[low] = p;  
        quickSort(a, low, i-1 );  
        quickSort(a, i+1, high);  
    }  
	
	
}
