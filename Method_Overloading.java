class Method_Overloading{
    static void hello(int x, int y,  int z)
    {
            System.out.println(x+y+z);
    }
    static void hello(int x, int y)
    {
        System.out.println(x+y);
    }
        
    public static void main( String args[]){
        hello(9,9);
        
    }
    
    

}