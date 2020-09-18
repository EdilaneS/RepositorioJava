import java.util.ArrayList;
import java.util.List;

public class Estoque {

	public static void main(String[] args) {
		
		List<String>estoque=new ArrayList();
		List<String>segundoEstoque=new ArrayList();
		
		estoque.add("Chocolate");
		estoque.add("Café");
		estoque.add("Refrigerante");
		estoque.add("Chá");
		estoque.add("Agua");
		
		System.out.println(estoque);
		
		estoque.remove("Chá");

		System.out.println(estoque);

		
		segundoEstoque.add("Sal");
		segundoEstoque.add("Açúcar");
		segundoEstoque.add("Óleo");
		
		estoque.addAll(segundoEstoque);
		
		
		
		for(String lista:estoque) {
			System.out.println(lista);
		}
		
		
		
	}

}
