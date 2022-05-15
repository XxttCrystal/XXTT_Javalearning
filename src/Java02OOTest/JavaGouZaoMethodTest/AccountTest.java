package Java02OOTest.JavaGouZaoMethodTest;

public class AccountTest {

    public static void main(String[] args){
        //创建对象
        Account act1 = new Account();
        //给对象赋值
        act1.setAccount("XXTT");
        act1.setYuE(5.5f);
        System.out.println(act1.getAccount() + "账户内有" + act1.getYuE() + "元");
        Account act2 = new Account();
        //给对象赋值
        act2.setAccount("XXTT");
        act2.setYuE(-14565.5f);
        System.out.println(act2.getAccount() + "账户内有" + act2.getYuE() + "元");
    }
}
