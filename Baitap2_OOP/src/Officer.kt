open class Officer {
    private var idOfficer:String = ""
    private var nameOfficer:String = ""
    private var ageOfficer:Int = 0
    private var emailOfficer:String = ""

    //tao getter setter cho cac thuoc tinh(attribute)
    var IdOfficer:String
        get() {return idOfficer}
        set(value) {idOfficer = value}


    var NameOfficer:String
        get() {return nameOfficer}
        set(value) {nameOfficer = value}

    var AgeOfficer:Int
        get() {return ageOfficer}
        set(value) {ageOfficer = value}
    var EmailOfficer:String
        get() {return emailOfficer}
        set(value) {emailOfficer = value}





    //tao constructor

    constructor()
    constructor(idOfficer: String, nameOfficer: String, ageOfficer: Int, emailOfficer: String) {
        this.idOfficer = idOfficer
        this.nameOfficer = nameOfficer
        this.ageOfficer = ageOfficer
        this.emailOfficer = emailOfficer
    }

    override fun toString(): String {
        return "Id: ${this.idOfficer}\tName: ${this.nameOfficer}\tAge: ${this.ageOfficer}\tEmail: ${this.emailOfficer}"
    }
}