public class code7{
    public static int add(int x, int y)
    {
       int ans = x+y;
       return ans;

    }
    public static float add(float x ,float y) 
    {
        float a = x+y;
        return a;
        
    }
    public static void main(String[] args){
        int ans =add(20,30);
        float a = add (10.1f,20.2f);
        System.out.println("sum is"+ans);
        System.out.println("SUM="+a);

    
    }
}