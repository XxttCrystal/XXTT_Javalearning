package Java01AllTest;

//以下三个方法已经构成了方法重载！
//如同感觉使用一个方法一样
//让代码更加美观
public class Method {
    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static double sumInt(double a, double b) {
        return a + b;
    }

    public static long sumInt(long a, long b) {
        return a + b;
    }

    public static long sumInt(int a, int b, int c) {
        return a + b + c;
    }
}
