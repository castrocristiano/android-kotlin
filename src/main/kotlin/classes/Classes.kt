package classes

import classes.data.FormData
import classes.enum.Priority

fun callClasses() {
    val people = People(1987, name = "Fulano")

    println("Name is ${people.name}, Birthday year is ${people.birthdayYear}")

    people.wakeUp()

    val newPeople = People(1987, name = "Fulano", "1234567897")

    println("Name: ${newPeople.name}, Year: ${newPeople.birthdayYear}, Doc: ${newPeople.doc}")

    newPeople.sleep()

    val animal = Animal("Dog")

    println("Specie: ${animal.specie}")

    animal.speak = "No"

    println(animal.speak)

    animal.speak = "yes"

    println(animal.speak)

    println("Enum Priority:")

    for (p in Priority.values())
        println(p)

    for (p in Priority.values())
        println("Name: ${p.name}, Value: ${p.code}")

    println("DATA CLASSES")

    val f1 = FormData(10, 8)

    println(f1.hashCode())

    println(f1.toString())

    val f2 = FormData(10, 8)

    println(f2.hashCode())

    println(f2.toString())

    println(f1.equals(f2))
}

