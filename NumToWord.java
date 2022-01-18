import java.io.*;

public class NumToWord
{
	static final String[] one = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ", "fifteen ","sixteen ", "seventeen ", "eighteen ","nineteen "};
	static final String[] ten = {"","","twenty ", "thirty ", "forty ","fifty ", "sixty ", "seventy ", "eighty ","ninety "};
	static final String[] hundred = {""," thousand "," million ","billion","trillion ","quadrillion "};
	
	private static String toWord(long num)
	{
		String word = "";
		int index = 0;
		do
		{
			long no = num % 1000l;
			if(no != 0)
			{
				String str = ntow(no);
				word = str + hundred[index] + word;

			}
			
			index++;
			num = num / 1000l;
		}while(num>0);
		
		return word;
	}
	public static String ntow(long num)
	{
		String word="";
		long no = num%100;
		if(no<20)
			word = word+one[(int)(long)no];
		else{ 
			long index1 = no/10;
			long index2 = no%10;
			word=ten[(int)(long)index1]+one[(int)(long)index2];
		    }
		long index = num/100;
		word=( (int)(long)index > 0) ? one[(int)(long)index] + "hundred " + word : word;
		return word;	
	}
	public static void main(String args[])throws IOException
	{
		System.out.println("Enter Number:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		if(num>999999999999999999L)
			System.exit(0);
		else
			System.out.println(toWord(num));
	}	

}