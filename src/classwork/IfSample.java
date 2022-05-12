package classwork;

public class IfSample {
    public static void main(String[] args) {


        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("X < Y");
        }
        x = x * 2;
        if (x == y) ;{
            System.out.println("X = Y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("X > Y");}
        if(x==y){
            System.out.println("You will not see it");
        }
    }
}