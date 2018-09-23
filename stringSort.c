#include <stdio.h>
#include "stringFunctions.h"

int main()
{
	char **s;
	int m,n;
	m = 3; // number of names
	n = 20; // maximum number of characters that each name can contain
	s = createStringArray(m,n);  // function call to create array of strings
	s = populateStringArray(s,m); // function call to populate array of strings
	printf("\n\nThe entered strings are: \n");
	displayStringArray(s,m); // function call to display array of strings
	s = sortStringAlphabetically(s,m,n);  // function call to sort strings in alphabetical order using insertion sort
	printf("\n\nThe sorted strings are: \n");
	displayStringArray(s,m); // function call to display array of strings
	return 0;
}
