package Java02OOTest.JavaOOTest01;

//定义了一个公开类 Java02OOTest.JavaOOTest01.Student，一个学生模板
//属于一个学生类型-引用数据类型
public class Student {
    //学号
    int studentNumber; //成员变量
    //姓名
    String name;
    //性别
    boolean sex;
    //年龄
    int age;
    //住址
    Address address;
}//定义学生类
    /*
    学生类
        状态:学号int 名字String 性别boolean 年龄int 住址String...
        动作:吃饭睡觉学习玩...
        不手动赋值，成员变量就会有默认值
        byte short int long - 0
        float double 0.0
        boolean false
        char /u0000
        引用数据类型 null
    */
