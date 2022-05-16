package JavaAllTest;

public class JavaAbstractTest {
    public static void main(String[] args){
        //Person p = new Person();
        //抽象类无法实例化
        Student std = new Student();
        std.setAge(16);
        std.setHeight(186);
        std.setWeight(100);
        std.setName("XXTT");
        std.setGrade(9);
        std.PrintInfo();
        //学生XXTT
        Worker w = new Worker();
        w.setAge(22);
        w.setHeight(188);
        w.setWeight(89);
        w.setName("XXOO");
        w.setWorkAge(3);
        w.setXinShui(2000.0);
        w.PrintInfo();
        //工人XXOO
        PCWorker p = new PCWorker();
        p.setAge(26);
        p.setHeight(167);
        p.setWeight(86);
        p.setName("XXKK");
        p.setWorkAge(6);
        p.setXinShui(8000.0);
        p.setLevel(4);
        p.PrintInfo();
        //工人XXKK
    }
}
abstract class Person{
    private String name;
    private int age;
    private double height;
    private double weight;
    public String getName(){
        return name;
    }
    public int getAge(){
        if ( age < 0 || age > 200 ){
            return age = 0;
        }
        return age;
    }
    public double getHeight(){
        if ( height < 50 ){
            return height = 50;
        }
        return height;
    }
    public double getWeight(){
        if ( weight < 1.5 ){
            return weight = 1.5;
        }
        return weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public Person(){
        this.name = "无名氏";
    }
}
final class Student extends Person{
    private int grade;
    public int getGrade(){
        if (grade < 0 || grade > 12){
            return grade = 1;
        }
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public Student(){
        super();
        this.grade = 1;
    }
    public void PrintInfo(){
        System.out.println("获取学生" + this.getName() + "的基础信息:");
        System.out.println("学生" + this.getName() + "的年龄为" + this.getAge());
        System.out.println("学生" + this.getName() + "的身高为" + this.getHeight());
        System.out.println("学生" + this.getName() + "的体重为" + this.getWeight());
        System.out.println("学生" + this.getName() + "的年级为" + this.getGrade());
    }
}
class Worker extends Person{
    public String getName(){
        return "[工人]" + super.getName();
    }
    private int workAge;
    private double xinShui;
    public int getWorkAge(){
        if (workAge < 0){
            //如果工作年龄小于0则返回0
            return workAge = 0;
        } else if ((this.getAge() - 18) <= 0) {
            //如果年龄未到工作年龄返回0
            return workAge = 0;
        }
        return workAge;
    }
    public double getXinShui(){
        if (xinShui < 0){
            return xinShui = 0;
        }
        return xinShui;
    }
    public void setWorkAge(int workAge){
        this.workAge = workAge;
    }
    public void setXinShui(double xinShui){
        this.xinShui = xinShui;
    }
    public  Worker(){
        super();
        super.setAge(18);
    }
    public void PrintInfo(){
        System.out.println("获取" + this.getName() + "的基础信息:");
        System.out.println(this.getName() + "的年龄为" + this.getAge());
        System.out.println(this.getName() + "的身高为" + this.getHeight());
        System.out.println(this.getName() + "的体重为" + this.getWeight());
        System.out.println(this.getName() + "的工龄为" + this.getWorkAge());
        System.out.println(this.getName() + "的薪水为" + this.getXinShui());
    }
}
final class PCWorker extends Worker{
    public String getName(){
        return "[软件工程师]" + super.getName();
    }
    private int level;
    public int getLevel(){
        if (level < 1 || level > 5){
            return level = 1;
        }
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public PCWorker(){
        super();
        super.setAge(20);
    }
    public void PrintInfo(){
        System.out.println("获取" + this.getName() + "的基础信息:");
        System.out.println(this.getName() + "的年龄为" + this.getAge());
        System.out.println(this.getName() + "的身高为" + this.getHeight());
        System.out.println(this.getName() + "的体重为" + this.getWeight());
        System.out.println(this.getName() + "的工龄为" + this.getWorkAge());
        System.out.println(this.getName() + "的薪水为" + this.getXinShui());
        System.out.println(this.getName() + "的等级为" + this.getLevel());
    }
}