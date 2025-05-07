package com.jdbc.cricketer;

import java.util.Scanner;

import com.jdbc.cricketer.model.Cricketer_Model;
import com.jdbc.cricketer.utils.Cricketer;

public class App {

	private static int res;
	private static int res2;

	public static void main(String[] args) throws Exception {
		Cricketer_Model cm = new Cricketer_Model();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select thhe functionality\n" + "1. Insert data into cricketer\n"
				+ "2. Fetch all data\n" + "3. Fetch all data in reverse order\n" + "4. Fetch data by Id\n"
				+ "5. Update Name\n" + "6. Fetch data by Proc\n" + "7. Fetch data by id proc\n"
				+ "8. Update Name By id proc\n" + "9. Delete By id proc\n" + "0. Exit ");
		int ch = sc.nextInt();
		switch (ch) {
		case 0:
			System.exit(0);
		case 1:
			System.out.println("Collecting Cricketer data");
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the country");
			String country = sc.next();
			System.out.println("Enter the age");
			int age = sc.nextInt();
			System.out.println("Enter the matches");
			int matches = sc.nextInt();
			System.out.println("Enter the runs");
			int runs = sc.nextInt();
			System.out.println("Enter the wickets");
			int wickets = sc.nextInt();
			System.out.println("Enter the catches");
			int catches = sc.nextInt();
			System.out.println("Enter the man of the match");
			int mom = sc.nextInt();
			System.out.println("Enter the average");
			double avg = sc.nextDouble();

			Cricketer c = new Cricketer(age, matches, runs, wickets, catches, mom, name, country, avg);
			boolean res = cm.insertData(c);
			if (res == true) {
				System.out.println("data inserted ");
				System.out.println("Y---> continue\n" + "N---> Exit");
				if (sc.next().equalsIgnoreCase("y")) {
					main(null);
				} else {
					System.exit(0);
				}
			} else
				System.out.println("Data insertion failed");
			break;
		case 2:
			cm.fetchAllData();
			System.out.println("Y---> continue\n" + "N---> Exit");
			if (sc.next().equalsIgnoreCase("y")) {
				main(null);
			} else {
				System.exit(0);
			}

		case 3:
			cm.fetchAllDataReverse();
			System.out.println("Y---> continue\n" + "N---> Exit");
			if (sc.next().equalsIgnoreCase("y")) {
				main(null);
			} else {
				System.exit(0);
			}
		case 4:
			System.out.println("Enter the id");
			int id = sc.nextInt();
			cm.fetchAllDataById(id);
			System.out.println("Y---> continue\n" + "N---> Exit");
			if (sc.next().equalsIgnoreCase("y")) {
				main(null);
			} else {
				System.exit(0);
			}

		case 5:
			System.out.println("Enter the id");
			int id1 = sc.nextInt();
			System.out.println("Enter the name");
			String name1 = sc.next();
			res2 = cm.updateName(name1, id1);
			if (res2 > 0)
				System.out.println("Data updated successfully");
			else
				System.out.println("Data updation failed");
			System.out.println("Y---> continue\n" + "N---> Exit");
			if (sc.next().equalsIgnoreCase("y")) {
				main(null);
			} else {
				System.exit(0);
			}
		case 6:
			cm.fetchAllDataByProc();
			System.out.println("Y---> continue\n" + "N---> Exit");
			if (sc.next().equalsIgnoreCase("y")) {
				main(null);
			} else {
				System.exit(0);
			}
		case 7:
			System.out.println("Enter the id");
			int id2 = sc.nextInt();
			cm.fetchAllDataByIdProc(id2);
			System.out.println("Y---> continue\n" + "N---> Exit");
			if (sc.next().equalsIgnoreCase("y")) {
				main(null);
			} else {
				System.exit(0);
			}
		case 8:
			System.out.println("Enter the id");
			int id3 = sc.nextInt();
			System.out.println("Enter the name");
			String name3 = sc.next();
			res2 = cm.updateNameByProc(name3, id3);
			if (res2 > 0)
				System.out.println("Data updated successfully");
			else
				System.out.println("Data updation failed");
			System.out.println("Y---> continue\n" + "N---> Exit");
			if (sc.next().equalsIgnoreCase("y")) {
				main(null);
			} else {
				System.exit(0);
			}
		case 9:
			System.out.println("Enter the id");
			int id4 = sc.nextInt();
			res2 = cm.deleteByIdProc(id4);
			if (res2 > 0)
				System.out.println("Data deleted successfully");
			else
				System.out.println("Data deletion failed");
			System.out.println("Y---> continue\n" + "N---> Exit");
			if (sc.next().equalsIgnoreCase("y")) {
				main(null);
			} else {
				System.exit(0);
			}

		default:
			break;
		}
	}

}
