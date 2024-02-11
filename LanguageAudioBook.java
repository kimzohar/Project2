
public class LanguageAudioBook extends AudioBook {

	
	private String Language;
	

	public LanguageAudioBook(String serialnum, String bookname, int year, Author author, int pages, String gener,
			double price, String a_format, String VoiceGender,String Language) {
		super(serialnum, bookname, year, author, pages, gener, price, a_format, VoiceGender);
		setLanguage(Language);
	}
	
	public void setLanguage(String Language) {
		if(!Language.equals("")) {
			this.Language = Language;
		}
	}
	public String getLanguage() {
		return this.Language;
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
		return super.toString()+ "\nBook type -Language Audio book/n" +"Language: " + Language +"\nDiscount: "+getDiscount();
	}
	
	public double getDiscount() {
		return super.getPrice()*0.10;
	}

}
