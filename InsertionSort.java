
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Howie
 */
public class InsertionSort {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
/* INSERTION-SORT(A)
1 for j = 2 to A.length
2    key = A[j]
3    // Insert A[j] into the sorted sequence A[1..j-1]. 
4    i = j - 1 
5    while i > 0 and A[i] > key
6       A[i+1] = A[i]
7       i = i - 1
8    A[i+1] = key
 
    
    */
     int arr[] = {7,3,9,1,4,5};
     for(int j = 1; j < arr.length; j++)
     {
         int key = arr[j];
         int i = j-1;
         System.out.println(Arrays.toString(arr));
        while(i >= 0 && arr[i] > key)
        {
            
            arr[i+1] = arr[i];
            i -= 1;
           // System.out.println(Arrays.toString(arr));

           
        }
        
        arr[i+1] = key;
        //System.out.println(Arrays.toString(arr));
     }
     //System.out.println(Arrays.toString(arr));
    }
     
    
    
}
