class student{
    int id;
    String name;
    student(int i , String name){
        id=i;
        this.name=name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}
class code10
{
    public static void main(String[] args) {
        student S1 = new student(1,"alice");
        student S2 = new student(2,"bob");
        S1.display();
        S2.display();
        }
}


