package Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    GradeService gradeService;
    @Mock
    GradeSystem gradeSystem;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        gradeService = new GradeService(gradeSystem);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeSystem.gradesFor(anyLong())).thenReturn(Arrays.asList(100.0, 100.0, 100.0));
        double result = gradeService.calculateAverageGrades(1);
        assertEquals(100,result);
    }
}
