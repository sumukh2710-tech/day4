public class code6{
    public static int add(int x, int y)
    {
       int ans = x+y;
       return ans;

    }
    public static int add(int x ,int y, int z) 
    {
        int a = x+y+z;
        return a;
        
    }
    public static void main(String[] args){
        int ans =add(20,30);
        int a = add (10,20,0);
        System.out.println("sum is"+ans);
        System.out.println("SUM="+a);

    
    }
}