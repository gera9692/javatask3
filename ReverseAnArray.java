1.	public class ReverseAnArray {  
2.	    public static void main(String[] args) {  
3.	        //Initialize array  
4.	        int [] arr = new int [] {1, 2, 3, 4, 5};  
5.	        System.out.println("Original array: ");  
6.	        for (int i = 0; i < arr.length; i++) {  
7.	            System.out.print(arr[i] + " ");  
8.	        }  
9.	        System.out.println();  
10.	        System.out.println("Array in reverse : ");  
11.	        //Loop through the array in reverse order  
12.	        for (int i = arr.length-1; i >= 0; i--) {  
13.	            System.out.print(arr[i] + " ");  
14.	        }  
15.	    }  
16.	}  
