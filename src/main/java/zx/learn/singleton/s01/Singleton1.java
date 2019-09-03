package zx.learn.singleton.s01;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/2
 * Time: 16:26
 * Description:
 */
public class Singleton1 {


    public static void main(String[] args) {


        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();

        assert singleton01 == singleton02;


    }

}


//恶汉式（静态变量）
class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }


//    static {
//        singleton = new Singleton();
//    }

    public static Singleton getInstance() {
        return singleton;
    }


}