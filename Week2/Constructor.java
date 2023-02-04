

class Application {
    Application() {
        System.out.println("Constructor of Application");
    }
    Application(int num) {
        System.out.println(num);
    }
}
public class Constructor extends Application{
    Constructor() {
        super(20); //used to call constructor of base class
        System.out.println("Constructor of Test2");
    }
    public static void main(String[] args) {
        new Constructor();
    }
}
//if you call constructor of derived then the first constructor to be
//called will be the constructor of base and then derived. {
    


