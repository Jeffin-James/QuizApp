package com.jeffin.quizApp.data;

import com.jeffin.quizApp.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
