package animal

trait Animal

class Bird extends Animal
class Mammal extends Animal
class Fish extends Animal

object Animal {
  def apply(animal: String): Animal = animal.toLowerCase match {
    case "bird" => new Bird
    case "mammal" => new Mammal
    case "fish" => new Fish
    case x => throw new RuntimeException(s"Unknown animal: $x")
  }

}
