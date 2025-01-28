
public class College {
     String CName;
     String CAdd;
     int Fees;
     String Placements;
     String HighestPaid;
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getCAdd() {
		return CAdd;
	}
	public void setCAdd(String cAdd) {
		CAdd = cAdd;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	public String getPlacements() {
		return Placements;
	}
	public void setPlacements(String placements) {
		Placements = placements;
	}
	public String getHighestPaid() {
		return HighestPaid;
	}
	public void setHighestPaid(String highestPaid) {
		HighestPaid = highestPaid;
	}
	@Override
	public String toString() {
		return "College [CName=" + CName + ", CAdd=" + CAdd + ", Fees=" + Fees + ", Placements=" + Placements
				+ ", HighestPaid=" + HighestPaid + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public College(String cName, String cAdd, int fees, String placements, String highestPaid) {
		super();
		CName = cName;
		CAdd = cAdd;
		Fees = fees;
		Placements = placements;
		HighestPaid = highestPaid;
	}
     
}
