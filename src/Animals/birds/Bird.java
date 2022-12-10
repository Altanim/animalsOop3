package Animals.birds;

import Animals.Animal;

import java.util.Objects;

public abstract class Bird extends Animal {
    private String habitat;
    public abstract void hunt();

    public Bird(String name, int age, String habitat) {
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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bird bird = (Bird) o;
        return habitat == bird.habitat && Objects.equals(habitat, bird.habitat);
        }
    @Override
    public String toString() {
        return "Среда обитания: " + habitat + ".";
    }
    }


