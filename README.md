Nested class: A class inside another class. It can be static nested class or non static nested class.
impt: If a class is only usefull to one other class it make sense to keep it inside that class.
  nested class help hide internal implementation of a class from other classes, you can make the nested class as private in that case, making it invisible to other classes.
idea: eg we have two class ie Car and Engine, conceptually engine belongs to car, we can nest the engine inside the car. The idea of encapsulation is, as we can see the engines
  of real cars are encapsulated inside the car and we cannot see how the engines is working in a car is driving, which is good because we do not want the engine to visible from outside.
  Just like that we can hide the implementations of class to other classes by making the nested class as private(the nested class contains the implementation).

How do we create objects of nestec class?
  Non static nested class: Just like how we need to create an object of class to access the non static members we need the object of the outer class to create the object of inner class.
  eg in the program:
  class{
    int a = 10;
    public void show(){
      sysout("value of a: "+a);
    }
    class B{
      int b=b;
      public void show(){
        sysout("value of b: "+b);
      }
    }
  }

  class Main{
    public static void main(String args[]){
      A obj = new A();
      obj.show();
      A.B obj1  = obj.new B();
      obj1.show();
    }
  }


   A obj = new A(); //instance of A
   A.B obj1 = obj.new B() //instance of B

  Here A.B, because B is inside A (as usual how we acces something which is inside something)
  Here obj.new B(), with the help of obj (object of A) we created the object of B.

  static nested class: Similarly,

  class A{

  public void show(){
    sysout("A");
  }

   static class B{
     public void show(){
       syosut("B");
     }
   }
  }

  class Main{
     public static void main(String args[]){
         A.B obj = new A.B(); // since B is static class we can just directly acces B with the help of "A.", just like how we can access static members with the help of the class name.
         obj.show();
     }
  }


  in the example we use the method show() everywhere, just for clearity show() is not overriding and other show(), show() is a different method for each class, as we know mehtod overriding 
  requires inheritance. 


















  
    
