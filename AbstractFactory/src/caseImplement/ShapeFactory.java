package caseImplement;

import interfaceCase.Color;
import interfaceCase.Shape;
import entity.Roundness;
import entity.Trangle;

public  class ShapeFactory  extends  AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("Roundness")) {
            return new Roundness();
        }
        if (type.equalsIgnoreCase("Trangle")){
            return new Trangle();
        }
        return  null;
    }
}
