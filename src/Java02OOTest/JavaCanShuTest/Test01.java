package Java02OOTest.JavaCanShuTest;

public class Test01 {
    public static void main( String[] args ){
        //TestOO t = new TestOO(1);
        A a = new A();
        a.notOverride(2);
        B b = new B();
        b.notOverride(6);
        b.New(3);
    }
}
class A{
    public void notOverride(int i){
        System.out.println("方法未重载，参数i:" + i);
    }
}
class B extends A{
    public void notOverride(int i){
        System.out.println("子类重写父类方法，参数还叫i:" + i );
    }
    public void New(int j){
        System.out.println(j + ":这是另一个方法，上一个是方法的重载");
    }
}
