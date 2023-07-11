package homework04;

import java.util.*;

public class Catalog {
    public static void main(String[] args) {

        Catalog catalog = new Catalog();

        HashMap<String, Double> setList = new HashMap<>();

        catalog.addNewStudent(setList, "Macovei Elena", 9.00);
        catalog.addNewStudent(setList, "Gheorghe Dan", 8.00);
        catalog.addNewStudent(setList, "Petrescu Olivia", 7.00);
        catalog.addNewStudent(setList, "Dan Robert", 9.50);
        catalog.addNewStudent(setList, "Mandru Ion", 8.60);
        catalog.addNewStudent(setList, "Stefanescu Anda", 7.80);

        catalog.displayStudentNames(setList);

        catalog.addNewStudent(setList, "Vlad Ion", 10.00);

        catalog.checkStudentByName(setList, "Vlad Ion");

        catalog.deleteStudent(setList, "Dan Robert");

        catalog.alphabeticalOrder(setList);

        catalog.gradeOrder(setList);

    }


    private void displayStudentNames(HashMap<String, Double> list) {
        System.out.println("Display all student names:");
        for (Object student : list.keySet()) {
            System.out.println(student);
        }
    }

    private void addNewStudent(HashMap<String, Double> map, String name, Double finalGrade) {
        map.put(name, finalGrade);
    }

    private void checkStudentByName(HashMap<String, Double> list, String studentName) {
        System.out.println("Check student by name:");
        for (String student : list.keySet()) {
            if (student.contains(studentName)) {
                System.out.println("Student Name: " + student);
                System.out.println("Student Grade: " + list.get(student));
            }
        }
    }

    private void deleteStudent(HashMap<String, Double> list, String name) {
        list.remove(name);
        System.out.println("Deleted Student with name: " + name);
    }

    private void alphabeticalOrder(HashMap<String, Double> list) {
        System.out.println("Students in alphabetical order:");
        Map<String, Double> sortedMap = new TreeMap<>(list);

        for (String student : sortedMap.keySet()) {
            System.out.println(student);
        }
    }

    private void gradeOrder(HashMap<String, Double> hashMap) {
        List<Map.Entry<String, Double>> entryList = new ArrayList<>(hashMap.entrySet());
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





