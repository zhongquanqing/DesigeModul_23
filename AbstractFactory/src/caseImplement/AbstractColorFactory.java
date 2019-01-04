package caseImplement;

public class AbstractColorFactory  {

    public ColorFactory colorFactory(String colorFactory) {
        return new ColorFactory();
    }

    public ShapFactory shapFactory(String shapFactory) {
        return  null;
    }
}
