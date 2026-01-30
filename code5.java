public class code5{
    public static int add(int x, int y)
    {
       int ans = x+y;
       return ans;

    }
    public static void add(int x ,int y, int z) 
    {
        int a = x+y+z;
        System.out.println("SUM="+a);
        
    }
    public static void main(String[] args){
        int ans =add(20,30);
        add(10,20,0);
        System.out.println("sum is"+ans);

    
    }
}