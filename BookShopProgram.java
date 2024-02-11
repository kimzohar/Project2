import java.util.ArrayList;

public class BookShopProgram {

	public static void main(String[] args) {
		BookShop bookShop = new BookShop("Kim's Book Shop", "www.kim'sbookshop.com");
		
		bookShop.addbook(new PrintedBook("011","Friends",2022,new Author("013258745", "Ross", "Geller", 30, "Male"),64,"Thriller",119.90,5,"soft"));
		bookShop.addbook(new PrintedBook("012", "Cooking book", 2013, new Author("065894785", "Monica", "Geller", 27, "Female"), 120, "horror",145.90,4,"hard"));
	    bookShop.addbook(new AudioBook("015", "London", 2008, new Author("315478492", "Reichel", "Green", 26, "Female"), 501, "other",309.90,"AAC","woman"));
	    bookShop.addbook(new AudioBook("016", "Ross and Reichel wedding", 2004, new Author("205478965", "Phibi", "Bufe", 32, "Female"), 1003, "kids",249.90,"MP3","man"));
	    bookShop.addbook(new ElectronicBook("017", "The End", 2001, new Author("203698547", "Chendler", "Bing", 36, "Male"), 200, "horror",160,"pdf",40.5));
	    bookShop.addbook(new ElectronicBook("018", "John life", 1990, new Author("320469851", "John", "Doe", 50, "Male"), 805, "Thriller",759.90,"kindle",504));
	    bookShop.addbook(new LanguageAudioBook("019", "Shakespeare", 1997, new Author("069854123", "William", "Shakespeare", 45, "Male"),1000, "kids",89.90,"AAC","woman","spanish"));
	    bookShop.addbook(new LanguageAudioBook("020", "Alisa", 1994, new Author("318745632", "Virginia", "Wolf", 30, "Female"), 300, "kids",105.5,"FLAC","man","spanish"));
	    bookShop.addbook(new LanguageAudioBook("021", "Harry Poter", 2020, new Author("206589325", "J.K", "Rowling", 30, "Male"), 900, "Thriller",50,"MP3","man","french"));
	    bookShop.addbook(new PrintedBook("013", "Nill's", 2014, new Author("305912874", "Selma", "Lagerlof", 71, "Female"), 750, "Other",349.90,7,"soft"));
	    bookShop.addbook(new LanguageAudioBook("030", "Harry Poter2", 1995, new Author("369852014", "J.K", "Rowling", 30, "Male"), 350, "Thriller",500,"FLAC","man","spanish"));
		bookShop.addbook(new PrintedBook("003","The End",2023,new Author("058745216", "Danny", "Gil", 45, "Male"),64,"Thriller",450.6,3,"soft"));



        
        
        System.out.println(bookShop);
        Book mostExpensiveBook = bookShop.findMostExpensiveBook();
        Book maxElectronicBook = bookShop.MaxtElectronicBook();
        ArrayList<LanguageAudioBook> spanishAudioBooksUnder100 = bookShop.SpanishOnly();

         

        System.out.println("$$$ The most expensive book $$$ "+"\n"+mostExpensiveBook);
        System.out.println("Audio Spanish books under 100$ after discount: ");
        System.out.println(spanishAudioBooksUnder100);
	}
        
    }
        
      

