
public class Emp {
       String EName;
       int Eid;
       String Add;
       int mobile;
	public Emp(String eName, int eid, String add, int mobile) {
		super();
		EName = eName;
		Eid = eid;
		Add = add;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Emp [EName=" + EName + ", Eid=" + Eid + ", Add=" + Add + ", mobile=" + mobile + "]";
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
       
}
