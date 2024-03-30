import java.util.*

class ManagerOfficer {

    var scanner = Scanner(System.`in`)

    var listManager:MutableList<Officer> = mutableListOf()

    constructor(){
        this.listManager = listManager
    }


    fun addOfficer(o:Officer){
        listManager.add(o)
    }

    fun deleteOfficer(o:Officer){
        for (i in listManager.indices){
            if (listManager[i].NameOfficer.contains(o.NameOfficer)){
                listManager.removeAt(i)
                println("Delete Successfully!")
            }
        }
    }
    fun searchOfficer(nameToDelete:String):MutableList<Officer>{
        var searchedList:MutableList<Officer> = mutableListOf()
        for (i in listManager){
            if (i.NameOfficer.contains(nameToDelete))
                searchedList.add(i)
        }
        if (searchedList.isEmpty()){
            println("Khong tim thay !!!")
        }else
            println("Da tim thay !!!")
        return searchedList
    }

    fun showOfficer(){
        for (i in listManager){
            print(i)
            println()
        }
    }
}