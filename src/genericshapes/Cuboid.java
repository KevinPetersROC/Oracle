package genericshapes;

public class Cuboid<T extends Number>
{
    private T length;
    private T height;
    private T breadth;

    public Cuboid() {}

    public Cuboid(T length, T height, T breadth)
    {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }

    public void setLength(T length)
    {
        this.length = length;
    }
    public T getLength()
    {
        return length;
    }

    public void setHeight(T height)
    {
        this.height = height;
    }
    public T getHeight()
    {
        return height;
    }

    public void setBreadth(T breadth)
    {
        this.breadth = breadth;
    }
    public T getBreadth()
    {
        return breadth;
    }

    public String toString()
    {
        return ("Length: " + length + "\nHeight: " + height + "\nBreadth: " + breadth + "\n");
    }

    public double GetVolume()
    {
        return length.doubleValue() * height.doubleValue() * breadth.doubleValue();
    }
}
