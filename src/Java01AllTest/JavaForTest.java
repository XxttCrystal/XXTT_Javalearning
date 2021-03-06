package Java01AllTest;

import javax.swing.*;

public class JavaForTest {
    public static void main(String[] args){
        /*
        for示例
        for(初始化表达式;布尔表达式;更新表达式){
         循环体
         }
         *****for循环的执行原理/过程
            1.初始化表达式，布尔表达式，更新表达式不是必须的！但是两个分号是必须的
            2.初始化表达式最先执行而且只执行一次
            3.布尔表达式结果只能是true/false
            4.for的执行过程:
                *先执行初始化表达式，只执行一次
                *判断布尔表达式
                    *真:
                          执行循环体
                          执行更新表达式
                          继续判断布尔表达式·
                                *真:
                                      执行循环体
                                      执行更新表达似乎
                                      判读布尔表达式
                                      ......
                                *假:循环结束
                    *假:循环结束
            一直执行到假
        */
        //1.输出数字1~10
        for(int i = 1 ; i <= 10 ; i ++){//更新表达式写成i = i+1或者i +=1也可以,后两者较为灵活
            System.out.println(i);

            /*
            1.执行int i = 1
            2.判断i(1) <= 10
            3.获得布尔值true
            4.执行循环体System.out.println(i) <- i=1
            5.执行更新表达式 i ++
            6.获得i新的数值2
            7.判断i(2)<= 10
            8.获得布尔值true
            9.执行循环体System.out.println(i) <- i=2
            10.执行更新表达式 i ++
            ......
            11.获得i新的数值10
            12.判断i(10)<=10
            13.获得布尔值true
            14.执行循环体System.out.println(i) <- i=10
            15.执行更新表达式i++
            16.获得i新的数值11
            17.判断i(11)<=10
            18.获得布尔值false
            19.循环结束
            */
            //另外，当你把i++放到循环体中也是可以的(也就是更新表达式不执行，但是执行了一次循环体内的i++,但是要是不写就死循环了
        }
        /*
        for(;;){
            System.out.println("只有两个分号会死循环awa，ctrl+F2结束");
        }
        */
        // 如果你了解了循环的原理，那么接下来的代码就不用太详细讲解了
        //注意,如果你只在()内声明变量，那么循环结束后变量将不存在!
        //如果你想循环之后还输出数值，请在循环之前声明变量,like this:
        int j;
        for ( j = 0 ; j  <= 10; j ++){
            //此时不是int j = 0,因为已经声明了 int j ,另一种写法是不写，但是int j必须改成 int j = 0
            System.out.println("正在加载数值"+j * 10 + "%");
        }
        System.out.println("数值是:"+j);//为什么是11而不是10？因为是先自增再判断的，所以j已经被加完了
        int k = 1;
        for ( ; k != -2147483648;k *= 2 ){//这里不用 k <= 2147483647是因为会产生一次精度缺失然后变为负数然后继续运行导致变成0然后
            //-死循环了
            System.out.println(k);
        }
        System.out.println(k);//最后一步精度缺失了，如果再进行下去就会变为死循环
        for ( int l = 1 ; l <= 100 ; l ++ ){
            if ( l % 2 != 0){
                System.out.println(l);
            }//如果找奇数不建议用这种，代码多，循环次数多，效率较低
            //此代码是演示if和for的共同使用
        }
        int w = 0;
        for ( int l = 1 ; l <= 100 ; l += 2 ){
            w += l;//一开始我的错误: int w = 0写在里面，这样每一次都会重置w让w=0，所以w写在外面让for修改w的数值而不重置
            if (l == 99){
                System.out.println(w);
            }
        }
        //另一种写法
        w = 0;//先归0
        for ( int l = 1 ; l <= 10 ; l ++ ){
            if ( l % 2 != 0){
                w += l;
                System.out.println( "w数值:" + w );//这个代码和上一个效果一样，但是这个看起来更好？反正一定要把思维开阔
                //大多数时候，代码都有更简单的写法
                //另一点，循环中的 l ,作用域是循环体内，如果你里面再写一个for循环还用 l 作为变量会编译错误，因为你声明过了
            }
            /*
             循环套循环的时候效果是什么? :
             1.执行int i = 1
             2.判断i(1) <= 10
             3.获得布尔值true
             4.执行循环体
             5.循环体中循环体执行初始化diamagnetic
             6.循环体中循环体执行...
             7.循环体中循环体结束
             8.循环体开始下一阶段
             可以理解为一个转轴上还有一个转轴，第一个转轴转一圈的时候，小转轴转n圈，然后到第二圈，小转轴再转n圈，以此类推
             假设到第二圈你可以调用这个数，以制作类似乘法表的程序
             TODO:制作乘法表程序
            */

        }
/*        int shu = 10;
        boolean isSuShu = true;//默认值
        for ( int beiCu = 2 ; beiCu < shu ; beiCu ++){
            if ( shu % beiCu != 0){
                isSuShu = false;
            }
        }
        System.out.println( isSuShu ?  shu + "是素数" : shu + "不是素数");*/
/*        for ( int i = 2 ; i <= 100 ; i ++){
            boolean isSuShu = true;
                //i: 2 3 4 5 6 7 .. 99
            panDuan:for ( int z = 2 ; z < 100 ; z ++ ){
                //beiChu: 2 3 4 5 6 7 ...  99
                if ( i % z != 0 ){
                    isSuShu = false;
                    System.out.print(z);
                    break;
                }
            }
            System.out.print( isSuShu ? i : "|" );
        }*/
        int time = 0;
        int rongLiang = 99999;
        for( int i = 2 ; i <= rongLiang ; i ++ ){
            boolean isZ = true;
            for( int p = 2 ; p < i ; p ++ ){
                if ( i % p == 0 ){
                    isZ = false;
                    break;
                }
            }
            time += isZ ? 1 : 0;
        }
        int rongLiang2 = rongLiang - 1;
        System.out.println( "在" + rongLiang2 + "个数内有" + time + "个素数");
    }
}