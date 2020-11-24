package chapter7.polymorphism;

import java.util.ArrayList;

class Animal { // 오버라이딩.
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal hAnimal = new Human(); // 형변환. 업캐스팅.
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        // Eagle human = (Eagle)hAnimal;
        // 컴파일에러는 나지 않으나, 오류. 그래서 instanceof 사용.
        // 다운캐스팅. 다시한번 확인하여 안정적사용을 위해 instanceof 사용.
        // if (hAnimal instanceof Human) {
        // Human human = (Human) hAnimal;
        // human.readBooks();
        // }

        // AnimalTest test = new AnimalTest();
        // test.moveAnimal(hAnimal);
        // test.moveAnimal(tAnimal);
        // test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>(); // ArrayList add.
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);

        // for (Animal animal : animalList) {
        // animal.move();
        // }

    }

    public void testDownCasting(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBooks();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                System.out.println("error");
            }
        }
    }

    public void moveAnimal(Animal animal) { // 다형성. 하나의 코드가 여러자료형이 구현이 되어 다른 실행이 이루어짐.
        animal.move();
    }
}
