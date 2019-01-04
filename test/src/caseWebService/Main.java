package caseWebService;

import caseImplement.AbstractColorFactory;
import caseImplement.ColorFactory;
import caseImplement.Factory;
import interfaceCase.Red;

public class Main {

    public static void main(String[] args) {

        AbstractColorFactory abstractColorFactory =new AbstractColorFactory();
        ColorFactory colorFactory=abstractColorFactory.colorFactory("Clolor");
        colorFactory.getColor("red").showValue();
        colorFactory.getColor("greed").showValue();

    }
}
