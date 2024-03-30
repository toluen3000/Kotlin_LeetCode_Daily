import java.util.*
import java.util.Spliterator.OfInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    //tao instant ManagerOfficer quan ly dsach
    var listManager = ManagerOfficer()

    //tao cac instant worker, engineer, officer
    var worker1:Officer = Worker("W1","Nguyen A",20,"Vailozdaucatmoiz","123" )
    var worker2:Officer = Worker("W2","Ngo Van B",20,"Vailozdaucatmoiz","123" )
    var officer1:Officer = Officer("O1","Nguyen Van C",20,"Vailozdaucatmoiz" )
    var engineer1:Officer = Engineer("E1","Do Van A",20,"Vailozdaucatmoiz",5 )

    listManager.addOfficer(worker1)
    listManager.addOfficer(worker2)
    listManager.addOfficer(officer1)
    listManager.addOfficer(engineer1)


    while (true){
        println("---------------------")
        println("Menu")
        println("1. Them officer")
        println("2. Delete officer")
        println("3. Search by name")
        println("4. Show all")
        println("5. Exit")
        println("Nhap vao lua chon cua ban: ")
        var choose:Int = 0
        var chooseString:String? = readLine()
        if (chooseString != null){
            choose = chooseString.toInt()
        }

        when(choose){
            1 -> {
                println("Enter 1 to add worker")
                println("Enter 2 to add officer")
                println("Enter 3 to add engineer")
                println("Enter 4 to back ")
                println("Nhap vao lua chon cua ban: ")
                var choice:Int = 0
                var choiceString:String? = readLine()
                if (choiceString != null){
                    choice = choiceString.toInt()
                }
                when (choice){
                    1 -> {
                        var workerX:Officer = Worker()

                        println("Nhap id: ")
                        var idOff:String = scanner.nextLine()

                        println("Nhap ten: ")
                        var nameOff:String = scanner.nextLine()

                        println("Nhap tuoi: ")
                        var ageOff:Int  = scanner.nextInt()

                        println("Nhap email")
                        scanner.nextLine()
                        var emailOff:String = scanner.nextLine()

                        println("Nhap chi nhanh: ")
                        var branchWork:String = scanner.nextLine()

                        workerX = Worker(idOff,nameOff,ageOff,emailOff,branchWork)

                        listManager.addOfficer(workerX)

                    }
                    2 -> {
                        var officerX:Officer = Officer()
                        println("Nhap id: ")
                        var idOff:String = scanner.nextLine()

                        println("Nhap ten: ")
                        var nameOff:String = scanner.nextLine()

                        println("Nhap tuoi: ")
                        var ageOff:Int  = scanner.nextInt()

                        println("Nhap email")
                        var emailOff:String = scanner.nextLine()

                        officerX = Officer(idOff,nameOff,ageOff,emailOff)
                        listManager.addOfficer(officerX)

                    }
                    3 -> {
                        var engineerX:Officer = Engineer()
                        println("Nhap id: ")
                        var idOff:String = scanner.nextLine()

                        println("Nhap ten: ")
                        var nameOff:String = scanner.nextLine()

                        println("Nhap tuoi: ")
                        var ageOff:Int  = scanner.nextInt()

                        println("Nhap email")
                        scanner.nextLine()
                        var emailOff:String = scanner.nextLine()

                        println("Nhap nam kinh nghiem")
                        var yearEngineer:Int = scanner.nextInt()
                        engineerX = Engineer(idOff,nameOff,ageOff,emailOff,yearEngineer)
                        listManager.addOfficer(engineerX)

                    }
                    4 ->{

                    }

                }
            }
            2 -> {
                var o:Officer = Officer()
                println("Nhap ten can tim Xoa")
                var name2Del:String = scanner.nextLine()
                o.NameOfficer = name2Del
                listManager.deleteOfficer(o)
            }
            3 -> {
                println("Nhap vao ten can tim kiem: ")
                var nameSearch:String = scanner.nextLine()
                listManager.searchOfficer(nameSearch)
            }
            4 -> {
                listManager.showOfficer()
            }
            5 -> {
                exitProcess(0)
            }
        }


    }
}