class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> int1 = new Wrapper<>();
        int1.setItem(10);

        Wrapper<String> int2 = new Wrapper<>();
        int2.setItem("Hello");

        checkType(int1);
        checkType(int2);
    }

    public static void checkType(Wrapper<?> wrapper) {
        if (wrapper.getItem() instanceof Integer) {
            System.out.println("Wrapper с Integer");
        } else if (wrapper.getItem() instanceof String) {
            System.out.println("Wrapper с String");
        } else {
            System.out.println("Wrapper с неизвестным типом");
        }
    }
}
