public class ThisKeyExample {
    public static void main(String[] args) {
        Student s1=new Student("Aravind","24cs401");
        s1.display();  
    }
}
class Student{
    String name;
    String rollno;
    Student(String name,String rollno) {
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println("Name: "+this.name+"\nrollno :"+this.rollno );
        
    }
    
}
