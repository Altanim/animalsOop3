package Animals.mammals.predators;

import Animals.Animal;
import Animals.mammals.Mammal;

import java.util.Objects;

public class Predator extends Mammal {
    private String foodType;

    public void hunt(){

    }

    public Predator(String name, int age, String habitat, int moveSpeed, String foodType) {
        super(name, age, habitat, moveSpeed);
        if (foodType == null || foodType.isEmpty()){
            this.foodType = "food";
        } else {
            this.foodType = foodType;
        }
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void walk() {

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
        Predator predator = (Predator) o;
        return foodType == predator.foodType && Objects.equals(foodType, predator.foodType);
    }
    @Override
    public String toString() {
        return "Животное: " + getName() + ". Возраст: " + getAge() + "г. Среда обитания: "
                + getHabitat() + ". Скорость передвижения: " + getMoveSpeed() + "км/ч." + " Тип пищи: " + getFoodType()
                + ".";
    }
}
