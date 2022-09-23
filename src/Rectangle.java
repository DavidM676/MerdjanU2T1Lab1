// Rectangle class definition
public class Rectangle {

    // instance variables
    private int length;
    private int width;

    public int area;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }

    // method that calculates and prints area
    public void printArea() {
        area = length * width;
        //System.out.println("My area is " + area);
    }

    public int printPerimeter() {
        int p = (2*length)+(2*width);
        return p;
    }


}


