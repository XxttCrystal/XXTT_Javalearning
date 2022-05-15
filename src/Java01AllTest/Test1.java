package Java01AllTest;



public class Test1 {
    public static void main(String[] args){
/*
        * byte-1
        * short-2
        * int-4
        * long-8
        * float-4
        * double-8
        * boolean-1
        * char-2
 */
        int New = 32767;
        char c ='a';
        //占据 1b
        char x ='傻';
        //占据2b
        System.out.println(c);
        System.out.println(x);
        char e ='e';
        e = 'f';
        System.out.println(e);
/*
        * 转移字符！awa
        *还是char 类型哦~
        * 转意一开始我就没明白awa
        *\     <-就是他
        *
        *
*/
        char c1 = 'n';          //<- 一个无辜的n
        char c2 ='\n'; //这是一个具有换行功能的n! 看上去比较nb
        // 这是一个反斜杠~->    \:？看我干嘛a
        System.out.println("hello\nWorld");
        char c3 = '\t'; //对 我就是制表符  对       就是这样awa 你可以把我视为table(Tab),我和space(空格)不一样!我们ASCII不一样！
        System.out.println("\t制表符不错哦");
        System.out.println("\\"); //   <- 这个就是可以输出一个\的方法,\把\给转义成一个普通的\而不是可以转义的\(迷)
        System.out.println("\\n"); //<-这个就是一个输出 \n的方法！
        System.out.println("\\n是转行~");
        char c4 ='\u4e4d';
        System.out.println(c4);
        char c10 = '\u0000';
        System.out.println(c10);
        long t = 2147483648L;
        long k = 250L;
        byte b =127;
        short kk = (short) 65535;
}
}
