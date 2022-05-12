package book;
class Person{
    int age;
    String name;
    void colcul(){
        int years  = 65;
    }
    void aselAnun(){
        System.out.println(age+" "+name);
    }
    void hello(){
        System.out.println("hello");
    }
}

public class MyClass {
    public static void main(String[] args) {
        Person pr1 = new Person();
        pr1.name = "Sos";
        pr1.age = 17;
        pr1.aselAnun();
        pr1.aselAnun();
        pr1.hello();
        pr1.colcul(

        );


    }
}




