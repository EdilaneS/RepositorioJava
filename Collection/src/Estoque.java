import java.util.ArrayList;
import java.util.List;

public class Estoque {

	public static void main(String[] args) {
		
		List<String>estoque=new ArrayList();
		List<String>segundoEstoque=new ArrayList();
		
		estoque.add("Chocolate");
		estoque.add("Caf�");
		estoque.add("Refrigerante");
		estoque.add("Ch�");
		estoque.add("Agua");
		
		System.out.println(estoque);
		
		estoque.remove("Ch�");

		System.out.println(estoque);

		
		segundoEstoque.add("Sal");
		segundoEstoque.add("A��car");
		segundoEstoque.add("�leo");
		
		estoque.addAll(segundoEstoque);
		
		
		
		for(String lista:estoque) {
			System.out.println(lista);
		}
		
		
		
	}

}
