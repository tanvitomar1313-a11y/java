class Product{
    int id;
    String name;
    double price;
    int qty;
    Product(int i,String n,double p,int q){
        id=i;name=n;price=p;qty=q;
    }
    double calculateTotal(){
        return price*qty;
    }
}
public class ShoppingCart{
    public static void main(String args[]){
        Product p1=new Product(101,"Shoes",1500,2);
        Product p2=new Product(102,"Shirt",800,3);

        double total=p1.calculateTotal()+p2.calculateTotal();
        System.out.println("Total Bill: "+total);

        if(total>5000){
            double discount=0.1*total;
            total=total-discount;
            System.out.println("Discount Applied: "+discount);
        }
        System.out.println("Final Bill: "+total);
    }
}
