package com.stone.circle;

/**
 * Created by chenchen on 2016/5/15.
 */
public class TestB {
    private TestC testC;

    public void b() {
        testC.c();
    }

    public TestC getTestC() {
        return testC;
    }

    public void setTestC(TestC testC) {
        this.testC = testC;
    }
}
