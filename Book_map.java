import java.io.*;
import java.util.*; 
 
public class Book_map {  
public static void main(String[] args)throws IOException {  
    Map<Integer,String> map=new HashMap<>();
    int choice;  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    do
    {
	System.out.println("MENU :\n1.Add book details.\n2.Display all the books.\n3.Search book with book ID.\n4.Delete book details.\n5.Exit. Enter your choice:");
   	choice = Integer.parseInt(br.readLine());
	switch(choice)
 	{
		case 1: System.out.println("Enter Book Id:");
   	 		int ID = Integer.parseInt(br.readLine());
    	 		System.out.println("Enter Book Name:");
    		 	String name = br.readLine();
    	 		map.put(ID,name);
			break;
		case 2: System.out.println(map);
			break;
		case 3: System.out.println("Enter Book Id u want to search:");
			int Key = Integer.parseInt(br.readLine());
			if(map.containsKey(Key))
			{
				System.out.println("Match found.\n Book ID:"+Key+"\n Book name:"+map.get(Key));
			}
			else
				System.out.println("No book details available");
			break;
		case 4: System.out.println("Enter Book Id u want to delete:");
			int key = Integer.parseInt(br.readLine());
			if(map.containsKey(key))
			{
				map.remove(key);
			}
			else
				System.out.println("No book available");
			break;
		case 5: System.exit(0);
			break;
		default:System.out.println("Enter valid input");
	} 
	
	 
    }while(choice!=5);
    
     
  }  
}  