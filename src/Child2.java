public class Child2 extends Parent implements Printable{
    private int child2Field;

    public Child2(String commonField, int child2Field) {
        super(commonField);
        this.child2Field = child2Field;
    }

    public int getChild2Field() {
        return child2Field;
    }

    @Override
    public void print() {
        System.out.println("Общее поле для всех 2: " + getCommonField());
        System.out.println("Дочерний класс 2: " + getChild2Field());
    }
}
