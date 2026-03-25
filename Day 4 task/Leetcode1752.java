import java.util.*;
class Leetcode1752 {
    public boolean check(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);

        if (Arrays.equals(arr, nums)) {
            return true;
        }

        int n = arr.length;

        for (int k = 1; k < n; k++) {
            List<Integer> list = new ArrayList<>();

            for (int num : arr) {
                list.add(num);
            }

            Collections.rotate(list, k);

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = list.get(i);
            }

            if (Arrays.equals(nums, a)) {
                return true;
            }
        }

        return false;
    }
}