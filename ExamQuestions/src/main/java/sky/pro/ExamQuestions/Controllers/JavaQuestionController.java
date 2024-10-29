package sky.pro.ExamQuestions.Controllers;

import org.springframework.web.bind.annotation.*;
import sky.pro.ExamQuestions.Question;
import sky.pro.ExamQuestions.Services.JavaQuestionService;

import java.util.List;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @PostMapping("/add")
    public void addQuestion(@RequestParam String question, @RequestParam String answer) {
        javaQuestionService.addQuestion(new Question(question, answer));
    }

    @DeleteMapping("/remove")
    public void removeQuestion(@RequestParam String question, @RequestParam String answer) {
        javaQuestionService.removeQuestion(new Question(question, answer));
    }

    @GetMapping("/")
    public List<Question> getAllQuestions() {
        return javaQuestionService.getAllQuestions();
    }
}
