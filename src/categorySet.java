public class categorySet {
	public String small;
	public String medium;
	public String large;
	
	public categorySet(String large, String medium, String small){
		this.large = large;
		this.medium = medium;
		this.small = small;
	}
	
	@Override
	public categorySet(String large, String medium){
		this.large = large;
		this.medium = medium;
	}
}
