/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReviewsResponse {
    private final List imageIds;
    private final String optionCode;
    private final String productId;
    private final Long reviewId;
    private final String reviewText;
    private final String skuId;

    public ReviewsResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public ReviewsResponse(String string2, String string3, Long l2, String string4, String string5, List list) {
        this.optionCode = string2;
        this.productId = string3;
        this.reviewId = l2;
        this.reviewText = string4;
        this.skuId = string5;
        this.imageIds = list;
    }

    public /* synthetic */ ReviewsResponse(String object, String object2, Long object3, String object4, String string2, List object5, int n3, DefaultConstructorMarker object6) {
        List list;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object6 = null;
        } else {
            object6 = object;
        }
        int n7 = n3 & 2;
        Object object7 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        Object object8 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        Object object9 = n7 != 0 ? null : object4;
        n7 = n3 & 0x10;
        String string3 = n7 != 0 ? null : string2;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            list = null;
        } else {
            list = object5;
        }
        object = this;
        object2 = object6;
        object3 = object7;
        object4 = object8;
        string2 = object9;
        object5 = string3;
        this((String)object6, (String)object7, (Long)object8, (String)object9, string3, list);
    }

    public static /* synthetic */ ReviewsResponse copy$default(ReviewsResponse reviewsResponse, String string2, String object, Long object2, String object3, String object4, List object5, int n3, Object object6) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = reviewsResponse.optionCode;
        }
        if ((n4 = n3 & 2) != 0) {
            object = reviewsResponse.productId;
        }
        object6 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = reviewsResponse.reviewId;
        }
        Long l2 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = reviewsResponse.reviewText;
        }
        String string3 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = reviewsResponse.skuId;
        }
        String string4 = object4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object5 = reviewsResponse.imageIds;
        }
        List list = object5;
        object = reviewsResponse;
        object2 = string2;
        object3 = object6;
        object4 = l2;
        object5 = string3;
        object6 = list;
        return reviewsResponse.copy(string2, (String)object3, l2, string3, string4, list);
    }

    public final String component1() {
        return this.optionCode;
    }

    public final String component2() {
        return this.productId;
    }

    public final Long component3() {
        return this.reviewId;
    }

    public final String component4() {
        return this.reviewText;
    }

    public final String component5() {
        return this.skuId;
    }

    public final List component6() {
        return this.imageIds;
    }

    public final ReviewsResponse copy(String string2, String string3, Long l2, String string4, String string5, List list) {
        ReviewsResponse reviewsResponse = new ReviewsResponse(string2, string3, l2, string4, string5, list);
        return reviewsResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReviewsResponse;
        if (!bl3) {
            return false;
        }
        object = (ReviewsResponse)object;
        Object object2 = this.optionCode;
        Object object3 = ((ReviewsResponse)object).optionCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productId;
        object3 = ((ReviewsResponse)object).productId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewId;
        object3 = ((ReviewsResponse)object).reviewId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewText;
        object3 = ((ReviewsResponse)object).reviewText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.skuId;
        object3 = ((ReviewsResponse)object).skuId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageIds;
        object = ((ReviewsResponse)object).imageIds;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getImageIds() {
        return this.imageIds;
    }

    public final String getOptionCode() {
        return this.optionCode;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Long getReviewId() {
        return this.reviewId;
    }

    public final String getReviewText() {
        return this.reviewText;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.optionCode;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.productId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.imageIds;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.optionCode;
        String string2 = this.productId;
        Long l2 = this.reviewId;
        String string3 = this.reviewText;
        String string4 = this.skuId;
        List list = this.imageIds;
        charSequence = og_1.a("ReviewsResponse(optionCode=", (String)charSequence, ", productId=", string2, ", reviewId=");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(", reviewText=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", skuId=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(", imageIds=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

