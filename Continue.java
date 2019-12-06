import java.util.*;
class Continue
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		s:
		for(int i=0;i<5;++i)
		{
			if(i==3)
			continue s;
			System.out.println(i);
		}
	}
}