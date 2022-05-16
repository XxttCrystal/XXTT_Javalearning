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
        PVZAccount pvz = new PVZAccount();
        pvz.setAccount("XXTT");
        //调用父类方法
        pvz.setLevel(6);
        pvz.setMoney(18000.0f);
        pvz.setPlayTime(16456.23);
        pvz.setWinTimes(3);
        System.out.println( "用户" + pvz.getAccount() + "包含了一个PVZ游戏，已经游玩" + pvz.getPlayTime() + "s，游戏已经通关至第" + pvz.getLevel() + "关，属于第" + pvz.getWinTimes() + "周目，账户内有" + pvz.getMoney() + "元" );
    }
}
