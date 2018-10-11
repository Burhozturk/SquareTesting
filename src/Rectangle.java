public class Rectangle
{
    int a = 0;
    int b = 0;

    public Rectangle()
    {

    }

    public Rectangle(int a, int b)
    {
        this.a = a;
        this.b = b;
    }


    public int getArea()
    {
        int area = a * b;
        return area;


    }

    public int getPerimeter()
    {
        int perimeter = 2 * a + 2 * b;
        return perimeter;

    }
}