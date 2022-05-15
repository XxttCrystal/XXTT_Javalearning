package Java01AllTest;

public class Test2 {
    public static void main(String[] args){
        int a = 7;
        int b = 4;
        System.out.println(a+"+"+b+"="+(a+b));
        //引用类型String
        //String是Sun在JavaSE当中提供的字符串类型,String.class
        int i = 10;
        String s = "abc";
        String name = "XxttCrystal";
        //String name = 10 错误:类型不兼容
        System.out.println("登录成功，欢迎"+name+"回来");
        //三元运算符（快到if了！）
        // 布尔表达式?表达式1：表达式2
        //比较表达1和表达2的关系，如果为真用1假则为2
        int c = 6;
        int d = 9;
        System.out.println(c > d ? c : d);//c<d,布尔值为false,输出d的结果
        System.out.println(c < d ? c / 2 : d * 5);//c<d,布尔值为true,输出c / 2的结果
        boolean male = false;
        char Sex = male ? '男' : '女';
        System.out.println(Sex);
        //char Sex = male ? '男' : "女"; 错误：类型不兼容
        male = true;
        System.out.println(male ? '男' : "女");//正确,println可以输出字符和字符串
        //String  Sexy = male ? '男' : "女";错误，类型不兼容
    }
}
