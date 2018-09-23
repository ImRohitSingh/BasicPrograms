#include <stdio.h>
#include "stringFunctions.h"

int main()
{
	char *s;
	int n = 20;
	s = createString(n);  // function call to create space for a string
	printf("\nEnter a string: ");
	scanf(" %[^\n]",s);
	printf("\nYour string: \n %s \n",s);
	printf("\nLength of your string = %d \n",lengthString(s));  // function call to find length for a string
	printf("\nReverse of your string: \n %s \n",reverseString(s)); // function call to reverse a string
	return 0;
}
