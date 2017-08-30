	#include <iostream>
	#include <cmath>
	using namespace std;
	int main()
	{

		long long int a,b,c,temp;
		
		cin >> temp;
		
		for(int i=1; i<1000000; i++)
		{
			for(int j=1; j<100000 && j<i; j++)
			{
					a = pow(i,2) - pow(j,2);
					b = 2*i*j;
					c = pow(i,2) + pow(j,2);
					if(a== temp)
					{
						if(pow(a,2)+pow(b,2)==pow(c,2))
						{
								cout << a << b << c << endl;
								i=10000000000;
								break;
						}
						
					}
					
					
			}
		}
		return 0;
	}
