import java.util.*;

class day37
{
	
 int gcd(int a, int b)
	{
		if(b==0)
			return a;

		return gcd(b, a % b);
	}
}


/////////////////////////// method 2
 int gcd(int a, int b)
	{
		while(a!=b)
		{
			if(a > b)
				a = a - b;
			else
				b = b - a; 
		}

		return a;
	}
