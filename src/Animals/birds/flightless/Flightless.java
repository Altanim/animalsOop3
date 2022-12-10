package Animals.birds.flightless;

import Animals.Animal;
import Animals.birds.Bird;

import java.util.Objects;

public class Flightless extends Bird {
    private String moveType;

    public Flightless(String name, int age, String habitat, String moveType) {
        super(name, age, habitat);
        if (moveType == null || moveType.isEmpty()){
            this.moveType = "go";
        } else {
            this.moveType = moveType;
        }
    }

    public void walk() {

    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    @Override
    public void hunt() {

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
        Flightless flightless = (Flightless) o;
        return moveType == flightless.moveType && Objects.equals(moveType, flightless.moveType);
        }
    @Override
    public String toString() {
        return "Животное: " + getName() + ". Возраст: " + getAge() + "г. Среда обитания: " + getHabitat() + ". Тип передвижения: " + moveType + ".";
    }
    }

