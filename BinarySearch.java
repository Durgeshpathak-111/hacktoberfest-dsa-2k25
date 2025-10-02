public class BinarySearch {
    // Returns index of target in arr, or -1 if not found
    public static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    // quick demo
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(a, 7));  // 3
        System.out.println(binarySearch(a, 4));  // -1
    }
}
