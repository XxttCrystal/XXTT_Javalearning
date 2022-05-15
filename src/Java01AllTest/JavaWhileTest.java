package Java01AllTest;

public class JavaWhileTest {
    public static void main(String[] args){
        /*
        while
        ---语法结构
        while(布尔表达式){循环体}
        ---执行原理
        1.判断布尔表达式
        2.如果t就执行，f就结束
        3.如果循环体执行完毕就再次判断，如此往复
        ---循环次数
        根据布尔表达式计算次数，可能0次，可能死循环
        while是可能不循环的！
        这是和for的区别
        */
        //1.死循环
/*        while(false){
            System.out.println("死循环")
        }*/
        //如果true死循环下方有代码会阻止运行，编译错误（下方代码永远不会被执行）
        //如果while内是布尔表达式才不会阻止运行
        //true死循环后不可以写代码
        //原理： i > j的结果编译器不知道因为内存空间未开辟，但是不认为这是true，编译器不运算只判断（但是IDEA知道）
        //如果写 10>3 会编译错误，因为这个会进行编译检查运算，这和写变量是有区别的
        int i = 1;
        while( i < 10){
            System.out.println(i);
            ++ i ;
            System.out.println( "----->" + i );
            //这里的输出比上一个小，因为这个是自增后的数值
        }
        System.out.println("___________");//当 ++ i 执行后，i=10，循环体结束但是i已经被运算了，所以最后i的数值是10
        System.out.println(i);

        /*
        do...while
        语法结构
            do{
            }while(布尔表达式);
        执行原理
        1.先执行循环体
        2.真继续，假结束，但是循环体是先被执行的，所以至少执行一次
        循环次数
        至少1，至多无限次
        注意事项
        有分号，别丢了！
        */
        int j = 0;
        do{
            j++;
        } while ( j < 10);
        System.out.println(j);
        /*
        break是指当循环/switch中，后者防止case穿透
        前者用来终止全部循环
        continue只可以用于循环中，但是不会全部停止，是直接跳过此次循环的循环体执行直接判断下一次
        break,continue只会对本级循环进行干涉
        */
        for ( int p = 0 ; p <= 10 ; p ++ ){
            System.out.println(p);
            System.out.println("测试break");
            if ( p == 4 ){
                System.out.println("跳过本次循环！");
                System.out.println(p);
                System.out.println("__________________________________");
                continue;
            }
            if ( p == 6 ){
                System.out.println("终止循环");
                break;
            }
        }
        System.out.println("清理屏幕 \n");
        A:for ( int k = 1 ; k < 16 ; k ++ ){
            for ( int m = 1 ; m < 16 ; m ++ ){
                if ( m == 9 ) {
                    continue A;
                }
                if ( m == 12 ){
                    break;
                }
                System.out.println( "数据m数值:" + m );
            }
            System.out.println( "数据k数值:" + k );
        }//可以给for循环起名，然后可以可以在break/continue后面增加循环名字break/continue指定的循环圈
    }
}


