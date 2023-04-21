package features.impl;

import features.OneArgument;

public class IncrementByFiveTraditional implements OneArgument {
    public static void main(String[] args) {
        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
        System.out.println(incrementByFiveTraditional.incrementByFive(10));
    }

    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }
}