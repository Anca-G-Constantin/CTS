import java.util.ArrayList;

class OnlineShop {
    private String onlineShopName;
    private String image;
    private ArrayList<Product> products;

    OnlineShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image = img;
        this.onlineShopName = name;
    }

    public void addOrder(Product p){
        this.products.add(p);
    }

    public void deleteOrder(Product p){
        this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String img) {
        this.image = img;
    }
}

class Product
{
    private int id;
    private String prodName;
    private double productPrice;
    private int productType;
    private int productCategory;
    private int quantity;
    private String expiration; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String n, double p, int pt, int pc, int id, String exp)
    {
        prodName = n;
        productPrice = p;
        productType = pt;
        productCategory = pc;
        this.id = id;
        this.expiration = exp;
    }

    public Product(Product p)
    {
        this.prodName = p.prodName;
        this.productPrice = p.productPrice;
        this.productType = p.productType;
        this.productCategory = p.productCategory;
        this.id = p.id;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public boolean equals(Product p)
    {
        if(p.id != this.id || !p.prodName.equals(this.prodName) ||p.productPrice != this.productPrice ||
        p.productType != p.productType|| p.productCategory != this.productCategory)
            return false;
        else
            return true;
    }

//    public void modify(boolean flag, double val)
//    {
//        if(flag)
//            this.productPrice+=this.productPrice*val;
//        if(!flag)
//            this.productPrice-=this.productPrice*val/100;
//    }
    public void increase(double val){
        this.productPrice+=this.productPrice*val;
    }

    public void decrease(double val){
        this.productPrice-=this.productPrice*val/100;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String username;
    private String id;
    private ArrayList<Order> orders;
    private ArrayList<Order> canceledOrders;

    public User(String user, String id)
    {
        this.username = user;
        this.id = id;
        orders=new ArrayList<Order>();
        canceledOrders=new ArrayList<Order>();
    }

    public void addO1(Order o)
    {
        if(o.status)
        this.orders.add(o);
    }

    public void addO2(Order o)
    {
        if(!o.status)
        this.canceledOrders.add(o);
    }
}

class Order
{
    private ArrayList<Product> products;
    private String address;
    boolean status;

    public Order()
    {
        products = new ArrayList<Product>();
    }
    public void add(Product p)
    {
        if(products.size() > 99)
            return;

        products.add(p);
    }

    public void remove(Product p)
    {
        products.remove(p);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class InventoryProduct implements ProductQuantity {
    private Product product;

    public InventoryProduct(Product p, int quantity)
    {
        this.product = new Product(p);
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product p) {
        this.product = p;
    }

    @Override
    public int getQuantity() {
        return product.getQuantity();
    }

    @Override
    public void setQuantity(int q) {
        product.setQuantity(q);
    }

}




