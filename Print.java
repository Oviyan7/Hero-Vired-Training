abstract class Shape{
  abstract void draw();
}  
  class Circle extends Shape{
    void draw(){
      System.out.println("it was a circle");
    } 
  }
  
  class Rhombus extends Shape{
    void draw(){
      System.out.println("It was a rhombus");
    } 
  }
  class Triangle extends Shape{
    void draw(){
      System.out.println("It is a triangle");
    }
  }
  public class Print{
    public static void main(String[] args){
      Shape Circle=new Circle();
      Shape Rhombus=new Rhombus();
      Shape Triangle=new Triangle();

      Circle.draw();
      Rhombus.draw();
      Triangle.draw();

    }

  }
