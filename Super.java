class Shape
{
void area(int s)
{
System.out.println("Area of square:"(s*s));
}
void area(float r)
{
System.out.println("Area of circke:"+(3.14f*r*r));
}
void area(int l,intb)
{
System.out.println("Area of rectangle:"+(l*b));
}
}
class Super
{
public static void main(String a[])
{
shape S=new shape();
S.area(10);
S.area(10.0f);
S.area(10,20);
}
}