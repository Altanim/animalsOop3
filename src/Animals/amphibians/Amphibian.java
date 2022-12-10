package Animals.amphibians;

import Animals.Animal;

import java.util.Objects;

public class Amphibian extends Animal {
    private String habitat;

    public void hunt() {

    }

    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        if (habitat == null || habitat.isEmpty()){
            this.habitat = "habitat";
        } else {
            this.habitat = habitat;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Amphibian amphibian = (Amphibian) o;
        return habitat == amphibian.habitat && Objects.equals(habitat, amphibian.habitat);
        }
    @Override
    public String toString() {
        return "Животное: " + getName() + ". Возраст: " + getAge() + "г. Среда обитания: " + habitat + ".";
    }
    }


