class Child1 extends Parent implements Printable {
    private String child1Field;

    public Child1(String commonField, String child1Field) {
        super(commonField);
        this.child1Field = child1Field;
    }

    public String getChild1Field() {
        return child1Field;
    }

    @Override
    public void print() {
        System.out.println("Общее поле для всех 1: " + getCommonField());
        System.out.println("Дочерний класс 1: " + getChild1Field());
    }
}
