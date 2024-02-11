
public class AudioBook extends Book {

    private String a_format;
    private String VoiceGender;
    
    
    public AudioBook (String serialnum,String bookname,int year,Author author,int pages,String gener, double price,String a_format,String VoiceGender){
		super(serialnum,bookname,year,author,pages,gener,price);
		SetFormat(a_format);
		SetVoice(VoiceGender);
    }
    
    @Override
	public double getDiscount() {
		return 0;
	}
    
    public void SetFormat(String a_format) {
    	if(!a_format.equals("")) {
    		this.a_format = a_format;
    		
    	}
    }
    
    public void SetVoice(String VoiceGender) {
    	VoiceGender = VoiceGender.toLowerCase();
    	if(VoiceGender.equals("woman")||VoiceGender.equals("man")) {
    		this.VoiceGender = VoiceGender;
    	}
    }
    
    public String getVoice() {
    	return this.VoiceGender;
    }
    
    public String getFormat() {
    	return this.a_format;
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
		return super.toString()+" \nBook type - Audio Book\n"+" Audio format: " + a_format + ", \nVoice Gender: " + VoiceGender;
	}
}
