package features.impl;

import features.TwoArgument;

public class ConcatenateStringTraditional implements TwoArgument {
    public static void main(String[] args) {
        ConcatenateStringTraditional concatenateStringTraditional = new ConcatenateStringTraditional();
        System.out.println(concatenateStringTraditional.concatenate("Java", "8"));
    }

    @Override
    public String concatenate(String str1, String str2) {
        return str1 + " " + str2;
    }
}