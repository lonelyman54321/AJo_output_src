/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReviewQueryParamters {
    private final String optionCode;
    private final String reviewText;
    private final String skuId;

    public ReviewQueryParamters() {
        this(null, null, null, 7, null);
    }

    public ReviewQueryParamters(String string2, String string3, String string4) {
        this.skuId = string2;
        this.optionCode = string3;
        this.reviewText = string4;
    }

    public /* synthetic */ ReviewQueryParamters(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ ReviewQueryParamters copy$default(ReviewQueryParamters reviewQueryParamters, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = reviewQueryParamters.skuId;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = reviewQueryParamters.optionCode;
        }
        if ((n3 &= 4) != 0) {
            string4 = reviewQueryParamters.reviewText;
        }
        return reviewQueryParamters.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.skuId;
    }

    public final String component2() {
        return this.optionCode;
    }

    public final String component3() {
        return this.reviewText;
    }

    public final ReviewQueryParamters copy(String string2, String string3, String string4) {
        ReviewQueryParamters reviewQueryParamters = new ReviewQueryParamters(string2, string3, string4);
        return reviewQueryParamters;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReviewQueryParamters;
        if (!bl3) {
            return false;
        }
        object = (ReviewQueryParamters)object;
        String string2 = this.skuId;
        String string3 = ((ReviewQueryParamters)object).skuId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.optionCode;
        string3 = ((ReviewQueryParamters)object).optionCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.reviewText;
        object = ((ReviewQueryParamters)object).reviewText;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getOptionCode() {
        return this.optionCode;
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
        String string2 = this.skuId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.optionCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.reviewText;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.skuId;
        String string3 = this.optionCode;
        String string4 = this.reviewText;
        return h30_0.a(og_1.a("ReviewQueryParamters(skuId=", string2, ", optionCode=", string3, ", reviewText="), string4, ")");
    }
}

