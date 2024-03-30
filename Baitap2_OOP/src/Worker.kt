class Worker:Officer {
    private var branch:String = ""

    constructor() : super()
    constructor(idOfficer: String, nameOfficer: String, ageOfficer: Int, emailOfficer: String, branch: String) : super(
        idOfficer,
        nameOfficer,
        ageOfficer,
        emailOfficer
    ) {
        this.branch = branch
    }

    var Branch:String
        get() {return branch}
        set(value) {branch = value}

}