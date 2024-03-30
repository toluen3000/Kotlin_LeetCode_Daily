import javax.swing.text.StyledEditorKit.BoldAction
import kotlin.system.exitProcess
import MobileManager
fun main(args: Array<String>) {
    var mobile1:Mobile = Mobile("M01","SamsungA50",5000.0,10,"SamSung","4GB")
    var mobile2:Mobile = Mobile("M02","Iphone X",3500.0,8,"Apple","2GB")
    var mobile3:Mobile = Mobile("M03","Xiaomi P30",4000.0,13,"Xiaomi","6GB")
    var mobile4:Mobile = Mobile("M04","Google PX5",6600.0,18,"Google","8GB")
    //   var price = mobile1.getTotalPrice()

//    println("Gia cua tat ca ${mobile1.Product_name} la: $price")

//tao mang danh sach cac san pham;

    var loop:Boolean = true

    //tao 1 list cho MobileManager
    var mobileManager =MobileManager() // tao instance mobileManager de luu tru mobiles trong listMobileManager
                                       // va cung cap cac phuong thuc quan ly ds add, delete

    mobileManager.addMobile(mobile1)
    mobileManager.addMobile(mobile2)
    mobileManager.addMobile(mobile3)
    mobileManager.addMobile(mobile4)


    do {

        println("-------------------------")
        println("Menu")
        println("1.Them Mobile vao danh sach")
        println("2.Xoa Mobile khoi danh sach(theo ten)")
        println("3.View list")
        println("4.Find mobile")
        println("5. mobile")
        println("6.Exit")


            var choose:Int = 0
            println("Nhap vao lua chon cua ban: ")
            var chooseString:String? = readLine()
            if (chooseString != null){
                choose = chooseString.toInt()

            }else{
                println("Ban da nhap sai")
                break
            }

        when(choose){
            1 -> {println("Add mobile to listmobile: ")
                var m:Mobile = Mobile()
                println("Nhap vao product_id: ")
                var idprodcutString:String? = readLine()
                    if (idprodcutString != null){

                        m.Product_id = idprodcutString
                    }else{
                        println("Masp khong duoc null")
                        break
                    }
                println("Nhap vao ten san pham: ")
                var nameProductString:String? = readLine()
                    if (nameProductString != null){
                        m.Product_name = nameProductString
                    }else{
                        println("Name khong duoc null")
                    break
                    }
                //nhap gia

                println("Nhap vao gia san pham: ")
                var priceProductString:String? = readLine()
                    if (priceProductString != null ){
                        m.Product_price = priceProductString.toDouble()
                    }else{
                        println("Gia khong duoc null")
                    }

                //Nhap so luong
                println("Nhap vao so luong san pham: ")
                var totalProductString = readLine()
                if (totalProductString != null){
                    m.Product_total = totalProductString.toInt()
                }else{
                    println("Total khong duoc null")
                }
                println("Nhap vao ten nha san xuat: ")
                var mobileManufacturerString:String? = readLine()
                if (mobileManufacturerString != null){
                    m.Mobile_manufacturer = mobileManufacturerString
                }

                println("Nhap vao RAM: ")
                var mobileRamString:String? = readLine()
                if (mobileRamString != null){
                    m.Mobile_ram = mobileRamString
                }
                    //var newMobile:Mobile = Mobile(m.Product_id,m.Product_name,m.Product_price,m.Product_total,m.Mobile_manufacturer,m.Mobile_ram)
                    mobileManager.addMobile(m)

            }

            2 -> {
                println("Delete mobile out of listmobile: ")
                var m:Mobile = Mobile()
                println("Nhap vao ten mobile can xoa")
                var mobileNameDelete:String? = readLine()
                if (mobileNameDelete != null){
                    m.Product_name = mobileNameDelete
                }

                println("Delete: ${mobileManager.deleteMobile(m)}")



            }
            3 -> {
                println("Danh sach Mobile la : ")
                if (mobileManager.listMobileManager.isEmpty()){
                    println("Danh sach rong")
                }else{
//                    for (i in mobileManager.listMobileManager){
//                        print("$i" + i)
//                        println()
//                    }
                    mobileManager.viewMobileList(mobileManager.listMobileManager)
                }

            }
            4 ->{
                println("Tim kiem Mobile theo ten: ")
                var searchResult:MutableList<Mobile> = mutableListOf()
                var searchName:String? = readLine()
                if (searchName != null){
                    searchResult = mobileManager.searchMobile(searchName)

                }
                println("Danh sach tim kiem la: ")
                for (i in searchResult){
                    print(i)
                    print("\tMobile Manufacturer: ${i.Mobile_manufacturer}")
                    print("\tMobile Ram: ${i.Mobile_ram}")
                    println()
                }



            }
            6 -> exitProcess(0)
        }
    }while (choose != 6)




}
