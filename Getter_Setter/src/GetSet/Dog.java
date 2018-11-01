package GetSet;

public class Dog 
{
String breed;
int age;
String Color;

public String getBreed() 
{
	return breed;
}
public void setBreed(String breed)
{
	this.breed = breed;
}

public int getAge() 
{
	return age;
}
public void setAge(int age) 
{
	this.age = age;
}
public String getColor()
{
	return Color;
}
public void setColor(String color)
{
	Color = color;
}
void Display()
{
	  System.out.println("Breed : "+breed+"   Age : "+age+"     Color : "+Color);
}


}
