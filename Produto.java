public class Produto
{
    String nome;
    double price;
    int quantity;
    public Produto(String nome, double price, int quantidade)
    {
        this.nome = nome;
        this.price = price;
        this.quantity = quantidade;
    }
    public double TotalValue()
    {
        return (this.price*this.quantity);
    }
    public void AddProducts(int quantity)
    {
        this.quantity += quantity;
        System.out.println("Foram adicionados "+quantity+" itens");
    }
    public void RemoveProducts(int quantity)
    {
        this.quantity -= quantity;
        System.out.println("Foram retirados "+quantity+" itens");
    }
  
   
   @Override
   public String toString() {
       //metodo para retornar as informações do produto
       return "nome: "+this.nome+"\n"+"preço: "+String.format("%.2f", this.price)+"\nquantidade: "+this.quantity;
   }
}
