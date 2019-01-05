package caseWebService;

import caseImplement.AbstractColorFactory;
import caseImplement.ColorFactory;
import caseImplement.Factory;
import interfaceCase.Red;

public class Main {

    public static void main(String[] args) {

        AbstractColorFactory abstractColorFactory =new AbstractColorFactory();
        //这里我只实现颜色工厂
        ColorFactory colorFactory=abstractColorFactory.colorFactory("Clolor");
        colorFactory.getColor("red").showValue();
        colorFactory.getColor("greed").showValue();
        //有兴趣的童鞋可以实现一下图形工厂shapFactory

    }
}
