public class VO {
	private int num;
	private String id, pwd, name;
	private float data1, data2, data3;

	public VO() {
		super();
	}
	
	public VO(String id) {
		super();
		this.id = id;
	}


	public VO(int num, String id, String pwd, String name, float data1, float data2, float data3) {
		super();
		this.num = num;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

	public VO(String id, String pwd, String name, float data1, float data2, float data3) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getData1() {
		return data1;
	}

	public void setData1(float data1) {
		this.data1 = data1;
	}

	public float getData2() {
		return data2;
	}

	public void setData2(float data2) {
		this.data2 = data2;
	}

	public float getData3() {
		return data3;
	}

	public void setData3(float data3) {
		this.data3 = data3;
	}

	@Override
	public String toString() {
		return "VO [num=" + num + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", data1=" + data1 + ", data2="
				+ data2 + ", data3=" + data3 + "]";
	}
	
}