import person._


object Main extends App {
  val person = PersonBuilder()
    .setFirstName("Sebastian")
    .setLastName("Pulido")
    .setAge(26)
    .build()

  System.out.println(s"Person: ${person.firstName}")
  System.out.println(s"Person: ${person.lastName}")
}
