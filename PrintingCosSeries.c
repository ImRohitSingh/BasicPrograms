/* Print the following series:
    f(x)=1-((x^2)/(2!))+((x^4)/(4!))-((x^6)/(6!))+((x^8)/(8!))-((x^10)/(10!)). */

#include<stdio.h>

void printSeries(int);  // function prototype to print the series

int main(void)
{
	int i=2,n,printedTerms,flag=1;  // Declaring and initializing variables
	printf("Enter number of terms of the series you want to print: ");
	scanf("%d",&n);  // accepting the number of terms of the series to be printed
	if(n<0)    // if number of terms entered is negative
		printf("\nInvalid Input.\n");
	else if(n==0)   // if number of terms entered is zero
		printf("\nNo terms to display.\n");
	else if(n==1)     // if there is only one number of terms entered 
		printf("\nYour series is:-\n\nf(x)=1.\n");
	else         // if mulitple terms to print
		printSeries(n);    // function call to print the series
	return 0;
}   // end of main

// function definition to print series
void printSeries(int n)
/* Purpose: Prints the series in the desired form. This function is only invoked only when there are multiple terms to be printed.
	
	Variable Description:
		i - the exponents of each term imposed on the dependent variable 'x' of 'f(x)'
		printedTerms- counts the terms that gets printed
		flag - a state variable with two states:
				1: the term that is going to get printed is situated in an even place;
				0: the term that is going to get printed is situated in an odd place;
				
	Initializations:
		i<--2   (print the second term as the first term gets printed autamatically according to this approach
		flag<--1  (the 2nd term gets print first which is even placed
		
	*/
{
	int i=2,printedTerms,flag=1;  // Declaring and initializing variables
	printf("\nYour series is:-\n\nf(x)=1");    // printing the first member
		printedTerms=1;    // counting printed numbers
		while(printedTerms<n)   // checking that number of terms don't exceed printed terms
		{
			++printedTerms;     // adding one to the count of printed numbers as one number will be printed for each performance of this loop
			if(printedTerms!=n)     // if this term is not the last term
				if(flag)    // if flag value is still 1  -the state of negative sign for the even placed terms
				{
					printf("-((x^%d)/(%d!))",i,i);     // print accordingly
					flag=0;          // change the state of flag
				}
				else     // if flag value is still 0 - the state of positive sign for the odd placed terms
				{
					printf("+((x^%d)/(%d!))",i,i);      // print accordingly
					flag=1;         // change the state of flag
				}
			else        // if the term to be printed is the last term
				if(flag)        // if it is an even placed term
					printf("-((x^%d)/(%d!)).\n",i,i);        // print accordingly
				else        // if it is an odd placed term
					printf("+((x^%d)/(%d!)).\n",i,i);         // print accordingly
		
			i+=2;   // incremet i accordingly for the even powers only   
		}		
}
