import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {
		// System.out.println("Hello World!");
		//
		// String helloWorld = "Hello World!";
		// System.out.println(helloWorld);
		//
		// ExampleClass example = new ExampleClass();
		// System.out.println(example.outHelloWorld());
		//
		// example.printString(helloWorld);
		//
		// System.out.println(example.addition(2, 3));
		// System.out.println(example.addition(2, 0));
		//
		// System.out.println(example.addition(2, 3, false));
		// System.out.println(example.addition(2, 3, true));
		//
		// for (int i = 0; i < 10; i++) {
		// System.out.println(example.addition(i, 0));
		// }
		//
		// int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		//
		// for (int i : array1) System.out.println(array1[i-1]);
		//
		// for (int i = 0; i < 10; i+=2) {
		// System.out.println(example.addition(array1[i], array1[i+1]));
		// }
		//
		// int[] array2 = new int[10];
		// for (int i = 0; i < 10; i++) {
		// array2[i] = i;
		// System.out.println(array2[i]);
		// }
		// for (int i = 0; i < 10; i++) {
		// array2[i] *= 10;
		// System.out.println(array2[i]);
		// }

		// System.out.println(example.blackjack(20, 5));
		// System.out.println(example.blackjack(22, 5));
		// System.out.println(example.blackjack(20, 21));
		// System.out.println(example.blackjack(12, 22));
		// System.out.println(example.blackjack(22, 22));
		//
		// System.out.println();
		//
		// System.out.println(example.uniqueSum(1,2,3));
		// System.out.println(example.uniqueSum(3,3,3));
		// System.out.println(example.uniqueSum(1,1,2));
		//
		// System.out.println();
		//
		// Person[] people = new Person[4];
		//
		// for (int i = 0; i < 4; i++) {
		// if (i == 0) people[i] = new Person("Fred",21,"Dev");
		// if (i == 1) people[i] = new Person("Bob",23,"Dev");
		// if (i == 2) people[i] = new Person("Alfie",41,"Manager");
		// if (i == 3) people[i] = new Person("Winnie",26,"Dev");
		// }
		//
		// for (int i = 0; i < 4; i++) {
		// System.out.println(people[i].info());
		// }
		//
		// System.out.println();
		//
		// for (int i = 0; i < 4; i++) {
		// if (people[i].name == "Alfie") System.out.println(people[i].info());
		// }
		//
		// System.out.println();

		// double[][] prices = {{19.99,20,10},{11.99,15,11},{25,10,20}};
		// String[] names = {"CheepoMax","AverageJoes","DuluxourousPaints"};
		// PaintWizard wiz = new PaintWizard();
		// System.out.println(wiz.getCheepest(prices, names, 5));

		// System.out.println();

		BufferedWriter bw = null;

		ArrayList<Person> people = new ArrayList<Person>();

		people.add(new Person("Fred", 21, "Dev"));
		people.add(new Person("Bob", 23, "Dev"));
		people.add(new Person("Alfie", 41, "Manager"));
		people.add(new Person("Winnie", 26, "Dev"));
		people.add(new Person("Joe", 21, "Dev"));

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

		for (Person i : people) {
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
