package Animals.birds.flying;

import Animals.Animal;
import Animals.birds.Bird;

import java.util.Objects;

public class Flying extends Bird {
    private String moveType;

    public void fly() {

    }

    public Flying(String name, int age, String habitat, String moveType) {
        super(name, age, habitat);
        if (moveType == null || moveType.isEmpty()){
            this.moveType = "go";
        } else {
            this.moveType = moveType;
        }    }

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
        Flying flying = (Flying) o;
        return moveType == flying.moveType && Objects.equals(moveType, flying.moveType);
        }
    @Override
    public String toString() {
        return "Животное: " + getName() + ". Возраст: " + getAge() + "г. Среда обитания: " + getHabitat() + ". Тип передвижения: " + moveType + ".";
    }
    }

