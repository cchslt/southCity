package com.stone.circle;

/**
 * Created by chenchen on 2016/5/15.
 */
public class TestC {
    private TestA testA;

    public void c() {
        testA.a();
    }

    public TestA getTestA() {
        return testA;
    }

    public void setTestA(TestA testA) {
        this.testA = testA;
    }
}
