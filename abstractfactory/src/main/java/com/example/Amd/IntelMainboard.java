package com.example.Amd;

import com.example.Amd.Mainboard;

/**
 * Created by Administrator on 2016/5/17.
 */
public class IntelMainboard implements Mainboard {

    public IntelMainboard() {
        System.out.println("Create IntelMainboard");
    }

    @Override
    public void installCpu() {
        System.out.println("IntelMainboard");
    }
}
