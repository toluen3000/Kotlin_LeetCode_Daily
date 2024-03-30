interface InterfaceMobileManager {
    fun addMobile(m:Mobile)
    fun deleteMobile(m:Mobile):Boolean
    fun viewMobileList(listMobile: MutableList<Mobile>)
    fun searchMobile(mobileName:String):MutableList<Mobile>
    fun sortMobile(mobileList: MutableList<Mobile>)


}