package Java01AllTest;

public class JavaKongZhiFu2 {
    public static void main(String[] args){
        //本程序讲解switch
        /*
        switch属于选择结构，也是分支语句
        语法结构:
            一个完整的switch语句应该这样编写
            switch(int or String字面值/变量){
                case int or String:
                    java语句;
                case int or String：
                    java语句
                default:
                    java语句
            }
            原理：switch会匹配数值，从上至下匹配
        */
        int a = 80;
        switch (a){
            case 80:
                System.out.println("发现异常数值:"+a);//如果匹配成功的语句中存在break;语句直接全部终止否则继续匹配
                //这是case的穿透，建议使用break！
                //++ a;//如果加这一行case会穿透
                break;//如果不加这一行,default语句也会被执行
            //case发现匹配后，下方语句全部执行
            case 90:
                System.out.println("case穿透");
            default:
                System.out.println("无异常数值");
        }
        //JDK7以及之后版本,switch可以探测int,short,long
        //case可以合并
        int b= 3;
        switch(b){
            case 1: case 2: case 3: case 4:
                System.out.println("new");
                break;
            default:
                System.out.println("new?");
        }
        String tell = "辛梓同";
        switch (tell){
            case "辛梓同":
                System.out.println("有危险人物入侵，立刻停止代码运行！");
                break;
            default:
                System.out.println("欢迎来宾！");
        }
        //这个是字符串的switch
        //switch大括号的内容不是必须的
/*        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("输入今天的星期，用数字代替：");
        int num = s.nextInt();
        switch (num){
            case 1:
                System.out.println("今天周一");
                break;
            case 2:
                System.out.println("今天周二");
                break;
            case 3:
                System.out.println("今天周三");
                break;
            case 4:
                System.out.println("今天周四");
                break;
            case 5:
                System.out.println("今天周五");
                break;
            case 6:
                System.out.println("今天周六");
                break;
            case 7:
                System.out.println("今天周日");
                break;
            default:
                System.out.println("数字不合法！");
        }*/
        java.util.Scanner d = new java.util.Scanner(System.in);
        System.out.print("输入您的成绩：");
        int grade = d.nextInt();
        switch(grade/10){
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("等级为E");
                break;
            case 6:
                System.out.println("等级为D");
                break;
            case 7:
                System.out.println("等级为C");
                break;
            case 8:
                System.out.println("等级为B");
                break;
            case 9:
                System.out.println("等级为A");
                break;
            case 10:
                switch (grade){
                    case 100:
                        System.out.println("等级为A");
                        break;
                    default:
                        System.out.println("数值不合法！");
                }
        }
    }
}
