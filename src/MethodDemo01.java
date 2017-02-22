/**
 * Created by amyqing719@gmail.com on 22/02/2017.
 */
public class MethodDemo01 {
    public static void main(String[] args){
//        System.out.println(1);
        MethodDemo01 md = new MethodDemo01();
        Person per=null;
        per = new Person();
        per.age=23;
        per.name="Amy Shieh";
        per.display();
        tell();
        md.say();
        md.tell1(1,"hahaha");
        System.out.println(addNum(100));
    }
    public static void tell(){
        System.out.println("hello world");
    }
    private int say(){
        return 0;
    }
    public void tell1(int i,String n ){
        System.out.println(n);
    }
    public static int addNum(int num){
        if(num==1){
            return 1;
        }else{
            return num+addNum(num-1);
        }
    }
}

class Person{
    int age = 0;
    String name = null;
    public void display(){
        System.out.println("name:"+name+",age:"+age);
    }
}