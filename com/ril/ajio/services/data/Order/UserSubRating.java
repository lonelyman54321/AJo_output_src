/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;

public class UserSubRating
implements Serializable {
    public int id;
    public int questionId;
    public String subQuestionText;
    public int subResponseId;
    public String title;

    public int getId() {
        return this.id;
    }

    public int getQuestionId() {
        return this.questionId;
    }

    public String getSubQuestionText() {
        return this.subQuestionText;
    }

    public int getSubResponseId() {
        return this.subResponseId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(int n3) {
        this.id = n3;
    }

    public void setQuestionId(int n3) {
        this.questionId = n3;
    }

    public void setSubQuestionText(String string2) {
        this.subQuestionText = string2;
    }

    public void setSubResponseId(int n3) {
        this.subResponseId = n3;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }
}

