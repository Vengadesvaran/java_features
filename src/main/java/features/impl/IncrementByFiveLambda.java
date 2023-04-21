package features.impl;

import features.OneArgument;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        OneArgument oneArgument = (a) -> a + 5;
        System.out.println(oneArgument.incrementByFive(20));
    }
}