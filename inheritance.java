class Animal{
    void eat(){
        System.out.println("it will eat");
    } 


}
class Dog extends Animal{
    void bark(){
        System.out.println("it barks");
    }
}
public class inheritance{
    public static void main(String[]args){
    Dog d= new Dog();
    d.eat();
    d.bark();
    }
}