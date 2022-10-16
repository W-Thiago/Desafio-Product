package entities;

public class Product {

    public String name;
    public double price;  // atributos
    public int quantity ;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct( int quantity  ) {
        this.quantity+= quantity;
    }

    public void removeProduct( int quantity  ) {
        this.quantity -= quantity;
    }

    public String toString() {
        return    name
                +  ", $ "
                + String.format("%.2f", price)   // String.format serve para  %.2f=formataçao marcador
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}

         /*Discussão
        • Toda classe em Java é uma subclasse da classe Object
        • Object possui os seguintes métodos:
         • getClass- retorna o tipo do objeto
        • equals - compara se o objeto é igual a outro
        • hashCode - retorna um código hash do objeto
        • toString - converte o objeto para string*/
