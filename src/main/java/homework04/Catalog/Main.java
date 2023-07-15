package homework04.Catalog;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        catalog.addNewStudent("Macovei Elena", 9.00);
        catalog.addNewStudent("Gheorghe Dan", 8.00);
        catalog.addNewStudent("Petrescu Olivia", 7.00);
        catalog.addNewStudent("Dan Robert", 9.50);
        catalog.addNewStudent("Mandru Ion", 8.60);
        catalog.addNewStudent("Stefanescu Anda", 7.80);

        catalog.displayStudentNames();

        catalog.addNewStudent("Vlad Ion", 10.00);

        catalog.checkStudentByName("Vlad Ion");

        catalog.deleteStudent("Dan Robert");

        catalog.alphabeticalOrder();

        catalog.gradeOrder();
    }
}
