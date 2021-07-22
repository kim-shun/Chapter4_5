package example;

public class OverLoadSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat tama = new Cat();
		tama.setName("タマ");
		tama.setAge(3);
		
		System.out.println("--- tama.eat()を呼び出す ---");
		tama.eat();
		
		System.out.println();
		System.out.println("--- tama.eat(¥"贅沢なキャットフード¥")を呼び出す ---");
		tama.eat("贅沢なキャットフード");
		
		System.out.println();
		System.out.println("--- tama.playToy(¥"ボール￥")を呼び出す ---");
		tama.playToy("ボール");
		
		System.out.println();
		System.out.println("--- tama.playToy()を呼び出す ---");
		tama.playToy();
	}

}
