package Animals.mammals;

import Animals.Animal;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private String habitat;
    private int moveSpeed;

    public abstract void walk();

    public Mammal(String name, int age, String habitat, int moveSpeed) {
        super(name, age);
        if (habitat == null || habitat.isEmpty()){
            this.habitat = "animal";
        } else {
            this.habitat = habitat;
        }
        if (moveSpeed < 0){
            this.moveSpeed = 1;
        } else {
            this.moveSpeed = moveSpeed;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Mammal mammal = (Mammal) o;
        return habitat == mammal.habitat && Objects.equals(habitat, mammal.habitat) && Objects.equals(moveSpeed, mammal.moveSpeed);
    }
    @Override
    public String toString() {
        return "Среда обитания: " + habitat + ". Скорость передвижения: " + moveSpeed + "км/ч.";
    }
    }

