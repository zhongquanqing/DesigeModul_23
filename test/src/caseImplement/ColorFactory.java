package caseImplement;

import entity.Color;
import interfaceCase.Greed;
import interfaceCase.Red;

public class ColorFactory {



    public Color getColor(String type) {
        if (type.equalsIgnoreCase("RED")) {
            return new Red();
        } else {

            return new Greed();

        }

    }
}
