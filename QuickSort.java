//NOTES
/* Worst case occurs when pivot is always the smallest or the largest element*/
/*Time Complexity: Worst Case: O(n^2)
                   Average Case: O(nlogn)*/
/*Advantage is that no extra memory is required as in merge sort*/
import java.util.*;


public class QuickSort {
	 static int X;
	 static void random(int arr[],int low,int high) 
	 { 
	      
	        Random rand= new Random(); 
	        int pivot = rand.nextInt(high-low)+low; 
	          
	        int temp1=arr[pivot];  
	        arr[pivot]=arr[high]; 
	        arr[high]=temp1; 
	} 
    public static int partition(int arr[],int low,int high){
    	
    	if(X==1)
    		random(arr,low,high);
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low < high){
            int pidx = partition(arr,low,high);
            quicksort(arr, low, pidx-1);
            quicksort(arr, pidx+1, high);
        }
        
    }
    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	do {
	    	System.out.println("1. Randomized Quick Sort");
	    	System.out.println("2. Deterministic Quick Sort");
	    	System.out.println("3. Exit");
	    	System.out.print("Enter your choice: ");
	    	X = scan.nextInt();
	    	if(X!=3) {
		        int arr[] = {6,3,2,9,8,1};
		        int n = arr.length;
		
		        quicksort(arr,0,n-1);
		        //print
		        for (int i : arr) {
		            System.out.print(i+ " ");
		        }
		        System.out.println();
	    	}
    	}while(X!=3);
    }
}
/*Output
1. Randomized Quick Sort
2. Deterministic Quick Sort
3. Exit
Enter your choice: 1
1 2 3 6 8 9 
1. Randomized Quick Sort
2. Deterministic Quick Sort
3. Exit
Enter your choice: 2
1 2 3 6 8 9 
1. Randomized Quick Sort
2. Deterministic Quick Sort
3. Exit
Enter your choice: 3
*/