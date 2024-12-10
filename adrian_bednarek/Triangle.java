package AdrianBednarek;
import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored {
    private double a = 3.0;
    private double b = 3.0;
    private double c= 3.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";
    public Triangle(){
    }
    public Triangle(String _color){
        setColor(_color);
    }
    public Triangle(double _a, double _b, double _c) {
        a = a <= _a ? _a : a;
        b = b <= _b ? _b : b;
        c = c <= _c ? _c : c;
    }
    public Triangle(double _a, double _b, double _c, String _color) {
        setColor(_color);
        a = a <= _a ? _a : a;
        b = b <= _b ? _b : b;
        c = c <= _c ? _c : c;
    }
    @Override
    public double calculateArea(){
        double halfedPerimeter = calculatePerimeter()/2;
        return Math.sqrt(halfedPerimeter*(halfedPerimeter-a)*(halfedPerimeter-b)*(halfedPerimeter-c));
    }
    @Override
    public double calculatePerimeter(){
        return a+b+c;
    }
    @Override
    public void drawShape(){
        System.out.println("This is a triangle with area: "+df2.format(calculateArea())+" and perimeter: "+df2.format(calculatePerimeter())+" Color: "+ getColor());
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public String setColor(String _color){
        color = CanBeColored.super.setColor(_color);
        return color;
    }

}       