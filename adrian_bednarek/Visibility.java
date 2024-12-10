package AdrianBednarek;
public abstract class Visibility{
    private boolean inBackground;
    public Visibility(){
        inBackground = false;
    }
    public void changeVisibility(){
        inBackground  = !inBackground;
    }
    
    public boolean isVisible(){
        return inBackground;
    }
}