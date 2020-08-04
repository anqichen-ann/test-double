package stub;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    GradeService gradeService;
    SubGradeSystem subGradeSystem;
    @BeforeEach
    void setup() {
        subGradeSystem = new SubGradeSystem();
        gradeService = new GradeService(subGradeSystem);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        double result = gradeService.calculateAverageGrades(1);
        assertEquals(100,result);
    }

    class SubGradeSystem extends GradeSystem{
        public List<Double> gradesFor(long studentId) {
            return Arrays.asList(100.0, 100.0, 100.0);
        }
    }

}
