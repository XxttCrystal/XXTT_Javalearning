package Java02OOTest.JavaOOFengZhuangTest02;

public class UserTest {
    public static void main(String[] args){
        //创建User对象
        User user = new User();// <-这个 User是个构造方法名！没有实参类型
        //读取年龄数值 get
        System.out.println(user.age);
        //修改年龄数值 set
        user.age = 30;
        System.out.println(user.age);
        //修改年龄值
        user.age = -16;
        System.out.println(user.age);
        //不符合常理，age属性不安全需要升级
        //age属性可以随意访问，此属性不安全，一个User表示一个用户，用户的年龄不可能为负数
        //该程序中用户年龄为负数，程序并不会报错，这是程序的缺陷
        new User2();
        new User2(6);//构造方法的重载测试
    }
}
