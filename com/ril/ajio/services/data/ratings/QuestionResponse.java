/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class QuestionResponse {
    private ArrayList questions;

    public QuestionResponse() {
        this(null, 1, null);
    }

    public QuestionResponse(ArrayList arrayList) {
        this.questions = arrayList;
    }

    public /* synthetic */ QuestionResponse(ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            arrayList = null;
        }
        this(arrayList);
    }

    public static /* synthetic */ QuestionResponse copy$default(QuestionResponse questionResponse, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = questionResponse.questions;
        }
        return questionResponse.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.questions;
    }

    public final QuestionResponse copy(ArrayList arrayList) {
        QuestionResponse questionResponse = new QuestionResponse(arrayList);
        return questionResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof QuestionResponse;
        if (!bl3) {
            return false;
        }
        object = (QuestionResponse)object;
        ArrayList arrayList = this.questions;
        object = ((QuestionResponse)object).questions;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.questions;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        return n3;
    }

    public final void setQuestions(ArrayList arrayList) {
        this.questions = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.questions;
        StringBuilder stringBuilder = new StringBuilder("QuestionResponse(questions=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

