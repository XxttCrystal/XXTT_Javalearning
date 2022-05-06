public class ShuJuLeiXingCeShi2 {
    public static void main(String[] srgs){
/*
        float m = 1.2f; //<- 无类型转换
        float md = (float)12;
        System.out.println(md);
        long g = 10;
        byte h =(byte)((int)g/3);
        byte kkk = 4;
        byte mkk;
        mkk = (byte)(kkk / 3);
        System.out.println(mkk);
        short mkmkmk = 3;
        short jk = (short)(mkmkmk  + g);
        char io ='a';
        int mdkk = io + 4;
        System.out.println(mdkk);*/
        /*
        1.+2.byte short int long float double char可以互相转化，其中 char = short,其余按照序从小到大;
        3.大桶装进小桶里需要强制转化，会有精度损失，强制转化后编译期即使正确，实际的效果也可能
        -不如所期待的;
        4.当int,long的数值没有超过byte short char的时候可以直接倒入，但是int和long不行;
        5.byte short char三者间互相转化的时候需要转换成int;
        6.其他的遵守小桶变大桶原则进行运算。 （小容量变成大容量！）
        下面是运算符学习
        算数运算符:
         + - * / %取模/取余           ++自增(1) --自减(1)
         运算符有优先级，符合四则运算规则！
         存在(),不存在[],{},后两者均可以用()代替!,提高计算优先级
        */
/*        int i = 10;
        int j = 3;
        System.out.print( i + j );//13
        System.out.print( i - j );//7
        System.out.print( i * j );//30
        System.out.print( i / j );//3
        System.out.print( i & j );//2
        System.out.print("\n");*/
        //++的学习
        int k = 20;
        k ++;
        int y =123;
        ++ y;
        //单目运算符
        System.out.println(k);
        System.out.println(y);
        //++无视数值前后的位置，一定自增
        int a = 10;
        int b = a++;//先赋值，后运算，所以b=100,a=101
        System.out.println(a);
        System.out.println(b);

        int m = 20;
        int n = ++m;
        System.out.println(n);//先自增再复制,b=21,a=21
        System.out.println(m);
        //总结:++一定自增，变量前的时候再赋值后变量自增，否则后变量不增

        int o = 35;
        System.out.println(o ++);
        //println也是赋值，本质和 int m =20, int n = m ++的结果n=20,m=21一样，所以想要自增输出放前面
        System.out.println(++ o);//o=37(先加后输出)
        System.out.println(o);//可以理解为反应慢半拍，o=37
        System.out.println( m > o );
        /*
        *  &与
        *  |或
        *  !非
        *  ^异或
        *
        *  &&短路与
        *  ||短路或
        *
        *
        * 1.算子为boolean
        * t&t=t , t&f=f
        * t|t,t|f = t ,f|f=f
        * !t = f !f = t (单目)
        * t^t=f,f^f=f,t^f=t,f^t=t(相等f,不等t)
        *
        * 2.&&,||看例子
        * */
        System.out.println( 5 > 3 & 5 > 2);//先两遍后中间
/*        int p = 10;
        int u = 8;
        System.out.println( u < p & ++u < y);
        System.out.println(u);*/
        int p = 10;
        int u = 8;
        System.out.println( p < u && ++p < u);
        System.out.println(p);//&&是前f就停止运算! //可得||是前t就停

        System.out.println(p > u || p < ++u);//p>u=t,++u 不运算
        System.out.println(u);
        //大多时候用&&，||，但是和具体环境有关！！！

        //其他运算符
        //= += -= *= /= %= 后四者先算后赋值
        int num  = 2;
        num %= 3;
        System.out.println(num);

        int i = 20;
        i = i + 5;
        System.out.println(i);
        i -= 5;
        System.out.println(i);
        System.out.println("___________________________________________");
        byte f = 10;
        //f = f + 10错误，类型不对
        f += 10;//语法不错, f+=5 == f = (byte)(f + 5),这个属于强转，加数过大会损失精度！
        System.out.println(f);//不改变数据类型
    }
}
