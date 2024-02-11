
public class PrintedBook extends Book {

	
	private int edition;
	private String CoverType;
	
	
	public PrintedBook (String serialnum,String bookname,int year,Author author,int pages,String gener, double price,int edition, String CoverType) {
		super(serialnum,bookname,year,author,pages,gener,price);
		this.edition = edition;
		setCoverType(CoverType);
	}
	
	public void setCoverType(String CoverType) {
		CoverType = CoverType.toLowerCase();
		if(CoverType.equals("soft")||CoverType.equals("hard")) {
			this.CoverType = CoverType;
		}
	}
	
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    
	    }
		return false;
	}
	    

	

	@Override
	public double getDiscount() {
		return 0;
	}
	
	 public int getEdition() {
	        return edition;
	    }

	    public String getCoverType() {
	        return CoverType;
	    }
	    
			
	    
	    public String toString() {
	        return super.toString() + "\nBook type - Printed book\n" + " Edition: " + edition + " \nCover: " + CoverType;

	    }
}
