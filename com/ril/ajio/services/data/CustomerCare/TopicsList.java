/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import java.io.Serializable;
import java.util.ArrayList;

public class TopicsList
implements Serializable {
    private String faqTopic;
    private ArrayList questionAnswerList = null;

    public String getFaqTopic() {
        return this.faqTopic;
    }

    public ArrayList getQuestionAnswerList() {
        return this.questionAnswerList;
    }

    public void setFaqTopic(String string2) {
        this.faqTopic = string2;
    }

    public void setQuestionAnswerList(ArrayList arrayList) {
        this.questionAnswerList = arrayList;
    }
}

