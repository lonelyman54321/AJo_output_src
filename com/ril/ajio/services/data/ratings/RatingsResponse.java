/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import com.ril.ajio.services.data.ratings.AggregateRating;
import com.ril.ajio.services.data.ratings.ImageReviewResponse;
import com.ril.ajio.services.data.ratings.QuestionResponse;
import com.ril.ajio.services.data.ratings.TextReviewResponse;
import com.ril.ajio.services.data.ratings.UserRating;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RatingsResponse {
    private AggregateRating aggregateRating;
    private ImageReviewResponse imageReview;
    private Boolean isFromLoginFlow;
    private String optionCode;
    private QuestionResponse questionResponse;
    private Integer reviewIdChanged;
    private String skuId;
    private ArrayList subRatings;
    private TextReviewResponse textReview;
    private UserRating userRating;

    public RatingsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public RatingsResponse(AggregateRating aggregateRating, String string2, QuestionResponse questionResponse, String string3, UserRating userRating, ArrayList arrayList, ImageReviewResponse imageReviewResponse, TextReviewResponse textReviewResponse, Integer n3, Boolean bl2) {
        this.aggregateRating = aggregateRating;
        this.optionCode = string2;
        this.questionResponse = questionResponse;
        this.skuId = string3;
        this.userRating = userRating;
        this.subRatings = arrayList;
        this.imageReview = imageReviewResponse;
        this.textReview = textReviewResponse;
        this.reviewIdChanged = n3;
        this.isFromLoginFlow = bl2;
    }

    public /* synthetic */ RatingsResponse(AggregateRating object, String object2, QuestionResponse object3, String object4, UserRating object5, ArrayList object6, ImageReviewResponse object7, TextReviewResponse object8, Integer object9, Boolean comparable, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Integer n4;
        ImageReviewResponse imageReviewResponse;
        ArrayList arrayList;
        UserRating userRating;
        String string2;
        QuestionResponse questionResponse;
        String string3;
        AggregateRating aggregateRating;
        int n7 = n3;
        int n8 = n3 & 1;
        TextReviewResponse textReviewResponse = null;
        if (n8 != 0) {
            n8 = 0;
            aggregateRating = null;
        } else {
            aggregateRating = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string3 = null;
        } else {
            string3 = object2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            questionResponse = null;
        } else {
            questionResponse = object3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string2 = null;
        } else {
            string2 = object4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            userRating = null;
        } else {
            userRating = object5;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            arrayList = null;
        } else {
            arrayList = object6;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            imageReviewResponse = null;
        } else {
            imageReviewResponse = object7;
        }
        int n19 = n7 & 0x80;
        if (n19 == 0) {
            textReviewResponse = object8;
        }
        n19 = n7 & 0x100;
        if (n19 != 0) {
            n19 = -1;
            n4 = n19;
        } else {
            n4 = object9;
        }
        Boolean bl2 = (n7 &= 0x200) != 0 ? Boolean.FALSE : comparable;
        object = this;
        object2 = aggregateRating;
        object3 = string3;
        object4 = questionResponse;
        object5 = string2;
        object6 = userRating;
        object7 = arrayList;
        object8 = imageReviewResponse;
        object9 = textReviewResponse;
        comparable = n4;
        this(aggregateRating, string3, questionResponse, string2, userRating, arrayList, imageReviewResponse, textReviewResponse, n4, bl2);
    }

    public static /* synthetic */ RatingsResponse copy$default(RatingsResponse ratingsResponse, AggregateRating aggregateRating, String string2, QuestionResponse questionResponse, String string3, UserRating userRating, ArrayList arrayList, ImageReviewResponse imageReviewResponse, TextReviewResponse textReviewResponse, Integer n3, Boolean bl2, int n4, Object object) {
        RatingsResponse ratingsResponse2 = ratingsResponse;
        int n7 = n4;
        int n8 = n4 & 1;
        AggregateRating aggregateRating2 = n8 != 0 ? ratingsResponse.aggregateRating : aggregateRating;
        int n10 = n7 & 2;
        String string4 = n10 != 0 ? ratingsResponse2.optionCode : string2;
        int n14 = n7 & 4;
        QuestionResponse questionResponse2 = n14 != 0 ? ratingsResponse2.questionResponse : questionResponse;
        int n15 = n7 & 8;
        String string5 = n15 != 0 ? ratingsResponse2.skuId : string3;
        int n16 = n7 & 0x10;
        UserRating userRating2 = n16 != 0 ? ratingsResponse2.userRating : userRating;
        int n17 = n7 & 0x20;
        ArrayList arrayList2 = n17 != 0 ? ratingsResponse2.subRatings : arrayList;
        int n18 = n7 & 0x40;
        ImageReviewResponse imageReviewResponse2 = n18 != 0 ? ratingsResponse2.imageReview : imageReviewResponse;
        int n19 = n7 & 0x80;
        TextReviewResponse textReviewResponse2 = n19 != 0 ? ratingsResponse2.textReview : textReviewResponse;
        int n20 = n7 & 0x100;
        Integer n21 = n20 != 0 ? ratingsResponse2.reviewIdChanged : n3;
        Boolean bl3 = (n7 &= 0x200) != 0 ? ratingsResponse2.isFromLoginFlow : bl2;
        aggregateRating = aggregateRating2;
        string2 = string4;
        questionResponse = questionResponse2;
        string3 = string5;
        userRating = userRating2;
        arrayList = arrayList2;
        imageReviewResponse = imageReviewResponse2;
        textReviewResponse = textReviewResponse2;
        n3 = n21;
        bl2 = bl3;
        return ratingsResponse.copy(aggregateRating2, string4, questionResponse2, string5, userRating2, arrayList2, imageReviewResponse2, textReviewResponse2, n21, bl3);
    }

    public final AggregateRating component1() {
        return this.aggregateRating;
    }

    public final Boolean component10() {
        return this.isFromLoginFlow;
    }

    public final String component2() {
        return this.optionCode;
    }

    public final QuestionResponse component3() {
        return this.questionResponse;
    }

    public final String component4() {
        return this.skuId;
    }

    public final UserRating component5() {
        return this.userRating;
    }

    public final ArrayList component6() {
        return this.subRatings;
    }

    public final ImageReviewResponse component7() {
        return this.imageReview;
    }

    public final TextReviewResponse component8() {
        return this.textReview;
    }

    public final Integer component9() {
        return this.reviewIdChanged;
    }

    public final RatingsResponse copy(AggregateRating aggregateRating, String string2, QuestionResponse questionResponse, String string3, UserRating userRating, ArrayList arrayList, ImageReviewResponse imageReviewResponse, TextReviewResponse textReviewResponse, Integer n3, Boolean bl2) {
        RatingsResponse ratingsResponse = new RatingsResponse(aggregateRating, string2, questionResponse, string3, userRating, arrayList, imageReviewResponse, textReviewResponse, n3, bl2);
        return ratingsResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RatingsResponse;
        if (!bl3) {
            return false;
        }
        object = (RatingsResponse)object;
        Object object2 = this.aggregateRating;
        Object object3 = ((RatingsResponse)object).aggregateRating;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.optionCode;
        object3 = ((RatingsResponse)object).optionCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.questionResponse;
        object3 = ((RatingsResponse)object).questionResponse;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.skuId;
        object3 = ((RatingsResponse)object).skuId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.userRating;
        object3 = ((RatingsResponse)object).userRating;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subRatings;
        object3 = ((RatingsResponse)object).subRatings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageReview;
        object3 = ((RatingsResponse)object).imageReview;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.textReview;
        object3 = ((RatingsResponse)object).textReview;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewIdChanged;
        object3 = ((RatingsResponse)object).reviewIdChanged;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isFromLoginFlow;
        object = ((RatingsResponse)object).isFromLoginFlow;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final AggregateRating getAggregateRating() {
        return this.aggregateRating;
    }

    public final ImageReviewResponse getImageReview() {
        return this.imageReview;
    }

    public final String getOptionCode() {
        return this.optionCode;
    }

    public final QuestionResponse getQuestionResponse() {
        return this.questionResponse;
    }

    public final Integer getReviewIdChanged() {
        return this.reviewIdChanged;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final ArrayList getSubRatings() {
        return this.subRatings;
    }

    public final TextReviewResponse getTextReview() {
        return this.textReview;
    }

    public final UserRating getUserRating() {
        return this.userRating;
    }

    public int hashCode() {
        int n3;
        int n4;
        AggregateRating aggregateRating = this.aggregateRating;
        int n7 = 0;
        if (aggregateRating == null) {
            n4 = 0;
            aggregateRating = null;
        } else {
            n4 = aggregateRating.hashCode();
        }
        n4 *= 31;
        Object object = this.optionCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.questionResponse;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((QuestionResponse)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.skuId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.userRating;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((UserRating)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subRatings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageReview;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ImageReviewResponse)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.textReview;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((TextReviewResponse)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewIdChanged;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isFromLoginFlow;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isFromLoginFlow() {
        return this.isFromLoginFlow;
    }

    public final void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public final void setFromLoginFlow(Boolean bl2) {
        this.isFromLoginFlow = bl2;
    }

    public final void setImageReview(ImageReviewResponse imageReviewResponse) {
        this.imageReview = imageReviewResponse;
    }

    public final void setOptionCode(String string2) {
        this.optionCode = string2;
    }

    public final void setQuestionResponse(QuestionResponse questionResponse) {
        this.questionResponse = questionResponse;
    }

    public final void setReviewIdChanged(Integer n3) {
        this.reviewIdChanged = n3;
    }

    public final void setSkuId(String string2) {
        this.skuId = string2;
    }

    public final void setSubRatings(ArrayList arrayList) {
        this.subRatings = arrayList;
    }

    public final void setTextReview(TextReviewResponse textReviewResponse) {
        this.textReview = textReviewResponse;
    }

    public final void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    public String toString() {
        AggregateRating aggregateRating = this.aggregateRating;
        String string2 = this.optionCode;
        QuestionResponse questionResponse = this.questionResponse;
        String string3 = this.skuId;
        UserRating userRating = this.userRating;
        ArrayList arrayList = this.subRatings;
        ImageReviewResponse imageReviewResponse = this.imageReview;
        TextReviewResponse textReviewResponse = this.textReview;
        Integer n3 = this.reviewIdChanged;
        Boolean bl2 = this.isFromLoginFlow;
        StringBuilder stringBuilder = new StringBuilder("RatingsResponse(aggregateRating=");
        stringBuilder.append(aggregateRating);
        stringBuilder.append(", optionCode=");
        stringBuilder.append(string2);
        stringBuilder.append(", questionResponse=");
        stringBuilder.append(questionResponse);
        stringBuilder.append(", skuId=");
        stringBuilder.append(string3);
        stringBuilder.append(", userRating=");
        stringBuilder.append(userRating);
        stringBuilder.append(", subRatings=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", imageReview=");
        stringBuilder.append(imageReviewResponse);
        stringBuilder.append(", textReview=");
        stringBuilder.append(textReviewResponse);
        stringBuilder.append(", reviewIdChanged=");
        stringBuilder.append(n3);
        stringBuilder.append(", isFromLoginFlow=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

