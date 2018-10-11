import org.junit.Assert;

import static org.junit.Assert.*;

public class RectangleTest
{
    @org.junit.Test
    public void getArea() throws Exception
    {
        Rectangle a=new Rectangle(1,1);
        int resulta=a.getArea();
        assertEquals(1,resulta);

        Rectangle b=new Rectangle(5,10);
        int resultb=b.getArea();
        assertEquals(50,resultb);

        Rectangle c=new Rectangle(10000,0);
        int resultc=c.getArea();
        assertEquals(0,resultc);

        Rectangle d=new Rectangle(6,-4);
        int resultd=d.getArea();

    }

    @org.junit.Test
    public void getPerimeter() throws Exception
    {
        Rectangle a=new Rectangle(1,1);
        int resulta=a.getPerimeter();
        assertEquals(4,resulta);

        Rectangle b=new Rectangle(5,10);
        int resultb=b.getPerimeter();
        assertEquals(30,resultb);

        Rectangle c=new Rectangle(10000,0);
        int resultc=c.getPerimeter();
        assertEquals(20000,resultc);

        Rectangle d=new Rectangle(6,-4);
        int resultd=d.getPerimeter();

    }

}