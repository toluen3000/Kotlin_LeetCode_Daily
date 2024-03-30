class Mobile:Product {
    private var mobile_manufacturer:String =""//hang sx
    private var mobile_ram:String= ""

    constructor() : super()
    constructor(product_id: String, product_name: String, product_price: Double, product_total: Int, mobile_manufacturer:String, mobile_ram:String) : super(
        product_id,
        product_name,
        product_price,
        product_total,
    ){
        this.mobile_manufacturer = mobile_manufacturer
        this.mobile_ram = mobile_ram
    }

    override fun getTotalPrice(): Double {
        return this.Product_price * this.Product_total
    }

    var Mobile_manufacturer:String
        get() {return mobile_manufacturer}
        set(value) {mobile_manufacturer = value}

    var Mobile_ram:String
        get() {return mobile_ram}
        set(value) {mobile_ram = value}


}