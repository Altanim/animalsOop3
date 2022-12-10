package Animals;

import java.util.Objects;

public abstract class Animal {

    private final String name;
    private final int age;

    public abstract void move();

    public abstract void eat();

    public abstract void sleep();

    public Animal(String name, int age) {
        if (name == null || name.isEmpty()) {
            this.name = "animal";
        } else {
            this.name = name;
        }
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animal animal = (Animal) o;
        return name == animal.name && Objects.equals(name, animal.name) && Objects.equals(age, animal.age);
    }
    @Override
    public String toString() {
        return "Животное: " + name + ". Возраст: " + age + "г.";
    }
}
