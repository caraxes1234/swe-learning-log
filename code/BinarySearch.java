

public class BinarySearch {
    public static int search(int[] arr, int target) {
    int left=0;
    int right=arr.length-1;
    int mid;
    while(left<=right){
        mid= left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            left=mid+1;
        }
        else if(arr[mid]>target){
            right=mid-1;
        }
        
    }
        // your code here
        // return the index of target if found, -1 if not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        System.out.println(search(arr, 23));  // expected: 5
        System.out.println(search(arr, 2));   // expected: 0
        System.out.println(search(arr, 100)); // expected: -1
    }
}