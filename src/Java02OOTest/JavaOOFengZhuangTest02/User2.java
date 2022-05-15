package Java02OOTest.JavaOOFengZhuangTest02;

public class User2 {
    public User2() {
        System.out.println("sjfmnsdfmsdhgfsd");
    }
    //当类体里不定义方法的时候，程序会自动给这个类空方法，也就是缺省构造类
    //建议定义无参构造，因为无参构造非常好用！
    //构造方法也可以重载
    public User2(int input){
        System.out.println(input);
    }
    private User2(int input,int output){
        System.out.println(input+output);
    }
}
