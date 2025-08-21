package 学生管理系统;

public class Student {

	private String id;
	private String name;
	private int age;
	private String address;
	
	public Student() {}
	
	public Student(String id,String name,int age,String address) {
		this.id = id;
		this.name = name;
		this.age= age;
		this.address = address;
	}
	
	public  void setid(String id) {
		this.id =id;
	}
	public  String getid() {
		return id;
	}
	
	public  void setname(String name) {
		this.name =name;
	}
	public  String getname() {
		return name;
	}
	
	public  void setage(int age) {
		this.age =age;
	}
	public  int getage() {
		return age;
	}
	
	public  void setaddress(String address) {
		this.address =address;
	}
	public  String getaddress() {
		return address;
	}
	
}
