package cn.sxt.vo;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("name="+name);
	}
}
