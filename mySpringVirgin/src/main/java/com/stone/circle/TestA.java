package com.stone.circle;

/**
 * Created by chenchen on 2016/5/15.
 */
public class TestA {
    private TestB testB;

    public void a(){
        testB.b();
    }

    public String aa(){
        return "success";
    }

    public TestB getTestB() {
        return testB;
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }
}
