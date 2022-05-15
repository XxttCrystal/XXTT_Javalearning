package Java02OOTest.JavaOOTest01;

public class CusOOTest {
    public static void main(String[] args){
        Customer c = new Customer();
        System.out.println(c.id);

/*     c = null
        System.out.println(c.id);
        产生空指针异常NullPointerException
        -空引用访问实例相关的数据
        原理:
        创建对象赋值之后，给c赋值null,c中原本的地址被更改，引用不再指向Customer
        然后Customer成为垃圾数据被垃圾回收器收走
        当你再次调用c输出的时候，由于null不指向任何一个对象为空
        运行发生错误，报错为空指针异常
        编译不报错是因为引用c内存在id属性不存在语法错误，运行报错是因为被赋值null后不指向对象被清理为空引用访问
        知道有这么一回事就行，不是难点
        */
    }
}
