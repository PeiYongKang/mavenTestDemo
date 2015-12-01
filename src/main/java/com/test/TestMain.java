package com.test;

/**
 * Created by peiyongkang on pi.
 *  测试Test类
 */
public class TestMain {
    public static void main(String[] args) {
        Test test = new Test();
        test.setName("pi");
        test.setAge(22);
        System.out.println(test.toString());
        System.out.println(test.getName());
        System.out.println(test.getAge());
    }
}
