package book;

public class Author {
	private String fullName, email;
	private char gender;

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Author(String fullName, String email, char gender) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.gender = gender;
	}

	@Override
		public String toString() {
			String str= "";
			str+= String.format("%-35s%-35s%10c", getFullName(),getEmail(),getGender());
			return str;
		}


}
