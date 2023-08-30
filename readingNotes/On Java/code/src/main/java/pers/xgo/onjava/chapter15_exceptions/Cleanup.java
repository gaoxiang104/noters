package pers.xgo.onjava.chapter15_exceptions;
// 保证某个资源的正确清理
public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ; // 在这里执行一行一行的处理。。。
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace();
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}
