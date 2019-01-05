package caseWebService;


import caseImplement.AbstractFactory;
import caseImplement.AbstractFactoryProducer;

public class Main {
    public static void main(String[] args) {
        /*
        *        抽象工厂
        * */

        //构造器（用于获取工厂）
        AbstractFactoryProducer abstractFactoryProducer =new AbstractFactoryProducer();
        //根据参数type获取对应的颜色工厂
        AbstractFactory abstractFactory=abstractFactoryProducer.getFactory("shape");
        //根据参数color获取颜色类
        abstractFactory.getColor("red").showValue();
        abstractFactory.getColor("greed").showValue();
        System.out.println("gg"+abstractFactory.getClass());
        //根据参数type获取对应的图形工厂
        abstractFactory=abstractFactoryProducer.getFactory("shape");
        abstractFactory.getShape("Roundness").showValue();
        abstractFactory.getShape("Trangle").showValue();
        System.out.println("gg"+abstractFactory.getClass());
    }
}
