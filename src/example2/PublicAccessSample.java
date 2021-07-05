package example2;

import example.Cat;

public class PublicAccessSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat tama = new Cat();
		tama.setName("タマ");
		System.out.println(tama.getName());
		tama.setAge(3);
		System.out.println(tama.getAge());

	}

}
