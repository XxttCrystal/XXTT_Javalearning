package Java02OOTest.ComputerOOTest;

public class ComputerOO {
    public static void main(String[] args){
        PCStudent student = new PCStudent();
        student.id = 5;
        student.name = "XXTT";
        Computer pc = new Computer();
        student.pc = pc;
        pc.color = "黑色";
        pc.xingHao = "联想拯救者";
        pc.xingHaoId = "Y7000";
        System.out.println( "我是学号为" + student.id + "的" + student.name + "\n" + "我有一台" + student.pc.color + "的" + student.pc.xingHao + student.pc.xingHaoId + "的笔记本电脑" );
    }
}
