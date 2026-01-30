class student{
    int id;
    String name;
    int age;
    student(int i , String name,int age){
        id=i;
        this.name=name;
        this.age=age;
    }
    student(int i , int age)
    {
        id=i;
        this.age=age;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}
class code11
{
    public static void main(String[] args) {
        student S1 = new student(1,"alice",20);
        student S2 = new student(2,25);
        S1.display();
        S2.display();
        }
}
