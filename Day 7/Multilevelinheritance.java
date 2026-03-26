public class Multilevelinheritance {
    public static void main(String[] args) {
        System.out.println("Let's see food chain");
        lion l=new lion();
        l.seccarnivor();
        l.pricarnivor();
        l.herbivors();
        l.display();
    }
}
class grass{
    void display(){
        System.out.println("grass is there");
    }
}
class rabit extends grass{
    void herbivors(){
        System.out.println("grass is there so  rabit live");
    }

}
class wolf extends rabit{
    void pricarnivor(){
        System.out.println("rabit is there so wolf live");
    }
}
class lion extends wolf{
    void seccarnivor(){
        System.out.println("wolf is there so lion live");
    }
}
