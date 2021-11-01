import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	public static void main(String [] agrs) throws FileNotFoundException
	{
		
		File file = new File("/Users/harshith/eclipse-workspace/HashTable2/data/hash02 - Array Size 17.txt");
		Scanner console = new Scanner(file);
		
		// reads the size of the hashtable
		String line = console.nextLine();
		String [] feilds = line.split(" ");
		int size = Integer.parseInt(feilds[1]);
		
		//reads the number of variables added
		line = console.nextLine();
		feilds = line.split(" ");
		int put = Integer.parseUnsignedInt(feilds[1]);
		HashTable hashTable = new HashTable(size);
		for(int i = 0; i < put; i++)
		{
			System.out.println("i " + i);
			// the contents of the line
			line = console.nextLine();
			feilds = line.split(" ");
			//System.out.println(feilds[0]);
			//combines the name from the file
			String name = feilds[1].trim() + " " + feilds[2].trim();
			//System.out.println(name);
			int num = Integer.parseInt(feilds[0].trim());
			hashTable.put(num, name);
		
		}
		System.out.println("---- ARRAY STATE AFTER PUTS ----");
		
		
		line = console.nextLine();
		feilds = line.split(" ");
		int removeNumber = Integer.parseInt(feilds[1]);
		for(int i = 0; i < removeNumber; i++)
		{
			line = console.nextLine();
			int removeNum = Integer.parseInt(line);
			hashTable.remove(removeNum);
		}
		
		
		line = console.nextLine();
		//System.out.println(line);
		feilds = line.split(" ");
		int putNumber = Integer.parseInt(feilds[1]);
		for(int i =0; i<putNumber; i++)
		{
			line = console.nextLine();
			feilds = line.split(" ");
			String name = feilds[1].trim() + " " + feilds[2].trim();
			int num = Integer.parseInt(feilds[0].trim());
			hashTable.put(num, name);
		}
		
		
		
		line = console.nextLine();
		feilds = line.split(" ");
		
		putNumber = Integer.parseInt(feilds[1]);
		for(int i =0; i<putNumber; i++)
		{
			line = console.nextLine();
			feilds = line.split(" ");
			String name = feilds[1].trim() + " " + feilds[2].trim();
			int num = Integer.parseInt(feilds[0].trim());
			hashTable.put(num, name);
		}
		
		
		
		
		
		//System.out.println(hashTable.toString());
		line = console.nextLine();
		feilds = line.split(" ");
		int getNumber = Integer.parseInt(feilds[1]);
		for (int i = 0; i< getNumber; i++)
		{
			line = console.nextLine();
			int num = Integer.parseInt(line.trim());
			//System.out.println(line);
			String description = (String)hashTable.get(num);
			//System.out.println(description);
		}
		System.out.println("");
		System.out.println(hashTable.toString());
	}

}

//Hash code for Deepavali is 25582525
//Hash code for Dasara is 2039886618
//Description is: Festival of Durga
//Description is: Festival of lights