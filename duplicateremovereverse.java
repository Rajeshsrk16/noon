
public class duplicateremovereverse {
	public static void main(String[] args)
	{
		String s1="rrajjesh";
		String s2="";
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch!=' ' )
			{
				s2=ch+s2;
				s1=s1.replace(ch,' ');				
			}
		}
		System.out.println(s2);
		
}
	
}
