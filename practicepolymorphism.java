//polymorphism 
//one thing in different form that is one method but different behaviour
//polymorphism are of two types
//method overloading or complie time or early binding
//method overidding or run time or late binding
//In method overriding the code size can be reduced
//achive polymorphism by creating parent type reference for child type object (i.e.upcasting or loose coupling)
//

//
class Animal
{
    public void eat()
    {
        System.out.println("eating");
    }
    public void sleep()
    {
        System.out.println("sleeping");
    }
}
class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger eats other animals");
    }
    public void sleep()
    {
        System.out.println("Tiger sleeps at night");
    }
}
class Monkey extends Animal
{
    public void eat()
    {
        System.out.println("Monkey eats banana");
    }
    public void sleep()
    {
        System.out.println("Monkey sleeps at afternoon");
    }
    
}
class Deer extends Animal
{
    public void eat()
    {
        System.out.println("Deer eats grass");
    }
    public void sleep()
    {
        System.out.println("Deer sleeps at morning");
    }
}
class Forest
{
    public void action(Animal a)
    {
        a.eat();
        a.sleep();
    }
}
public class Main
{
    public static void main(String[]args)
    {
        Animal am=new Animal();
        Tiger t=new Tiger();
        Monkey m=new Monkey();
        Deer d=new Deer();
        
        Forest f=new Forest();
        f.action(am);
        f.action(t);
        f.action(m);
        f.action(d);
    }
}
