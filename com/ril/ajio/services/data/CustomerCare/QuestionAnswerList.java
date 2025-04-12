/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import java.io.Serializable;

public class QuestionAnswerList
implements Serializable {
    private String answer;
    private String question;

    public String getAnswer() {
        return this.answer;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setAnswer(String string2) {
        this.answer = string2;
    }

    public void setQuestion(String string2) {
        this.question = string2;
    }
}

