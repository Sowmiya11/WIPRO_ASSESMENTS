class Author
{
	private String name;
	private String email;
	private char gender;
	public Author() 
	{
	}
	public Author(String name,String email,char gender) 
	{
      this.name=name;
      this.gender=gender;
      this.email=email;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
}

public class Book 
{ 
    private Author author=new Author("sowmi","sowmiyapriya1112@gmail.com", 'f');
    private String name;
	private double price;
	private int	qtyInStock; 
	
	public Book() 
	{
	}
	public Book(String name)
	{
		this.name=name;
	}
	
    public Author getAuthor() {
		return author;
	}
	public double getPrice()
   {
	return price;
    }
   public void setPrice(double price)
   {
	this.price = price;
   }
    public String getName()
    {
	 return name;
    }
   public int getQtyInStock()
   {
	return qtyInStock;
   }
   public void setQtyInStock(int qtyInStock)
   {
	this.qtyInStock = qtyInStock;
   }
  public static void main(String[] args)
	{
		Book book=new Book("JAVA");
		book.setPrice(1200);
		book.setQtyInStock(12);
		System.out.println("****BOOK INSTANCE****");
		System.out.println("NAME\t\tPRICE\t\tqtyInStock");
		System.out.println(book.name+"\t\t"+book.getPrice()+"\t\t"+book.getQtyInStock());
		System.out.println("****AUTHOR DETAILS****");
		System.out.println("AUTHOR_NAME\t E_MAIL\t\t\t\tGENDER ");
		System.out.println(book.author.getName()+"\t\t"+book.author.getEmail()+"\t"+book.author.getGender());
	}

}
