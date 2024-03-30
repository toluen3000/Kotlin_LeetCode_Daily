open class MobileManager:InterfaceMobileManager {

    var listMobileManager:MutableList<Mobile> = mutableListOf() // list dung de luu tru Mobile

    //cons k doi so
    constructor(){
    }
    //constructor co doi so
    constructor(listMobileManager: MutableList<Mobile>) {
        this.listMobileManager = listMobileManager
    }

    override fun addMobile(m: Mobile) {
        listMobileManager.add(m)
    }


    override fun deleteMobile(m: Mobile):Boolean {
        //xoa theo ten
        for (i in this.listMobileManager.indices){
            if(listMobileManager[i].Product_name.contains(m.Product_name)){
                this.listMobileManager.removeAt(i)
                return true
            }
        }
        return false
    }

    override fun viewMobileList(listMobile: MutableList<Mobile>) {
        for (i in listMobile){
            print(i)
            println()
        }
    }

    override fun searchMobile(mobileName: String): MutableList<Mobile> {
        var searchedMobile:MutableList<Mobile> = mutableListOf()
        var findMobile = this.listMobileManager.find { it.Product_name.contains(mobileName) }
        if (findMobile != null){
            searchedMobile.add(findMobile)

        }
        var ramFracMobile:Mobile = Mobile()
        return searchedMobile
    }

    override fun sortMobile(mobileList: MutableList<Mobile>) {
        TODO("Not yet implemented")
    }


}