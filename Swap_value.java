class Swap_value{
    void swap(int x, int y){
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("x = "+x+" y = "+y);
    }
    void swap(char x, char y){
        char z;
        z=x;
        x=y;
        y=z;
        System.out.println("x = "+x+" y = "+y);
    }
    void swap(double x, double y){
        double z;
        z=x;
        x=y;
        y=z;
        System.out.println("x = "+x+" y = "+y);
    }
    public static void main(String args[]){
        Swap_value obj = new Swap_value();
        obj.swap(1,2);
        obj.swap('a','d');
        obj.swap(2.44,8.22);
    }
}