package matespaceDome;

/**
 *
 */
public class Test1 {
    public static void main(String[] args) {
        Order order=null;
        order.hello();
        System.out.println(order.count);
    }
}
class Order{
    public static int count=1;
    public static void hello(){
        System.out.println("holleWorld!");
    }
}
