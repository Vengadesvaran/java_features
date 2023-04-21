package features.impl;

import features.NoArgument;

public class DisplayTraditional implements NoArgument {
    public static void main(String[] args) {
        DisplayTraditional displayTraditional = new DisplayTraditional();
        System.out.println(displayTraditional.display());
    }

    @Override
    public String display() {
        return "Hello World";
    }
}