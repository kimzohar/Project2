
public class Author {
	
	private String id;
	private String Fname;
	private String Lname;
	private int age;
	private String gender;
	
	public Author (String id,String Fname,String Lname,int age,String gender) {
		setId(id);
		setFname(Fname);
		setLname(Lname);
		setAge(age);
		setGender(gender);
		
			
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id.length() == 9)
		    this.id = id;
		
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		if (!fname.equals(""))
		    Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		if (!lname.equals(""))
		    Lname = lname;
	}


	public void setAge(int age) {
		if (age > 0)
			this.age = age;
			
	}
	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		gender = gender.toLowerCase();
		if(gender.equals("female")||gender.equals("male"))
			this.gender = gender;
			
	}
    @Override
	public boolean equals(Object obj) {
    	if(this==obj) {
    		return true;
    		
    	}
		if(!(obj instanceof Author)) {
			return false;
		}
		Author other = (Author)obj;
		return id.equals(other.id);
    }
	
	public String toString() {
		return " details:\n"+"ID: "+this.id+"\nFirst Name: "+this.Fname+"\nLast Name: "+this.Lname+ "\nAge: "+this.age+"\nGender: "+this.gender;
		
	}
	
}

