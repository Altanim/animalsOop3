import Animals.Animal;
import Animals.amphibians.Amphibian;
import Animals.birds.flightless.Flightless;
import Animals.birds.flying.Flying;
import Animals.mammals.herbivore.Herbivore;
import Animals.mammals.predators.Predator;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Herbivore gazelle = new Herbivore("Газель", 4,"полупустыня",97,"трава");
        Herbivore giraffe = new Herbivore("Жираф",6, "саванна", 60, "листья");
        Herbivore horse = new Herbivore("Лошадь", 2,"степи",88,"трава");
        Predator hyena = new Predator("Гиена", 7,"саванна", 64, "падаль");
        Predator tiger = new Predator("Тигр",10,"лес, джунгли", 55, "мясо");
        Predator bear = new Predator("Медведь", 12,"лес",56,"всеяден");
        Amphibian frog = new Amphibian("Лягушка",1, "пруд");
        Amphibian viper = new Amphibian("Уж", 1, "водоем");
        Flightless peacock = new Flightless("Павлин", 2,"джунгли","ходьба");
        Flightless penguin = new Flightless("Пингвин", 3, "Антарктида", "ходьба");
        Flightless dodo = new Flightless("Птица додо", 2, "лес", "ходьба");
        Flying gull = new Flying("Чайка",2,"морской простор", "полет");
        Flying albatross = new Flying("Альбатрос",1,"морской простор", "полет");
        Flying falcon = new Flying("Сокол",3,"степь", "полет");
        equals(dodo,hyena);
        equals(gull,gull);
        animalInfo(frog);
        animalInfo(hyena);
        animalInfo(horse);
    }
    public static void equals(Object o, Object a) {
        Animal animal = (Animal) o;
        Animal animal1 = (Animal) a;
       if (animal.equals(animal1)) {
           System.out.println("Животные " + ((Animal) o).getName() + " и " + ((Animal) a).getName() + " равны");
       } else {System.out.println("Животные " + ((Animal) o).getName() + " и " + a.getClass() + " не равны");}
    }
    public static void animalInfo(Object o){
        System.out.println(o);
    }
    }

