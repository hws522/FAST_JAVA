package chapter11.generic;

public class GenericPrinter<T extends Meterial> { // Meterial 에 포함된 T 만 사용 가능.

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting(); // extends Meterial 이기 때문에 Meterial 안에 doPrinting 사용 가능.
    }
}
