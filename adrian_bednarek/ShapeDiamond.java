package AdrianBednarek;
import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored {
    private double a = 2.0;
    private double b = 2.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";
    public ShapeDiamond(){
    }
    public ShapeDiamond(String _color){
        setColor(_color);
    }
    public ShapeDiamond(double _a, double _b){
        a = a <= _a ? _a : a;
        b = b <= _b ? _b : b;
    }
    public ShapeDiamond(double _a, double _b, String _color){
        setColor(_color);
        a = a <= _a ? _a : a;
        b = b <= _b ? _b : b;
    }
    @Override
    public double calculateArea(){
        return a*b;
    }
    @Override
    public double calculatePerimeter(){
        return (a+b)*2;
    }
    @Override
    public void drawShape(){
        System.out.println("This is a diamond shape with area: " + df2.format(calculateArea()) + " and perimeter: " + df2.format(calculatePerimeter()) + ". Color: " + getColor());
    }
    @Override
    public String getColor(){
        return color.equals("No color") ? "The shape is not colored"  : color;
    }
    @Override
    public String setColor(String _color){
        color = CanBeColored.super.setColor(_color);
        return color;
    }
} 