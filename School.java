
public class School {
    String Sname;
    String SAdd;
    int Fees;
    public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSAdd() {
		return SAdd;
	}
	public void setSAdd(String sAdd) {
		SAdd = sAdd;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	public String getRanks() {
		return Ranks;
	}
	public void setRanks(String ranks) {
		Ranks = ranks;
	}
	public String getHighestrank() {
		return Highestrank;
	}
	public void setHighestrank(String highestrank) {
		Highestrank = highestrank;
	}
	@Override
	public String toString() {
		return "School [Sname=" + Sname + ", SAdd=" + SAdd + ", Fees=" + Fees + ", Ranks=" + Ranks + ", Highestrank="
				+ Highestrank + "]";
	}
	public School(String sname, String sAdd, int fees, String ranks, String highestrank) {
		super();
		Sname = sname;
		SAdd = sAdd;
		Fees = fees;
		Ranks = ranks;
		Highestrank = highestrank;
	}
	String Ranks;
    String Highestrank;
}
