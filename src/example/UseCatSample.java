package example;

public class UseCatSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat tama = new Cat();
		tama.name = "タマ";
		tama.eat();
		tama.playToy("ひも");
		
		boolean h = tama.isHungry();
		if (h == true) {
			System.out.println("お腹がすいてるにゃー！");
		} else {
			System.out.println("お腹はすいてないにゃー！");
		}
	}

}
