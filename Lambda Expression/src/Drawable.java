/*Lambda expression provides implementation of functional interface. 
  An interface which has only one abstract method is called functional interface. 
  Java provides an anotation @FunctionalInterface,which is used to declare an interface as functional interface.
*/

@FunctionalInterface
public interface Drawable 
{
 //void draw();
 //void display(int id,String name);
 int calculate(int a);
}
