package sky.pro.ExamQuestions.Services;

import sky.pro.ExamQuestions.Question;

import java.util.List;

public interface QuestionService {

    void addQuestion(Question question);

    void removeQuestion(Question question);

    List<Question> getAllQuestions();
}