import java.util.ArrayList;

public class BookShop {
	
	private String shopname;
	private String url;
	private ArrayList <Book> books;
	
	
	public BookShop (String shopname, String url) {
		this.shopname = shopname;
		this.url = url;
		this.books = new ArrayList<>();
		
	}
	
	public Book FindBook(String serialnum) {
		for(int i = 0; i<books.size(); i++) {
			Book book = books.get(i);
			if (book.getSerialnum().equals(serialnum)) {
				return book;
				
			}
		}
		return null;
	}

    public void addbook(Book book) {
    	if (FindBook(book.getSerialnum()) == null) {
    		books.add(book);
    		
    	}
    	
    		
    	}
    public Book findMostExpensiveBook() {
    	Book tempbook = books.get(0);
    	for(int i = 0; i<books.size(); i++) {
    		Book book = books.get(i);
    		if (book.getPrice() > tempbook.getPrice()) {
        	    tempbook = book;
    		}
    		
    	}
    	return tempbook;
    	
    	
    }
    
    public Book MaxtElectronicBook() {
        ElectronicBook MaxBook = null;
        double MaxSize = 0;

        for (int i =0; i<books.size(); i++) {
    		Book book = books.get(i);
            if (book instanceof ElectronicBook) {
                ElectronicBook electronicBook = (ElectronicBook) book;
                if (electronicBook.getsize() > MaxSize) {
                    MaxSize = electronicBook.getsize();
                    MaxBook = electronicBook;
                }
            }
        }

        return MaxBook;
    }
    
    public ArrayList<LanguageAudioBook> SpanishOnly(){
    	ArrayList spanishAudioBooks = new ArrayList<>();
    	for (int i = 0; i<books.size();i++) {
    		Book book = books.get(i);
            if (book instanceof LanguageAudioBook) {
                 LanguageAudioBook languageAudioBook = (LanguageAudioBook) book;
                 if(languageAudioBook.getLanguage().equals("spanish") && ((languageAudioBook.getPrice())-(languageAudioBook.getDiscount())<=100))
                     spanishAudioBooks.add(languageAudioBook);
    	}
    	}
        return spanishAudioBooks;
        	
        }


	@Override
	public String toString() {
		System.out.println("Shop name: "+ shopname + " \nUrl: "+url +"\nBooks in Kim's shop: ");
		String book = "";
		 for (int i = 0; i < books.size(); i++) {
	        book += books.get(i).toString() + "\n";
	    }
	    
	    return book;
    }
}


