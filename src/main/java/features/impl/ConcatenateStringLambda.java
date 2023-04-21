package features.impl;

import features.TwoArgument;

public class ConcatenateStringLambda {
    public static void main(String[] args) {
        TwoArgument twoArgument = (str1, str2) -> str1 + " " + str2;
        System.out.println(twoArgument.concatenate("Java", "8"));
    }
}