package AdrianBednarek;
public interface CanBeColored {
    default String setColor(String _color){
        _color = _color.substring(0,1).toUpperCase() + _color.substring(1).toLowerCase();
        String chosenColor = _color.equals("Blue") ? _color : _color.equals("Yellow") ? _color : _color.equals("Green") ? _color : _color.equals("Red") ? _color : "No color";
        return  chosenColor;
    }
    abstract String getColor();
}
