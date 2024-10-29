package sky.pro.ExamQuestions.Services;

import sky.pro.ExamQuestions.Question;

import java.util.ArrayList;
import java.util.List;

public class ExaminerServiceImpl implements ExaminerService {
    private final JavaQuestionService javaQuestionService;

    public ExaminerServiceImpl(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @Override
    public List<Question> getQuestions(int amount) {
        if (amount > javaQuestionService.getAllQuestions().size()) {
            throw new IllegalArgumentException("Not enough questions available.");
        }

        List<Question> selectedQuestions = new ArrayList<>();
        while (selectedQuestions.size() < amount) {
            Question question = javaQuestionService.getRandomQuestion();
            if (!selectedQuestions.contains(question)) {
                selectedQuestions.add(question);
            }
        }
        return selectedQuestions;
    }
}
