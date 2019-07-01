package demc.checkpoint3;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {

    private String[] mOptions;
    private int mAnswer;

    public MultipleChoiceQuestion(String text, String[] options, int answer){
        super(text);
        mOptions = options;
        mAnswer = answer;
    }

    @Override
    public boolean checkAnswer(int ans){
        return (mAnswer == ans);
    }

    public boolean isMultipleChoiceQuestion(){
        return true;
    }

}
