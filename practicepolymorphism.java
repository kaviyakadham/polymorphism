//polymorphism
//one thing in different form that is one method but different behaviour
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
