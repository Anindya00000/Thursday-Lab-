package management;

public class AdultUser implements LibraryUser //LibraryUser class which implements the LibraryUser interface.
{
	private int age;
	private String bookType; 

	public void setAge(int age) {
		this.age = age;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() // to check whether  a kids account would be possible to create or not.
	{
		if (age > 12)
			System.out.println("You have successfully registered under an Adult Account");
		
		if (age <= 12)
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");

	}

	@Override
	public void requestBook()   //to check the requested book is possible to issued or not. 
	{
		if (bookType.equals("Fiction"))
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");

	}

}