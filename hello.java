public class hello{
    int a;
    float b;
    String c;
    hello(){
        a=0;
        b=0.2f;
        c="hii";
    }
    void value(int x, float y, String z){
        a=x;
        b=y;
        c=z;
    }
public static void main(String[] args){
    hello person1 = new hello();
    System.out.println(person1.a + " " + person1.b + " " + person1.c);
    person1.value(1,1.1f,"hello");

    System.out.println(person1.a + " " + person1.b + " " + person1.c);
}
}