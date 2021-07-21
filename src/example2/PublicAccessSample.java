package example2;

import example.Cat;

public class PublicAccessSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat tama = new Cat();
		tama.setName("タマ");
		tama.setAge(3);
		
		tama.eat();
		tama.playToy("ボール");
		tama.introduceMyself();

	}

}
