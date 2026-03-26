public class Simpleinheritance {
    public static void main(String[] args) {
        System.out.println("Inide main class");
        parent p=new child();
        p.display();
    }   
}
class parent {
    int x=10;
    void display(){
        System.out.println("I am inside parent class");
    }

}
class child extends parent{
    void display1(){
        System.out.println("I am inside child class:"+x);
    }
}
