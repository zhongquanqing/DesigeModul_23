package caseImplement;

import interfaceCase.Color;
import entity.Greed;
import entity.Red;
import interfaceCase.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else {

            return new Greed();

        }

    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
