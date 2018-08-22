import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Person[] people = new Person[4];

		for (int i = 0; i < 4; i++) {
			if (i == 0)
				people[i] = new Person("Fred", 21, "Dev");
			if (i == 1)
				people[i] = new Person("Bob", 23, "Dev");
			if (i == 2)
				people[i] = new Person("Alfie", 41, "Manager");
			if (i == 3)
				people[i] = new Person("Winnie", 26, "Dev");
		}

		for (int i = 0; i < 4; i++) {
			System.out.print(people[i].info());
		}

		System.out.println();

		for (int i = 0; i < 4; i++) {
			if (people[i].name == "Alfie")
				System.out.print(people[i].info());
		}

		System.out.println();
		
		BufferedWriter bw = null;

		ArrayList<Person> people1 = new ArrayList<Person>();

		people1.add(new Person("Fred", 21, "Dev"));
		people1.add(new Person("Bob", 23, "Dev"));
		people1.add(new Person("Alfie", 41, "Manager"));
		people1.add(new Person("Winnie", 26, "Dev"));
		people1.add(new Person("Joe", 21, "Dev"));

//		for (Person i : people)	{
//			System.out.print(i.info());
//		}

		File file = new File("C:\\Users\\Admin\\Desktop\\EclipseWorkspace\\HelloWorld\\src\\people.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		bw = new BufferedWriter(fw);

		for (Person i : people1) {
			try {
				bw.write(i.info());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();

		ArrayList<Person> people2 = new ArrayList<Person>();

		FileReader fr = null;

		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedReader br = new BufferedReader(fr);

		String readLine = "";

		do {
			try {
				readLine = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (readLine == null) break;
			String[] parts = readLine.split(", ");
			people2.add(new Person(parts[0], Integer.parseInt(parts[1]), parts[2]));
		} while (readLine != null);
		
		for (Person i : people2)	{
			System.out.print(i.info());
		}

	}

}
