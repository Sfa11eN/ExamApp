package sky.pro.ExamQuestions.Services;

import sky.pro.ExamQuestions.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaQuestionService implements QuestionService {
    private List<Question> questions = new ArrayList<>();
    private Random random = new Random();

    @Override
    public void addQuestion(Question question) {
        questions.add(question);
    }

    @Override
    public void removeQuestion(Question question) {
        questions.remove(question);
    }


    @Override
    public List<Question> getAllQuestions() {
        return new ArrayList<>(questions);
    }

    public Question getRandomQuestion() {
        if (questions.isEmpty()) {
            return null; // or throw an exception
        }
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }
}
