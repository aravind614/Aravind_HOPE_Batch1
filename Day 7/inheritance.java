public class inheritance {
    public static void main(String[] args) {
        Dog sound=new Dog();
        Animal a=new Animal();
        a.display();
        sound.bark();
    }
}
class Animal{
    void display(){
        System.out.println("this is animal class");
    }
}

class Dog  {
    void bark(){
        System.out.println("bow bow");
    }
}
