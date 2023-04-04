1.What is a constructor?
Ans.A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.

2.What is Constructor chaining?
Ans.Constructor chaining is the process of calling a sequence of constructors. We can do it in two ways:
 by using this() keyword for chaining constructors in the same class.
 by using super() keyword for chaining constructors from the parent class.

3.Can we call a subclass constructor from a Superclass constructor?
Ans.No, we cannot call subclass constructor from superclass constructor.

4.What happens if you keep a return type for a costructor?
Ans.Since constructor can only return the object to class, it's implicitly done by java runtime and we are not supposed to add a return type to it. 
If we add a return type to a constructor, then it will become a method of the class.
 This is the way java runtime distinguish between a normal method and a constructor.

5.What is no-arg Costructor?
Ans.No-Arg Constructor - a constructor that does not accept any arguments.

6.What s no-arg constuctor different from the default costructor?
Ans.A default constructor is a 0 argument constructor which contains a no-argument call to the super class constructor.
 To assign default values to the newly created objects is the main responsibility of default constructor.
--The default constructor is a no-args constructor that the Java compiler inserts on your behalf; it contains a default call to super(); 
--If we do not create any constructor, the Java compiler automatically create a no-arg constructor during the execution of the program. This constructor is called default constructor.

7.When do we need costructor overloadig?
Ans.As construction overloading enables the creation of the object of a specific class in several ways, it is most commonly used in Java programs based on the requirement of the programmer.
 With the use of constructor overloading, objects can be initialized with different data types.

8.What is default constructor Explain with an example
Ans.A default constructor is a constructor that either has no parameters, or if it has parameters, all the parameters have default values. 
Ex:class Test{

}
public class Test{

}

class Test{
  void Test(){
}
}
