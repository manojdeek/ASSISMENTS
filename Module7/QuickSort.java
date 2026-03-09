package Module7;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int patitionIndex(int[]arr,int s,int e){
        int pivot=arr[s];
        int count=0;
        for(int i=s+1;i<=e;i++){// i<=e
            if (arr[i]<pivot){
                count++;
            }
        }
        int pivotIndex=s+count;
        swap(arr,pivotIndex,s);
        //let manage the left and right side of the pivot
        int i=s,j=e;
        while(i<pivotIndex && j>pivotIndex){//if left side is smaller move to next
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){//if right side is greater move to next // arr[j]>pivot
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i++,j--);
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int []arr,int s,int e){
        //base case //if single element or out of bounds
        if(s>=e){
            return;
        }
        //find the pivot for the partiton of the array
        int p=patitionIndex(arr,s,e);
        //now use the recursion to start the LHS and RHS
        //left part
        quickSort(arr,s,p-1);
        //right part
        quickSort(arr,p+1,e);
    }

    public static void main(String[] args) {
        int[] arr={8,4,7,3,10,2,6};
        int n =arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
