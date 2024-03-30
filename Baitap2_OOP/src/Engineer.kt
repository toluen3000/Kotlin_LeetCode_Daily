class Engineer:Officer {
    private var yearExperience:Int = 0

    //construct
    constructor() : super()
    constructor(
        idOfficer: String,
        nameOfficer: String,
        ageOfficer: Int,
        emailOfficer: String,
        yearExperience: Int
    ) : super(idOfficer, nameOfficer, ageOfficer, emailOfficer) {
        this.yearExperience = yearExperience
    }

    var YearExperience:Int
        get() {return yearExperience}
        set(value) {yearExperience = value}


}