package valid_mountain_array;

public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr.length > Math.pow(10,4)) {
            return false;
        }
        boolean valid = true;
        int top = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i > 0) && (i < arr.length - 1)) {
                int prev = arr[i - 1];
                int cur = arr[i];
                if (cur == prev) {
                    valid = false;
                    break;
                } else if ((top > 0) && (cur > top)) {
                    valid = false;
                    break;
                } else if ((top == 0) && (cur < prev)) {
                    top = prev;
                }
            }
        }
        return valid && (top > 0);
    }
}
