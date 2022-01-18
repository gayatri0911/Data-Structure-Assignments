import java.io.*;
import java.util.*;

class WordFrequency
{
	static int count;
	public static void main(String args[])throws IOException
	{
		String option="n";
	 	do
		{	
			count=0;
			System.out.println("Enter String: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			StringTokenizer tokens = new StringTokenizer(input," ");
			System.out.println("Enter the word u want to search:");
			String word = br.readLine();
			while(tokens.hasMoreTokens())
			{
				if((tokens.nextToken()).equalsIgnoreCase(word))
				{
					count = count+1;
				}
			}
			System.out.println(word+" has occured "+count+"times");
			System.out.println("Do u want to continue(y/n): ");
			option = br.readLine();
		}while(!(option.toUpperCase()).equals("N"));
	}
}