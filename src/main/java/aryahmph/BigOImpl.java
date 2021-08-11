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
}
