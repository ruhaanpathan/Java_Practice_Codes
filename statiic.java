class statiic{
static int result;
 static int fun(int a,int b,int c){
    System.out.println(a+" "+b+" "+c);
    return statiic.result;
 }
 public static void main(String arr[]){
    statiic obj1 = new statiic();
    statiic obj2 = new statiic();
    statiic obj3 = new statiic();
    fun(obj1.result=10, obj2.result=50, obj3.result=500);
    System.out.println(result);
 }
}