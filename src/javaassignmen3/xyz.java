package javaassignmen3;
public class xyz
{
public static void main(String args[]) 
{ 
//x for rows, y for columns, and row denotes the number of rows to print 
int x, y, row=5; 
//outer loop for rows 
for(x=0; x<row; x++) 
{ 
//inner loop for columns 
for(y=x; y<=row; y++) 
{ 
	System.out.println(" ");
	
}
	
	for(int z=x;z<row;z++)
	{
		System.out.print("* ");
	}
//To prints stars 

} 
//Cursor goes to the new line after printing each line. 
System.out.println(); 
} 
} 
