package Java02OOTest.JavaGouZaoMethodTest;
/**
 * 账户类测试
 * 这里的代码必须记下来，因为这是构造方法，记住构造方法的结构
 * 首先先private一个属性
 * 然后设置一个get方法，get方法内填上return，算作一种封装
 * 最后设置一个set方法，get方法使用this关键字
 * */
public class Account {
    /**
     * 账户名-String
     * */
    //private属性私有化
    private String account;
    /**
     * 余额-double
     * */
    private float yuE;
    /**
     * 余额账户的get方法
     * */
    public String getAccount() {
        return account;
    }
    /**
     * 余额账户的set方法
     * */
    public void setAccount(String account) {
        this.account = account;
        //这个account是上面的account，this的运用
        //什么是this?this就是当前对象
        System.out.println("账户" + this.account + "已初始化！");
    }
    /**
     * 余额的get方法
     * -这个是余额的封装设置，当余额输入小于0的时候返回0.0f这个数值
     * */
    public float getYuE() {
        if (yuE < 0){
            return 0.0f;
        }
        return yuE;
    }
    /**
    * 余额的set方法
    * */

    public void setYuE(float yuE) {
        this.yuE = yuE;
    }
    /**
     * 初始化账户，自定义初始名字为“游客账户”，余额由Java虚拟机编写（默认0.0f）
     * */
    public Account() {
        account = "游客账户";
        this.yuE = 100.0f;
        //当自动赋值的时候是在构造方法执行过程当中构造的，不是在类加载，那时候还没创建对象
        //javadoc注释写在对应代码上方
    }
}
