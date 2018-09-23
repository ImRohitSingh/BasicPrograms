#include<stdio.h>

typedef struct test
{
	int hour;
	int min;
	int sec;
}T;

T add(T,T); // function prototype to add two times

int main(void)
{
	T t1, t2, t3;
	t1.hour = 1;
	t1.min = 10;
	t1.sec = 48;
	t2.hour = 2;
	t2.min = 49;
	t2.sec = 13;
	
	printf("\n\n%d:%d:%d\n",t1.hour,t1.min,t1.sec);
	printf("\n\n%d:%d:%d\n",t2.hour,t2.min,t2.sec);
	t3 = add(t1,t2);
	printf("\n\n%d:%d:%d\n",t3.hour,t3.min,t3.sec);
	return 0;
}

T add(T t1,T t2)
{
	T t3;
	t3.hour = t1.hour + t2.hour;
	t3.min = t1.min + t2.min;
	t3.sec = t1.sec + t2.sec;
	if(t3.sec>59)
	{
		t3.sec-=60;
		t3.min+=1;
		if(t3.min>59)
		{
			t3.min-=60;
			t3.hour+=1;
		}
	}
	return t3;
}
