import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TripleSorterTest {

    TripleSorter tripleSorter = new TripleSorter();

    @Test
    void shouldReturnEmptyStringIfNoStudentsProvided(){
        List<Student> studentList = List.of();

        String sortedStudents = tripleSorter.sort(studentList);

        assertThat(sortedStudents).isEmpty();
    }

    @Test
    void shouldReturnStudentIfOnlyOneProvided(){
        Student student = new Student(23, 88, "David Goodman");
        List<Student> studentList = List.of(student);

        String sortedStudents = tripleSorter.sort(studentList);

        assertThat(sortedStudents).isEqualTo("David Goodman");
    }


    @Test
    void shouldReturnUnorderedStudentList(){
        List<Student> studentList = List.of(
                new Student(23, 88, "David Goodman"),
                new Student(25, 82, "Mark Rose")
        );

        String sortedStudents = tripleSorter.sort(studentList);

        assertThat(sortedStudents).isEqualTo("David Goodman,Mark Rose");
    }
    @Test
    void shouldReturnSortedStudentList(){
        List<Student> studentList = List.of(
                new Student(23, 88, "David Goodman"),
                new Student(25, 82, "Mark Rose"),
                new Student(22, 90,  "Jane Doe"),
                new Student(25, 90,  "Jane Dane")
        );

        String sortedStudents = tripleSorter.sort(studentList);

        assertThat(sortedStudents).isEqualTo("Jane Doe,Jane Dane,David Goodman,Mark Rose");
    }

}
