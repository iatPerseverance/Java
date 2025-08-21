package 学生管理系统;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		System.out.println("欢迎来到学生管理系统");
		
		ArrayList<Student>list  = new ArrayList<>();
		
		boolean flag = true;
		while(flag) {
			System.out.println();
			System.out.println("1:添加学生");
			System.out.println("2:删除学生");
			System.out.println("3:修改学生");
			System.out.println("4:查询学生");
			System.out.println("5:退出系统");
			
			int number = sc.nextInt();
		switch(number) {
			case 1->list.add(getcreat(sc));
			case 2->getremove(list);
			case 3->getupdate(list);
			case 4->getread(list);
			case 5-> {
				System.out.println("感谢使用,再见");
				break;
			}
			}
		}
	}
	
	
//	添加学生信息
	public static Student getcreat(Scanner sc) {
		
		
		Student stu1  = new Student();
		System.out.println("请输入id:");
		String id = sc.next();
		stu1.setid(id);
		
		System.out.println("请输入姓名:");
		String name = sc.next();
		stu1.setname(name);
		
		System.out.println("请输入年龄:");
		int age = sc.nextInt();
		stu1.setage(age);
		
		System.out.println("请输入住址:");
		String address = sc.next();
		stu1.setaddress(address);
		
		System.out.println("添加成功");
		return stu1;
		
	}
 
//	删除学生信息
	public static ArrayList getremove(ArrayList<Student>list) {
		
		System.out.println("输入需要删除学生id");
		Scanner sc  =new Scanner(System.in);
		String sid = sc.next();
		
		for(int i = 0;i<list.size();i++) {
			if(sid.equals(list.get(i).getid())) {
				Student remove = list.remove(i);	
				System.out.println("删除成功:"+remove.getname());
				return list;
			}
		}
		System.out.println("删除失败,无此id");
		return list;
	}
	
//	更改学生信息
	public static void getupdate(ArrayList<Student>list) {
		System.out.println("输入需要修改学生id");
		Scanner sc  =new Scanner(System.in);
		String sid = sc.next();
		
		for(int i  = 0;i<list.size();i++) {
			if(sid.equals(list.get(i).getid())) {
				System.out.println(list.get(i).getid()+" "+list.get(i).getname()+" "+list.get(i).getage()+" "+list.get(i).getaddress());
				System.out.println("请输入姓名");
				String name = sc.next();
				list.get(i).setname(name);
				
				System.out.println("请输入年龄");
				int age= sc.nextInt();
				list.get(i).setage(age);
				
				System.out.println("请输入地址");
				String address= sc.next();
				list.get(i).setaddress(address);
				
				System.out.println("修改成功");
			}
			
		}
	}

//	查询学生信息
	public static void getread(ArrayList<Student>list) {
		System.out.println("输入学生id'");
		Scanner sc  =new Scanner(System.in);
		String sid = sc.next();
		for(int i  = 0;i<list.size();i++) {
			if(sid.equals(list.get(i).getid())) {
				System.out.println("id:"+list.get(i).getid());
				System.out.println("姓名:"+list.get(i).getname());
				System.out.println("年龄:"+list.get(i).getage());
				System.out.println("住址:"+list.get(i).getaddress());
			}
		}
		
	}
}
