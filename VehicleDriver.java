import java.util.Scanner;

abstract class Vehicle
{
    public int yearOfManufacture;
    Vehicle()
    {

    }
    abstract int getData();
    abstract void putData(int a );

}
class TwoWheeler extends Vehicle 
{
    TwoWheeler(int a)
    {
        yearOfManufacture=a;

    }
    int getData()
    {
        return yearOfManufacture;

    }
    void putData(int a)
    {
        yearOfManufacture=a;
    }

}
final class FourWheeler extends Vehicle 
{
    FourWheeler(int a)
    {
        yearOfManufacture=a;

    }
    int getData()
    {
        return yearOfManufacture;

    }
    void putData(int a)
    {
        yearOfManufacture=a;
    }
}
class MyTwoWheeler extends TwoWheeler
{
    MyTwoWheeler(int a)
    {
        super(a);
    }


}
public class VehicleDriver 
{
    public static void main(String args[])
    {
        MyTwoWheeler m=new MyTwoWheeler(2000);
        System.out.println(m.getData());

    }

    
}
