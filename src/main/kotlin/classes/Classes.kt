package classes

fun personFactory() {
    val people = People(1987, name = "Fulano")

    println("Name is ${people.name}, Birthday year is ${people.birthdayYear}")

    people.wakeUp()

    val newPeople = People(1987, name = "Fulano", "1234567897")

    println("Name: ${newPeople.name}, Year: ${newPeople.birthdayYear}, Doc: ${newPeople.doc}")

    newPeople.sleep()

}

