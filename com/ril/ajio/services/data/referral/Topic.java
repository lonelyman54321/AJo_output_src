/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Topic {
    private String faqTopic;
    private ArrayList questionAnswerList;

    public Topic(String string2, ArrayList arrayList) {
        this.faqTopic = string2;
        this.questionAnswerList = arrayList;
    }

    public static /* synthetic */ Topic copy$default(Topic topic, String string2, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = topic.faqTopic;
        }
        if ((n3 &= 2) != 0) {
            arrayList = topic.questionAnswerList;
        }
        return topic.copy(string2, arrayList);
    }

    public final String component1() {
        return this.faqTopic;
    }

    public final ArrayList component2() {
        return this.questionAnswerList;
    }

    public final Topic copy(String string2, ArrayList arrayList) {
        Topic topic = new Topic(string2, arrayList);
        return topic;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Topic;
        if (!bl3) {
            return false;
        }
        object = (Topic)object;
        Object object2 = this.faqTopic;
        String string2 = ((Topic)object).faqTopic;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.questionAnswerList;
        object = ((Topic)object).questionAnswerList;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getFaqTopic() {
        return this.faqTopic;
    }

    public final ArrayList getQuestionAnswerList() {
        return this.questionAnswerList;
    }

    public int hashCode() {
        int n3;
        String string2 = this.faqTopic;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        ArrayList arrayList = this.questionAnswerList;
        if (arrayList != null) {
            n4 = arrayList.hashCode();
        }
        return n3 + n4;
    }

    public final void setFaqTopic(String string2) {
        this.faqTopic = string2;
    }

    public final void setQuestionAnswerList(ArrayList arrayList) {
        this.questionAnswerList = arrayList;
    }

    public String toString() {
        String string2 = this.faqTopic;
        ArrayList arrayList = this.questionAnswerList;
        StringBuilder stringBuilder = new StringBuilder("Topic(faqTopic=");
        stringBuilder.append(string2);
        stringBuilder.append(", questionAnswerList=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

