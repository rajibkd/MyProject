package ClassNObject;

public class House {
public int address= 13336;
public String houseName;
public House(){ //Constructor1
	
}
public House(String houseName){   //Constructor2
this.houseName=houseName;
}
public House(String houseName,int address){    //Constructor3
	this.houseName=houseName;
	this.address=address;
}
public void setHouseName(String houseName){
	this.houseName=houseName;
}


public void watchTVShows(){
	System.out.println("Watching Game of Thrones");
}
public void sleep(){
	System.out.println("People sleeps at bed room");
}
public void showAddress()
{
	System.out.println("House Name is " +houseName);
}
public int addHouseSize(int length,int height){
	int total=length*height;
	return total;
}
public float newPrice(float price){
	return price;
}
}
