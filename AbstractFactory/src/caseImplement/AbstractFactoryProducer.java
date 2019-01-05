package caseImplement;

public class AbstractFactoryProducer {
    //根据type获取对应的工厂
    public   AbstractFactory getFactory(String type) {

        if (type.equalsIgnoreCase("color")) {

            return new ColorFactory();
        }
        if (type.equalsIgnoreCase("shape")){

            return  new ShapeFactory();
        }
        return null;

    }

}
