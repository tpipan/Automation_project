package homework04.Catalog;
import java.util.*;

public class Catalog {

    HashMap<String, Double> setList = new HashMap<>();

    public void displayStudentNames() {
        System.out.println("Display all student names:");
        for (Object student : setList.keySet()) {
            System.out.println(student);
        }
    }
    public void addNewStudent(String name, Double finalGrade) {
        setList.put(name, finalGrade);
    }

    public void checkStudentByName(String studentName) {
        System.out.println("Check student by name:");
        for (String student : setList.keySet()) {
            if (student.contains(studentName)) {
                System.out.println("Student Name: " + student);
                System.out.println("Student Grade: " + setList.get(student));
            }
        }
    }

    public void deleteStudent(String name) {
        setList.remove(name);
        System.out.println("Deleted Student with name: " + name);
    }

    public void alphabeticalOrder() {
        System.out.println("Students in alphabetical order:");
        Map<String, Double> sortedMap = new TreeMap<>(setList);

        for (String student : sortedMap.keySet()) {
            System.out.println(student);
        }
    }

    public void gradeOrder() {
        List<Map.Entry<String, Double>> entryList = new ArrayList<>(setList.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> entry1, Map.Entry<String, Double> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });
        LinkedHashMap<String, Double> sortedHashMap = new LinkedHashMap<>();

        System.out.println("Students ordered by grades:");

        for (Map.Entry<String, Double> entry : entryList) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}





