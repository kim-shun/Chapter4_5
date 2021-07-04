package example;

public class UseCatSample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat tama = new Cat();
		Cat mike = new Cat();
		
		tama.setName("タマ");
		tama.setAge(3);
		mike.setName("みけ");
		mike.setAge(2);
		tama.introduceMyself();
		mike.introduceMyself();
	}

}
