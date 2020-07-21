package com.belajar.java.castingclass;

public class Main2 {

    public static void main(String[] args) {

        Kucing anggora = new Kucing();

        Hewan hewan = anggora; // secara implisit upcasting
        hewan = (Hewan) anggora; // secara explisit melakukan casting dari subclass ke superclass

        Hewan hewan2 = new Kucing();
        ((Kucing) hewan2).meow(); // downcast hewan ke kucing, casting dari superclass ke subclass
    }
}
