class Solution {
    public void sortColors(int[] arr) {

        int i, a = 0, b = 0, c = 0, flag = 0, temp;
        int two = arr.length - 1, current = 0, zero = 0;
        while (current <= two) {
            if (arr[current] == 0) {
                temp = arr[current];
                arr[current] = arr[zero];
                arr[zero] = temp;
                zero += 1;
                current += 1;
            } else if (arr[current] == 2) {
                temp = arr[current];
                arr[current] = arr[two];
                arr[two] = temp;
                two -= 1;

            } else {
                current += 1;
            }
        }
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+",");

    }
}