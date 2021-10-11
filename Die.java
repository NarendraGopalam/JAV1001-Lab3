import java.util.Random;
/*
Name: Narendra Gopalam
Student Number: A00245541

Program Description: Die - Maintains Die Structure
*/

public class Die {
// three private variables for inputs
private String name;
private int no_of_sides;
private int current_side_up;
// Accessors
//get name returns the name of private string name
public String getName() {
	return name;
}

//get no of sides of a die
public int getNo_of_sides() {
	return no_of_sides;
}

//get current side up of a die using roll method
public int getCurrent_side_up() {
	roll();
	return current_side_up;
}

//Mutators
//set the name of private string name
public void setName(String newName) {
	name = newName;
}
//set no of sides of a die
public void setNo_of_sides(int new_no_of_sides) {
	no_of_sides = new_no_of_sides;
}
//set the current side of a die
public void setCurrent_side_up(int new_current_side_up) {
	current_side_up = new_current_side_up;

}
//no argument constructor to crete a default d6 die
public Die(){
	name="d6";
	no_of_sides=6;
	System.out.println("Creating a default "+getName()+"...");
}
// One argument constructor which is the no of sides of a die
public Die(int new_no_of_sides){
	name="d"+new_no_of_sides;
	no_of_sides=new_no_of_sides;
	System.out.println("Creating a "+getName()+"...");
	//roll(6);
}
//Two arguments constructor takes input of a die name and no of sides in a die
public Die(String new_name,int new_no_of_sides){
	name=new_name;
	no_of_sides=new_no_of_sides;
	System.out.println("Creating a "+getName()+" die (a special d"+no_of_sides+")...");
	//roll(6);
}
//roll method special method which set the current side up of a die by generating a random number on between the no of sides of a die
public void roll()
{
	Random roll_die=new Random();
	current_side_up=(roll_die.nextInt(no_of_sides)+1);

}
}
