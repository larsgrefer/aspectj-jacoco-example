package de.larsgrefer.demo.static_user_code;

public class Advised {

    public void dummy0() {
        System.out.println("dummy");
    }

    public void dummy1() {
        System.out.println("dummy1");
    }

    public void dummy2() {
        System.out.println("dummy2");
    }

    public void dummy3() {
        System.out.println("dummy3");
    }

    private static Object object = new Object();
    static {
        int i = 0;
        System.out.println(i++);
    }
}
