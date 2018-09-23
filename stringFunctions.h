#include<stdio.h>
#include<stdlib.h>

// function prototypes
char* createString(int);  // to create space for a string
char** createStringArray(int,int);  // to create an array of strings
char** populateStringArray(char **,int); // to populate array of strings
void displayStringArray(char **,int);   // to display array of strings
int lengthString(char *); // find length of a string
char* reverseString(char *); // to reverse a string
int stringCompareTo(char *,char *); // to compare between two strings 
char** sortStringAlphabetically(char **,int,int); // to sort strings in alphabetical order using insertion sort

// function definition
// to create space for a string
char* createString(int n)
{
	return (char *)malloc(n*sizeof(char));	
} 

// to create an array of strings
char** createStringArray(int m,int n)
{
	int i;
	char **p;
	p = (char **)malloc(m*sizeof(char *));	
	for(i=0;i<m;++i)
		p[i] = (char *)malloc(n*sizeof(char));
	return p;
}

// to populate array of strings
char** populateStringArray(char **p,int n)
{	
	int i;
	for(i=0;i<n;++i)
	{
		printf("\nEnter string %d: ",i+1);	
		scanf(" %[^\n]",p[i]);	
	}
	return p;
} 

// to display array of strings
void displayStringArray(char **p,int n)
{
	int i;
	for(i=0;i<n;++i)
		printf("\nString %d : %s",i+1,p[i]);
}  

// find length of a string
int lengthString(char *p)
{
	int i;
	for(i=0;p[i]!='\0';++i)
		;
	return i;
}

// to reverse a string
char* reverseString(char *p)
{
	int i,j;
	char temp;
	i = 0;
	j = lengthString(p)-1;
	while(i<j)
	{
		temp = p[i];
		p[i] = p[j];
		p[j] = temp;
		++i;
		--j;
	}
	return p;
}

// to compare between two strings 
int stringCompareTo(char *p,char *q)
{
	int i;
	i=0;
	while(p[i]!='\0' && q[i]!='\0' && p[i]==q[i])
		++i;
	return (p[i]-q[i]);  // return the difference of the first two unmatched character
}

// to sort strings in alphabetical order using insertion sort
char** sortStringAlphabetically(char **p,int m,int n)
{
	int i,j;
	char* temp;
	temp = createString(n);
	for(i = 1; i < m; ++i)
	{
		temp = p[i];
		for(j = i-1; j>=0 && stringCompareTo(p[j],temp)>0 ; --j)
			p[j+1] = p[j];
		p[j+1] = temp;
	}
	return p;
} 
