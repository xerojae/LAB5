public class Solution{

    public int[] sortArray(int[] nums){
        if(nums == null || nums.length == 0){
            return nums; // Array is already sorted if the length is 0 or 1
        }
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] array, int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2; // Avoids overflow
            mergeSort(array, low, mid); // Sort the left half
            mergeSort(array, mid + 1, high); // Sort the right half
            merge(array, low, mid, high); // Merge the sorted halves
        }
    }

    public void merge(int[] array, int low, int mid, int high){
        // Create temp array for left and right sub-arrays
        int leftSize = mid - low + 1;
        int rightSize = high - mid;
        
        int[] left = new int[leftSize];
        int[] right = new int [rightSize];

        // Copy data to temp arrays
        for(int i = 0; i < leftSize; i++){
            left[i] = array[low + i];
        }
        for(int j = 0; j < rightSize; j++){
            right[j] = array[mid + 1 + j];
        }

        // Merge the temp arrays back into the original array
        int i = 0; // Initial indexes of the first sub-array
        int j = 0; // Initial indexes of the second sub-array
        int k = low; // Intital index of merged sub-array 
        while (i < leftSize && j < rightSize){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array, if any
        while(i < leftSize){
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right array, if any
        while(j < rightSize){
            array[k] = right[j];
            j++;
            k++;
        }
    }
}