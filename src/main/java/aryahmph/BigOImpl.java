package aryahmph;

public class BigOImpl implements BigO {
    @Override
    public void constant() {
        System.out.println("Learn");
        System.out.println("Data Structure");
        int x = 10;
        x *= 100;
        System.out.println(x);
    }

    @Override
    public void linear(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + "," + j);
            }
        }
    }

    @Override
    public int binarySearch(int[] array, int start, int end, int target) {
        if (start > end) return -1;
        int midIdx = (start + end) / 2;

        if (array[midIdx] == target) return midIdx;
        else if (array[midIdx] > target) return binarySearch(array, start, midIdx - 1, target);
        else return binarySearch(array, midIdx + 1, end, target);
    }
}
