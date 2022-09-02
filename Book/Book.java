package Book;
import java.util.*;
public class Book {

	public Book() 
	{
	public String bookID, title, author, category; 
	float price;
	public Book(String bookID, String title, string author, String category, float price)
	throws InvalidBookException
	{
		super();
		this.bookID = bookId;
		this.title = title;
		this.author = author;
		if(category.tolowerCase().equals("science")||category.equals("fiction")||category.tolowercase.equals("technology")||category.tolowercase.equals("others"))
			this.category= category;
		else
			throw new InvalidBookException("Category must be 'science','fiction','technology' or 'others'");
		if(price<0)
			throw new InvalidBookException("price cannot be negetive");
		else
			this.price=price;
		if(bookID.charAt(0)!='B'&& bookID.length()!=4)
			throw new InvalidBookException(bookID must start with 'B' and must have length of 4 characters);
		else
			this.bookID = bookID;
}

}
