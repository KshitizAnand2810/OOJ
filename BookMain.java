/*Develop a JAVA program to create a class Book which contains four members:name,author,price,num_pages. Include a constructor to set the values for the 
members.Include methods to set and get the details of the objects.Include a toSTring() method that could display the complete details of the book.
Develop a program to create n book objects.*/

import java.util.Scanner;
class Book{
	String name;
	String author;
	double price;
	int num_pages;
	
	Book(String name,String author,double price,int num_pages){
	this.name=name;
	this.author=author;
	this.price=price;
	this.num_pages=num_pages;
	}
	
	void setDetails(){
		name=name;
		author=author;
		price=price;
		num_pages=num_pages;
	}
	
	void getDetails(){
		Scanner s = new Scanner(System.in);
	
	
		System.out.print("Enter Book Name:");
		name=s.nextLine();
		System.out.print("Enter Author Name:");
		author=s.nextLine();
		System.out.print("Enter Price:");
		price=s.nextDouble();
		System.out.print("Enter Number Of Pages:");
		num_pages=s.nextInt();
		System.out.println("---------------------------------");
	}

	public String toString(){
		return ("Book Name :"+name+"\n Author Name :"+author+"\n Price :"+price+"\n Number of Pages :"+num_pages);
	}
}

class BookMain{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n,i;
		System.out.println("Enter Number Of Books");
		n=s.nextInt();
		Book[] books = new Book[n];
		for(i=0;i<n;i++){
			
			System.out.println("Enter details of book "+(i+1));
			books[i]=new Book(" "," ",0.0,0);
			books[i].getDetails();
		}
		for(i=0;i<n;i++){
			System.out.println("Details of book "+(i+1));
			System.out.println(books[i]);
		}
	}
}
