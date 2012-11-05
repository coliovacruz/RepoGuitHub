
public class TestaStatic {
	
	public static int minhaVariavelStatic;
	
	public static void main(String args[]){
		TestaStatic.minhaVariavelStatic = 3;
		TestaStatic a = new TestaStatic();
		TestaStatic b = new TestaStatic();
		TestaStatic c = new TestaStatic();
		
		System.out.println("Valor minha variavel: " + minhaVariavelStatic);
	
		a.minhaVariavelStatic = 5;
	
		System.out.println("Valor objeto a: " + a.minhaVariavelStatic);
		System.out.println("Valor objeto b: " + b.minhaVariavelStatic);
		System.out.println("Valor objeto c: " + c.minhaVariavelStatic);
	}
}


