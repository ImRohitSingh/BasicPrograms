#include <stdio.h>
#include "stringFunctions.h"

int main()
{
	char *s, *t;
	int n = 20;
	s = createString(n);  // function call to create space for a string
	t = createString(n);  // function call to create space for a string
	printf("\nEnter a string: ");
	scanf(" %[^\n]",s);
	printf("\nEnter another string: ");
	scanf(" %[^\n]",t);
	if(stringCompareTo(s,t)==0)
		printf("\n %s and %s are equal.\n",s,t);
	else if(stringCompareTo(s,t)>0)
		printf("\n %s appears later in the dictionary than %s.\n",s,t);
	else
		printf("\n %s appears before in the dictionary than %s.\n",s,t);
	return 0;
}
