import java.util.*;
class Continue1
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		s:
		for(int i:a)
		{
			if(i==4)
			{
				break s;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}