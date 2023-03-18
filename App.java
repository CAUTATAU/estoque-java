import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Produto produto = new Produto("ps5", 4999.99, 200);
        System.out.println(produto.toString());
        produto.AddProducts(50);
        System.out.println(produto);
        
}
}
