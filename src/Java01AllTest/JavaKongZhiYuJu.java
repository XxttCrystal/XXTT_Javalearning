package Java01AllTest;

public class JavaKongZhiYuJu {
    public static void main(String[] args){
        // if switch 选择语句
        // for while  do while 循环语句
        // break  continue 控制循环语句
        // 本文件只写if
        // if被称为分支语句/条件控制语句
        // if有四种编写方式
        //
        // 1. if(布尔表达式){
        //     语句;
        //     语句;
        //     语句;
        // }
        // 当布尔表达式为true的时候才执行内部表达式！
        //
        // 2. if(布尔表达式){
        //     语句 ;
        // }else{
        //     语句;
        // }
        // 当表达式=true的时候执行上大括号，否则执行else内的
        //
        // 3. if(布尔表达式){
        //     语句;
        // }else if(布尔表达式){
        //     语句;
        // }...
        // 当表达式为true的时候执行第一个，并停止，如果为false，判断下一个语句
        // 如果为true就执行，如果仍false则全部不执行
        // Java中只要有一个if语句执行其他就全部停止
        // 4.if(布尔表达式){
        //     语句;
        // }else if(布尔表达式){
        //     语句;
        // }else{
        //     语句
        // };
        // 承接3，如果else if和if都是false，才执行else的
        // 带有else的语句一定有语句被执行
        //可以合理嵌套
        //当语句内只有一条Java语句的时候大括号可以省略
        //不推荐！只是为了能看懂
        int restaurantDistance = 500;
        int myDistance = 200;
        if (myDistance  <= restaurantDistance){
            int deltaDistance = restaurantDistance - myDistance;
            if (deltaDistance == 0){
                System.out.println("我在KFC");
            }else{
                System.out.println("去前往距我"+ deltaDistance +"米的KFC吃饭");
            }
        }else{
            System.out.println("太远了，不想去吃饭了，回家吧");
        }
        //KFC吃饭程序
        double grade = 64;
        String tell;
        if (grade < 0 || grade > 100){
            tell = "成绩不合法，请重新提交！";
        } else if (grade >= 90) {
            tell = "您的成绩为 A";
        } else if (grade >= 80) {
            tell = "您的等级为 B";
        } else if (grade >= 70) {
            tell = "您的等级为 C";
        } else if (grade >= 60) {
            tell = "您的等级为 D";
        } else {
            tell = "您的等级为 E";
        }
        System.out.println(tell);
        //System.out.println是从内存到控制台 <- 输出
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("输入你的年龄:");
        int age = s.nextInt();
        System.out.println("age=" + age);
    }
}
