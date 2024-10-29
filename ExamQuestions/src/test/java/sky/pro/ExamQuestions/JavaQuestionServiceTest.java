package sky.pro.ExamQuestions;

import org.junit.jupiter.api.Test;
import sky.pro.ExamQuestions.Services.JavaQuestionService;

import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceTest {

    @Test
    public void testAddAndGetAllQuestions() {
        JavaQuestionService service = new JavaQuestionService();
        service.addQuestion(new Question("You really wanna learn java?", "Yep i tnk its best  programming language."));

        assertEquals(1, service.getAllQuestions().size());
        assertEquals("whats java ?", service.getAllQuestions().get(0).getQuestion());
    }
}