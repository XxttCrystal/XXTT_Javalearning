package Java01AllTest;

/*
什么是方法？没有方法会怎样？
1.分析程序1的缺点
    需求是:
    三个需求都是类似的，计算两个类型数据的和，然后输出一个数据
    缺点:
    1.没有实现代码复用，不便于后期的修改
方法可以实现你的需求！
我们只需要调用(invoke)这个方法就可以了
被C语言/python称作:函数

方法的本质:
    方法就是一段代码片段，可以完成某个特定的功能并且可以重复使用
方法定义在类体中，不能flf（方法里写方法），但是方法可以定义多个，没有前后顺序(目前来看是这样的，之后不一定，还没讲）
方法体当中不可以再定义方法（但你要是用方法是可以的，比如你在main里用sumInt）
方法体内的语句有顺序,自上而下依次执行

方法教程:
结构:
修饰符列表 返回类型 方法名(形参列表){}
目前写成public static即可
如果存在static(静态的)的关键字，需要用 类名.方法名(实参列表); 的方式调用

返回值类型需要指定 可以指定为任一类型（所有的 基础数据类型 和 引用数据类型 ）
不是所有的方法都有返回值，方法执行结束后不返回数据类型，此时类型必须写成: void （不能不写！）
void : 空的，虚空的
如果你设定了返回值 你不返回/返回类型不相同 编译均会错误
返回语法:
    return 形参变量名/字面值等与设定相同的类型 ;
   返回值是void的时候不可以写 return 数值; 但是可以写return;(不返回)
！！！只要return语句执行，该方法结束(类似循环中的break），void类型中不可以填写后面的值，其他类型的需要填写
方法命名遵循驼峰命名大写（头小后打）

形参的名字是一个局部变量的名字，写法属于局部变量
你调用方法的时候必须调用和形参类型相同的数据类型否则编译报错
并且调用进去的数量必须相同

JVM中，方法只定义不会执行，也不给内存
JVM主要有三块内存（还有其他的）
    方法区内存
    堆内存
    栈内存
关于栈(stack)数据结构
    stack 是一种数据结构（存储的一种形态）
    数据算法和结构是必修课程！！！！！（但是现在还用不上）
    常见的数据结构
        数组 队列 栈 链表 二叉树 哈希表/散列表......
    Java有一套庞大的类库支撑，无需提前研究（但是这玩意还是有用）

    栈 [    栈顶元素    ] <---栈帧(永远指向栈顶元素，栈顶元素永远活跃)
        [                     ]
        [                     ]
        [                     ]
        [__栈底元素____]
     当栈顶噶了，下部的元素会上去，处于活跃状态
     属于:
        压栈/入栈/push
            有一个元素从外部进入到栈顶就叫压栈
        弹栈/出战/pop
            有一个元素从栈顶出到外部就叫弹栈
        栈数据的特点:
            先进后出，后进先出(就是一个桶，你必须从顶部放/拿)
*/
public class FangFaTestOhYear {
    public static void main(String[] args){
/*      1.
        编写程序计算10和20的和并输出
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println( a + "+" + b + "=" + c );
        请计算666，88的和然后输出
        int a1 = 666;
        int b1 = 888;
        int c1 = a1 + b1;
        System.out.println( a1 + "+" + b1 + "=" + c1 );
        请计算45654和78564的和，并且输出
        int a2 = 45654;
        int b2 = 78564;
        int c2= a2 + b2;
        System.out.println( a2 + "+" + b2 + "=" + c2 );*/
        sumInt(10,20);
        sumInt(666,888);
        sumInt(45654,78564);
        //这里的程序一定会被执行的
        FangFaTestOhYear.sumInt(3,5); //同一类里可以不用加类名前缀
        //这个的意义是;调用FangFaTestOhYear的sumInt方法，传递3 5 两个实参
        FangFaTestOhYear.sumLong(2147483647,2147483648L);
        int k = forOut( 2 , 2);
        System.out.println(k);


        //重载方法
        System.out.println(Method.sumInt(1,2));
        System.out.println(Method.sumInt(1,2,3));
        System.out.println(Method.sumInt(1.0,2.0));
        System.out.println(Method.sumInt(1L,2L));  // 此时是通过参数来判断使用的方法
        //doSome();//此方法将会无限递归！
    }
    public static void  sumInt( int a , int b ){
        int c = a + b;
        System.out.println( a + "+" + b + "=" + c );
    }
    /*
    SUN规定主方法必须用main,main会被运行，是数据的入口
    方法是有循序的，当你在main方法里调用sumInt的方法的时候main方法停止，运行sumInt的方法 ，如果sumInt里还有调用的方法,
    sumInt方法就会停止，运行下一个方法，当这个方法结束之后，回去继续执行 sumInt 的方法，运行完之后回到main方法
    自定义方法不是程序的入口
    */
    public static void sumLong( long sumLong1 , long sumLong2 ){
        System.out.println( sumLong1 + "+" + sumLong2 + "=" + ( sumLong1 + sumLong2 ) );
        //一个文件只建议定义一个class
    }
    /*
    1.方法代码片段在类加载的时候放到方法区内存里，属于.class字节码文件的一部分
    2.虽然代码片段只有一个，但是可以重复调用，调用的时候开辟空间，每次调用的时候在栈内存中分配
    3.方法运行的时候压栈，结束的时候会弹栈
    4.方法体中的局部变量在运行阶段的时候在栈中分配
    */
    public  static  int forOut ( int inputInt , int time ){
        int output = 1;
            for ( int i = 0 ; i < time ; i++ ){
                output *= inputInt;
            }
        return output;
            //只有让return必须运行才可以成功！否则编译报报报错
        //直接输出变量的时候，别忘了加括号，不然以为是变量...
    }
    /*
    方法重载 overload
    重载可以让相似的方法使用同一个方法，让代码更美观
    什么时候考虑使用方法重载?
        功能相似的时候，让方法名相同
        *功能不同的时候，不要用相同的方法名
    什么条件满足之后构成方法重载？
        1.在同一类当中
        2.方法名相同
        3.参数列表不同
            - 数量不同
            - 类型不同
            - 顺序不同（是类型的排列顺序，不是形参位置的顺序）
    方法重载和什么有关，和什么无关？
        1.和返回值类型无关，因为可以不接收方法
        2.和方法名以及参数列表有关
    */
    /*
    方法递归调用
    递归就是自己调用自己
    */
/*    public static void  doSome(){
        System.out.println("1");
        doSome();
        System.out.println("run")此代码会报错，递归十分消耗内存！
    }*/
}
