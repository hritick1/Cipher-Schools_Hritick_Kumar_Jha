public class DefaultConstructor {
    int arg=5;
    void myTest(int arg) { //default constructor
        this.arg=arg;
    }
    public static void main(String[] args) {
        int arg=10;
        DefaultConstructor obj=new DefaultConstructor();
        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}