package AdrianBednarek;

public class ShapeAdapter extends Visibility implements ShapeBasic{

    private ShapeSpecial shapeSpecial;

    public ShapeAdapter(ShapeSpecial _shapeSpecial){
        shapeSpecial = _shapeSpecial;
    }
    @Override
    public void draw(){ 
        shapeSpecial.drawShape();
    }
    @Override
    public void grow(){
        System.out.println(printText()+", cannot grow");
    }
    @Override
    public String printText(){
        if(shapeSpecial instanceof ShapeDiamond) return "ShapeDiamond";
        if(shapeSpecial instanceof Triangle) return "Triangle";
        
        return "This shape is not supported";
    }
}
