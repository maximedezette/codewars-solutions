import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TripleSorter {

    public static final String DELIMITER = ",";

    public static String sort(List<Student> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed()
                        .thenComparing(TripleSorter::getFirstLetterOfLastName)
                        .thenComparing(Student::getAge))
                .map(Student::getFullName)
                .collect(Collectors.joining(DELIMITER));
    }

    private static char getFirstLetterOfLastName(Student student) {
        return student.getFullName().split(" ")[1].charAt(0);
    }
}
