package HCat;

public class Cat {

    private final String name;
    private boolean hungry;
    private final int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        hungry = true;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate plate){
        if (!hungry) {
            System.out.println(this + " не голоден");
            return;
        }
        hungry = !plate.eat(appetite);
        if (hungry) {
            System.out.println("Нет еды");
        } else {
            System.out.println(this + " поел " + appetite + " ед. еды");
        }
    }

    @Override
    public String toString() {
        return name ;
    }
}
