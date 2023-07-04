package org.gx.onjava.chapter11_innerclass;

// 接口中的类

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }
    }

    public static void main(String[] args) {
        new Test().howdy();
    }
}
