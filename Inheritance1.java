class animal{
    void eat(){
    System.out.println("It will Eat");
}
}
class Dog extends animal{
    void bark(){
    System.out.println("It will bark"); 
}
}
class Inheritance1{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }
}