/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RatingsQuestionsResponseModel {
    private final Integer questionId;
    private final String questionText;
    private Integer responseId;
    private final String responseText;

    public RatingsQuestionsResponseModel() {
        this(null, null, null, null, 15, null);
    }

    public RatingsQuestionsResponseModel(Integer n3, Integer n4, String string2, String string3) {
        this.questionId = n3;
        this.responseId = n4;
        this.responseText = string2;
        this.questionText = string3;
    }

    public /* synthetic */ RatingsQuestionsResponseModel(Integer n3, Integer n4, String string2, String string3, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = null;
        }
        if ((n8 = n7 & 2) != 0) {
            n4 = null;
        }
        if ((n8 = n7 & 4) != 0) {
            string2 = null;
        }
        if ((n7 &= 8) != 0) {
            string3 = null;
        }
        this(n3, n4, string2, string3);
    }

    public static /* synthetic */ RatingsQuestionsResponseModel copy$default(RatingsQuestionsResponseModel ratingsQuestionsResponseModel, Integer n3, Integer n4, String string2, String string3, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = ratingsQuestionsResponseModel.questionId;
        }
        if ((n8 = n7 & 2) != 0) {
            n4 = ratingsQuestionsResponseModel.responseId;
        }
        if ((n8 = n7 & 4) != 0) {
            string2 = ratingsQuestionsResponseModel.responseText;
        }
        if ((n7 &= 8) != 0) {
            string3 = ratingsQuestionsResponseModel.questionText;
        }
        return ratingsQuestionsResponseModel.copy(n3, n4, string2, string3);
    }

    public final Integer component1() {
        return this.questionId;
    }

    public final Integer component2() {
        return this.responseId;
    }

    public final String component3() {
        return this.responseText;
    }

    public final String component4() {
        return this.questionText;
    }

    public final RatingsQuestionsResponseModel copy(Integer n3, Integer n4, String string2, String string3) {
        RatingsQuestionsResponseModel ratingsQuestionsResponseModel = new RatingsQuestionsResponseModel(n3, n4, string2, string3);
        return ratingsQuestionsResponseModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RatingsQuestionsResponseModel;
        if (!bl3) {
            return false;
        }
        object = (RatingsQuestionsResponseModel)object;
        Object object2 = this.questionId;
        Object object3 = ((RatingsQuestionsResponseModel)object).questionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.responseId;
        object3 = ((RatingsQuestionsResponseModel)object).responseId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.responseText;
        object3 = ((RatingsQuestionsResponseModel)object).responseText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.questionText;
        object = ((RatingsQuestionsResponseModel)object).questionText;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getQuestionId() {
        return this.questionId;
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public final Integer getResponseId() {
        return this.responseId;
    }

    public final String getResponseText() {
        return this.responseText;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.questionId;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Object object = this.responseId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.responseText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.questionText;
        if (object != null) {
            n8 = ((String)object).hashCode();
        }
        return n4 + n8;
    }

    public final void setResponseId(Integer n3) {
        this.responseId = n3;
    }

    public String toString() {
        Integer n3 = this.questionId;
        Integer n4 = this.responseId;
        String string2 = this.responseText;
        String string3 = this.questionText;
        StringBuilder stringBuilder = new StringBuilder("RatingsQuestionsResponseModel(questionId=");
        stringBuilder.append(n3);
        stringBuilder.append(", responseId=");
        stringBuilder.append(n4);
        stringBuilder.append(", responseText=");
        return ko_0.a(stringBuilder, string2, ", questionText=", string3, ")");
    }
}

