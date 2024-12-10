package AdrianBednarek;
import java.util.List;

public class ShapeDrawer extends Drawing<ShapeBasic>{
    public ShapeDrawer(){

    }
    @Override
    public void draw(){
        List<ShapeBasic> shapeBasic = getBasicShapes();
        if(shapeBasic.isEmpty()) {
            System.out.println("Drawing is empty");
            return;
        }
        for (ShapeBasic shape : shapeBasic){
            shape.draw();
        }
        System.out.println("\n");
    }
    public void grow(){
        List<ShapeBasic> shapeBasic = getBasicShapes();
        if(shapeBasic.isEmpty()) {
            System.out.println("Drawing is empty");
            return;
        }
        for (ShapeBasic shape : shapeBasic){
            shape.grow();
        }
        System.out.println("\n");
    }
    public void showVisibility(){
        List<ShapeBasic> shapeBasic = getBasicShapes();
        if(shapeBasic.isEmpty()) {
            System.out.println("Drawing is empty");
            return;
        }
        int i = 0;
        for (ShapeBasic shape : shapeBasic){
            i++;
            String visible = "shape is visible: ";
            if(!shape.isVisible()) visible = "shape is in the background: ";
            System.out.println(i+". "+visible+shape.printText());  
        }
        System.out.println("\n Total number of shapes : "+ i+"\n");
    }

}