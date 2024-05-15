public class Child3 extends Parent implements Printable{
    public boolean child3Field;

    public Child3(String commonField, boolean child3Field) {
        super(commonField);
        this.child3Field = child3Field;
    }

    public boolean isChild3Field() {
        return child3Field;
    }

    @Override
    public void print() {
        System.out.println("Общее поле для всех 3: " + getCommonField());
        System.out.println("Дочерний класс 3: " + getCommonField());
    }
}
