package ClassNObject;

public class TestHouse {
	public static void main(String [] args){
		House myHouse =new House("WhiteHouse");
		System.out.println(myHouse.houseName);
		
		int total=myHouse.addHouseSize(20,20);
		//float housePrice=myHouse.newPrice(2000.23f);
		myHouse.watchTVShows();
		myHouse.sleep();
		myHouse.showAddress();
		System.out.println(total);
		System.out.println(myHouse.newPrice(2000.23f));
	}

}
