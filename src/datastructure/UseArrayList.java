package datastructure;

import databases.ConnectDB;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		ConnectDB connectDB = new ConnectDB();

		ArrayList<Object> car = new ArrayList();
		car.add("Engine");
		car.add("Car Name");
		car.add("Car Color");
		car.add("Car Type");
		car.add("Speed");

		int cars = car.size();

		car.contains("Seats");

		boolean hasGas = car.remove("Car Name");

		for(Object x : car){
			System.out.println(x);
			connectDB.InsertDataFromArrayListToMySql(car, "Cars Type", "Cars");
		}

		Iterator<Object> y = car.iterator();
		while(y.hasNext()){
			System.out.println(y.hasNext());
		}

	}

}
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
