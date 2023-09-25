package kr.ed.haebeop.test;

public class SingletonTest {
    static DoubletonService doubleService1 = new DoubletonService();
    static DoubletonService doubleService2 = new DoubletonService();
    static SingletonService singleService1 = SingletonService.getInstance();
    static SingletonService singleService2 = SingletonService.getInstance();
    public static void main(String[] args) {
        System.out.println("일반 객체의 출력");
        System.out.println(doubleService1);
        System.out.println(doubleService2);
        System.out.println("싱글톤 객체의 출력");
        System.out.println(singleService1);
        System.out.println(singleService2);
    }
}
