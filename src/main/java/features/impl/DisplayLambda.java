package features.impl;

import features.NoArgument;

public class DisplayLambda {
    public static void main(String[] args) {
        NoArgument noArgument = () -> "Hello World";
        System.out.println(noArgument.display());
    }
}