package com.company;

import java.util.Objects;

public class Dog {
    private DogName nickname;
    private Integer age;

    public Dog(DogName nickname, Integer age) {
        this.nickname = nickname;
        this.age = age;
    }

    public DogName getNickname() {
        return nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return nickname == dog.nickname &&
                Objects.equals(age, dog.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age);
    }

    public void setNickname(DogName nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  nickname +
                " " + age;
    }

}
