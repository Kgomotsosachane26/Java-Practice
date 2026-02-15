import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import vut.Student;

public class StudentTest {

    @Test
    public void studentNumberTest(){

        Student student = new Student();

        String myStudentNumber = "224832778";

        student.setStudentNumber(myStudentNumber);
        assertEquals(myStudentNumber,student.getStudentNumber());

    }

    @Test
    public void testMarkTest(){

        Student student = new Student();

        int myTestMark = 95;

        student.setTestMark(myTestMark);
        assertEquals(myTestMark,student.getTestMark());
    }
}

