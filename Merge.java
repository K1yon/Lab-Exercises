public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
     
        int i = 0;   
        int j = 0;      
        int k = 0;       
        
        // Merge in sorted order
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = mergeSortedArrays(arr1, arr2);
        
        // Print result: [1, 2, 3, 4, 5, 6]
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
