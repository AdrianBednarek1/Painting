package AdrianBednarek;
import java.util.Random;

public class BrushStroke extends Visibility implements ShapeBasic, CanBeColored {
    private int thickness;
    private String color = "Yellow";
    public BrushStroke(){
        Random rand = new Random();
        thickness = rand.nextInt(10)+1;
    }
    @Override
    public void draw(){
        System.out.println("Brush must stroke with thickness: "+ thickness);
    }
    @Override
    public void grow(){
        System.out.println("Adding color... "+ getColor());
    }
    @Override
    public String setColor(String _color){
        color = CanBeColored.super.setColor(_color);
        return color;
    }
    @Override
    public String getColor(){
        return color.equals("No color") ? "Out of color..."  : color;
    }
    @Override
    public String printText(){
        return "Brush Stroke";
    }
}