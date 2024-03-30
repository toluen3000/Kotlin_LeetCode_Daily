abstract class Product {
    private var product_id:String = ""
    private var product_name:String = ""
    private var product_price:Double = 0.0
    private var product_total:Int = 0

        //Phuong thuc tinh tong gia tien
        public abstract fun getTotalPrice():Double

        //constructor khong tham so
        constructor()

        //constructor du tham so
    constructor(product_id: String, product_name: String, product_price: Double, product_total: Int) {
        this.product_id = product_id
        this.product_name = product_name
        this.product_price = product_price
        this.product_total = product_total
    }

    override fun toString(): String {
        return "Ma San Pham: $product_id\tTen San Pham: $product_name\tGia San Pham: $product_price\t So Luong: $product_total "

    }
    //tao getter setter

    var Product_id:String
        get() {return product_id}
        set(value) {product_id = value}

    var Product_name:String
        get() {return product_name}
        set(value) {product_name = value}

    var Product_price:Double
        get() {return  product_price}
        set(value) {product_price = value}

    var Product_total:Int
        get() {return  product_total}
        set(value) {product_total = value}

}