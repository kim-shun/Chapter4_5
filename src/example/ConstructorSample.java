package example;

public class ConstructorSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("--- new Cat()でインスタンスを生成する ---");
		Cat tama = new Cat();
		
		System.out.println();
		System.out.println("--- setName/setAgeする前に、自己紹介させる ---");
		tama.introduceMyself();
		
		tama.setName("タマ");
		tama.setAge(3);
		
		System.out.println();
		System.out.println("--- setName/setAgeしたあとで、自己紹介させる ---");
		tama.introduceMyself();
		}

}
