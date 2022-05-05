package com.DLY.java2;

public class AnimalTest {
    public void test(Animal a){
        a.cat();  //晚期绑定
    }
    public void test(Huntable h){
        h.hunt(); //晚期绑定
    }
    public void test(Dog d){
        Animal.xv();
        d.cat();
        d.hunt();
    }

}
class Animal{
    public static void xv(){
        System.out.println(1);
    }
    public void cat(){};
}
interface Huntable{
    void hunt();
}
class Dog extends Animal implements Huntable{

    @Override
    public void cat() {
        super.cat();
        System.out.println("Dog吃骨头");
    }

    @Override
    public void hunt() {
        System.out.println("多管闲事");
    }
}
class Cat extends Animal implements Huntable{
    @Override
    public void cat() {
        System.out.println("Cat吃鱼");
    }

    @Override
    public void hunt() {
        System.out.println("天经地义");
    }
}

