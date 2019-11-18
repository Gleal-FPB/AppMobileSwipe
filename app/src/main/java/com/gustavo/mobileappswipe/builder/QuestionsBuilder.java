package com.gustavo.mobileappswipe.builder;

import com.gustavo.mobileappswipe.entity.Question;
import com.gustavo.mobileappswipe.enums.OptionEnum;
import com.gustavo.mobileappswipe.enums.QuestionTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe construtora de perguntas
 */
public class QuestionsBuilder {

    public List<Question> build() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("Qual é seu nome?", QuestionTypeEnum.SINGLE).addOption("Gustavo", false));
        questions.add(new Question("5 + 5 = 10?", QuestionTypeEnum.MULTIPLE)
                .addOption(OptionEnum.YES.getOption(), true)
                .addOption(OptionEnum.NO.getOption(), false)
        );

        return questions;
    }
}
