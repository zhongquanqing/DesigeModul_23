package SingleModul;

public class SinglModul {
    //私有化改造方法，让SinglModul类无法实例化
    private SinglModul() {

    }


    //懒汉模式  不加synchronized线程不安全
    private static SinglModul singlModul1;

    public static synchronized SinglModul getLhModul() {

        return new SinglModul();
    }

    //饿汉模式  常用  它基于 classloader 机制避免了多线程的同步问题 所以不需要加synchronized
    private static SinglModul singlModul = new SinglModul();

    public static SinglModul getEhSingle() {
        return singlModul;
    }

    //加锁机制线程安全

    private static SinglModul singlModul2;

    public static synchronized SinglModul getJsModul() {

        return new SinglModul();
    }

    public void showVaule() {
        System.out.println("SinglePattern");
    }


}
