package com.jag.array;


public class BinarySearch {
	 
    public int binarySearch(int[] inputArr, int searchKey) {
         
        int startIndex = 0;
        int endIndex = inputArr.length - 1;
        
        
        while (startIndex <= endIndex) {
        	
            int midIndex = (startIndex + endIndex) / 2;
            
            int midValue = inputArr[midIndex];
            
            if (searchKey == midValue) {
                return midIndex;
            }
            
            
            if (searchKey < midValue) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
            
        }
        
        
        
        return -1;
    }
  
    public static void main(String[] args) {
         
        BinarySearch bs = new BinarySearch();
        
        //Array should be sorted order
        //O(logn)
        
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 17};
        System.out.println("Key 14's position: "+bs.binarySearch(arr, 14));
        
        
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+bs.binarySearch(arr1, 432));
    }
}
