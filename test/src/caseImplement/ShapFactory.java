package caseImplement;

import entity.Shap;
import interfaceCase.Roundness;
import interfaceCase.Trangle;

public abstract class ShapFactory {
    public Shap getShap(String type) {
        if (type.equalsIgnoreCase(type)) {
            return new Roundness();
        } else {
            return new Trangle();
        }
    }
}
