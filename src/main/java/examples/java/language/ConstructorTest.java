package examples.java.language;


class ConstA {

	ConstA() {
		System.out.println("toto");
	}
}

class ConstB extends ConstA {

}

class ConstC extends ConstB {

}

public class ConstructorTest {

	public static void main(String[] args) {
		new ConstC();
	}

}
