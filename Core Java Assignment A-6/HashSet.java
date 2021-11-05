import java.util.HashSet
    class product {
	private int pid;
	private String pname;
	
	public product(int Id,String Name) {
		this.pid=Id;
		this.pname=Name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
}

public class HashSet {
		
		public static void main(String[] args) {
			product p1 = new product(300,"hdsj");
			product p2 = new product(100,"jwngh");
			product p3 = new product(400,"wcss");
			product p4 = new product(500,"apwq");
			product p5 = new product(200,"cliq");
			
			HashSet<Product> hpr = new HashSet<>();
			hpr.add(p1);
			hpr.add(p2);
			hpr.add(p3);
			hpr.add(p1); // Ignorind Dublicate product.
			hpr.add(p5);
			hpr.add(p4);
			System.out.println(hpr);

		

		
	}

}
