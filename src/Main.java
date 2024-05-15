public class Main {
    public static void main(String[] args) {

        Parent child1 = createObject("Child1");
        Parent child2 = createObject("Child2");
        Parent child3 = createObject("Child3");


        Printable[] printables = { (Printable) child1, (Printable) child2, (Printable) child3 };


        for (Printable printable : printables) {
            printable.print();
            System.out.println();
        }
    }

    public static Parent createObject(String className) {
        switch (className) {
            case "Child1":
                return new Child1("Common Field for Child1", "Specific Field for Child1");
            case "Child2":
                return new Child2("Common Field for Child2", 42);
            case "Child3":
                return new Child3("Common Field for Child3", true);
            default:
                return null;
        }
    }
}