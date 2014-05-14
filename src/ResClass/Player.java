package ResClass;

public class Player {
	private int playerId;
	private int fideid ;
	private String name ;
	private String sex ;
	private String country ;
	private int rating ;
	private int k ;
	
	public Player(){
		//asd
	}

	public int getFideid() {
		return fideid;
	}

	public void setFideid(int fideid) {
		this.fideid = fideid;
	}
	public int getplayerId() {
		return fideid;
	}

	public void setplayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getK() {
		return k;
	}

	public void setK(int i) {
		this.k = i;
	}

	@Override
	public String toString() {
		return "player [fideid=" + fideid + ", name=" + name + ", sex=" + sex
				+ ", country=" + country + ", rating=" + rating + ", k=" + k
				+ "]";
	}
}
