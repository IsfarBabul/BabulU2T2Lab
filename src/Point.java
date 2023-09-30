public class Point {

    private int x;
    private int y;

    public Point(int x_coordinate, int y_coordinate) {
        x = x_coordinate;
        y = y_coordinate;
    }

    public Point(int coordinate) {
        x = coordinate;
        y = coordinate;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return ("(" + x + ", " + y + ")");
    }

    public String quadrant() {
        if (x == 0 && y == 0) {
            return "origin";
        } else if (x == 0 || y == 0) {
            return "on an axis";
        } else if (x > 0 && y > 0)  {
            return "I";
        } else if (x < 0 && y > 0)  {
            return "II";
        } else if (x < 0 && y < 0)  {
            return "III";
        } else if (x > 0 && y < 0)  {
            return "IV";
        } else {
            return "in another dimension";
        }
    }

}
