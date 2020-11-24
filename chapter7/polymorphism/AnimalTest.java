package chapter7.polymorphism;

class Animal { // 오버라이딩.
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal hAnimal = new Human(); // 형변환. 업캐스팅.
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
    }

    public void moveAnimal(Animal animal) { // 다형성. 하나의 코드가 여러자료형이 구현이 되어 다른 실행이 이루어짐.
        animal.move();
    }
}
