package sky.pro.ExamQuestions.Services;

import sky.pro.ExamQuestions.Question;

import java.util.List;

public interface ExaminerService {
    List<Question> getQuestions(int amount);
}
