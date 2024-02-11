
public class ElectronicBook extends Book {
	
	
	private String f_format;
	private double size;
	
	
	public ElectronicBook (String serialnum,String bookname,int year,Author author,int pages,String gener, double price,String f_format,double size) {
		super(serialnum,bookname,year,author,pages,gener,price);
		setFormat(f_format);
		setSize(size);

	}
	
    public double getDiscount() {
    	return 0;
    }
    
    public void setSize(double size) {
    	if(size>0) {
    		this.size = size;
    	}
    }
    
    public void setFormat(String f_format) {
    	if(!f_format.equals("")) {
    		this.f_format = f_format;
    	}
    }
    
    public String getFormat() {
    	return this.f_format;
    }
    
    public double getsize() {
    	return this.size;
    	
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
    public String toString() {
        return super.toString() + "\nBook type - Electronic book\n" +" Format: " + f_format + ", \nSize: " + size + "MB";

}
}
