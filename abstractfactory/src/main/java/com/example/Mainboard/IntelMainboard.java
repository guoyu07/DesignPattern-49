package com.example.Mainboard;


public class IntelMainboard implements Mainboard {

    public IntelMainboard() {
        System.out.println("Create IntelMainboard");
    }

    @Override
    public void installCpu() {
        System.out.println("IntelMainboard installCpu");
    }
}
