package Java02OOTest.JavaOOTest01;

public class ObjectNew1 {
    public static void main( String[] args ){
        /*
        封装 继承 多态  <-------面向对象三大特征
        OOA 面向对象过程
        OOD 面向对象设计
        OOP 面向对象编程
        类和对象的概念
            什么是 类
                并非时间存在的，和对象相关联，虚拟的对象集合
                描述的是对象的共同特征，类的方法可以表述动作，类的属性可以描述状态
                属性一般是变量形式
            什么是 对象
                实际存在的，与现实对应的
                对象又被成为实例
        类的定义
            语法结构:
                修饰符列表 class 类名{}
            java语言中，所有的class都算作引用数据类型


        课程一 对象的创建和使用

        语法
            new 类名();
            new 是 Java语言的一个运算符 作用:
                创建对象，在 堆内存 内开辟新内存空间
        */


        //s:引用 引用是一个变量，保存了另一个java对象的内存地址
        //java语言中必须用引用访问堆内存中的对象的实例变量
        //读取 引用.实例变量名
        //引用 引用.实例变量名 = ~~~
        printStudent.shuXing();
    }
}
class printStudent{
    public static void shuXing(){
        Student s = new Student();
        /*
        此时address实例变量的类型被改为了一个新的类的引用数据类型，访问方式:
        如果你选择套娃式的类，访问的规律:
        第一步:引用 = new 类1()
        第二部，引用.实例变量 = new 类2()
        第三步 引用.实例变量.类2实例变量 = new 类3()
        第四步 引用.实例变量.类2实例变量.类3实例变量 = 字面值
        第五步(用输出距离) System.out.println(引用.实例变量.类2实例变量.类3实例变量)
        输出结果是字面值
        */
        s.address = new Address();
        s.age = 10;
        s.address.no = 16;
        s.address.name = "Home";
        s.name = "XxttCrystal";
        s.sex = true;
        s.studentNumber = 5;
        System.out.println(s.age);
        System.out.println(s.address.no);
        System.out.println(s.address.name);
        System.out.println(s.name);
        System.out.println(s.sex);
        System.out.println(s.studentNumber);
        //你必须先创建对象才能引用实例变量，不能直接用类名访问
    }
}