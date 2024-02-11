public abstract class Book {
	
	private String serialnum;
	private String bookname;
	private int year;
	private Author author;
	private int pages;
	private String gener;
	private double price;
	
	
	
	public Book(String serialnum,String bookname,int year,Author author,int pages,String gener, double price) {
		setSerialnum(serialnum);
		setBookname(bookname);
		setYear(year);
		setAuthor(author);
		setPages(pages);
		setPrice(price);
		setGener(gener);
		
	}

	
	public void setSerialnum(String serialnum) {
		if(!serialnum.equals(""))
			this.serialnum = serialnum;
		
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
					
		}
	}
	
	public void setBookname(String bookname) {
		if (!bookname.equals("")) {
			this.bookname = bookname;
			
		}
	}
	public void setYear(int year) {
		if (year>0)
			this.year = year;
		
	}
	public void setAuthor(Author author) {
		this.author = author;
		
	}
	public void setPages(int pages) {
		if(pages>0)
			this.pages = pages;
		
	}
	
	public String getSerialnum() {
		return this.serialnum;
		
	}
	public double getPrice() {
		return this.price;
	}
	public String getBookname() {
		return this.bookname;
		
	}
	public int getYear() {
		return this.year;
		
	}
	public Author getAuthor() {
		return this.author;
		
	}
	public int getPages() {
		return this.pages;
		
	}
	public void setGener(String gener) {
		gener = gener.toLowerCase();
		if(gener.equals("other")||gener.equals("horror")||gener.equals("thriller")||gener.equals("kids")) {
			this.gener = gener;
			
					
		}
	}
	public String getGener() {
		return this.gener;
		
	}
    @Override
    public boolean equals(Object obj) {
    	if(this==obj) {
    		return true;
    		
    	}
		if(!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book)obj;
		return serialnum.equals(other.serialnum);
			
	}


	@Override
	public String toString() {
		return "\nBook serialnum: " + serialnum + "\nbookname: " + bookname + "\nyear: " + year + "\nauthor" + author
				+ "\npages: " + pages + "\ngener: " + gener + "\nprice: " + price+" ILS"+"\n--------------\n";
	}
	
	public abstract double getDiscount();
}
		
