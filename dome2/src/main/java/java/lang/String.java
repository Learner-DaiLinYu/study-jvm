package java.lang;

public class String {
    static {
        System.out.println("我是自定义的String");
    }

    public static void main(String[] args) {
        System.out.println("holle,String");
        /*
        错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
        public static void main(String[] args)
        否则 JavaFX 应用程序类必须扩展javafx.application.Application
        * */
    }
}
