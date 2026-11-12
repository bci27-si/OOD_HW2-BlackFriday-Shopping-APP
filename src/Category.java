public class Category extends ProductComponent {



    String name;
    //String Category;
    Double price;

    public Category(String name, String Category, double price) {

        this.name = name;
        //this.Category = Category;
        this.price = price;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void add(){
        // add category of product ?
    }

    public void display(){
        //method to show the product’s details (e.g., name and price).
        getName();
        getPrice();

    }


}
