/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RatingQueryParamters {
    private final boolean fetchAggRating;
    private final boolean fetchSubRatingQuestion;
    private final String optionCode;
    private final String skuId;
    private final String source;

    public RatingQueryParamters() {
        this(null, false, null, null, false, 31, null);
    }

    public RatingQueryParamters(String string2, boolean bl2, String string3, String string4, boolean bl3) {
        this.source = string2;
        this.fetchSubRatingQuestion = bl2;
        this.skuId = string3;
        this.optionCode = string4;
        this.fetchAggRating = bl3;
    }

    public /* synthetic */ RatingQueryParamters(String object, boolean bl2, String string2, String string3, boolean bl3, int n3, DefaultConstructorMarker object2) {
        int n4 = n3 & 1;
        String string4 = null;
        if (n4 != 0) {
            n4 = 0;
            object2 = null;
        } else {
            object2 = object;
        }
        int n7 = n3 & 2;
        boolean bl4 = n7 != 0 ? false : bl2;
        n7 = n3 & 4;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        if (n7 == 0) {
            string4 = string3;
        }
        n7 = n3 & 0x10;
        n3 = n7 != 0 ? 0 : (int)(bl3 ? 1 : 0);
        object = this;
        string3 = string5;
        this((String)object2, bl4, string5, string4, n3 != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ RatingQueryParamters copy$default(RatingQueryParamters ratingQueryParamters, String string2, boolean bl2, String string3, String string4, boolean bl3, int n3, Object object) {
        boolean bl4;
        String string5;
        String string6;
        boolean bl5;
        void var6_10;
        int n4 = var6_10 & 1;
        if (n4) {
            string2 = ratingQueryParamters.source;
        }
        if (n4 = var6_10 & 2) {
            bl5 = ratingQueryParamters.fetchSubRatingQuestion;
        }
        n4 = bl5;
        int n7 = var6_10 & 4;
        if (n7 != 0) {
            string6 = ratingQueryParamters.skuId;
        }
        void var9_13 = string6;
        int n8 = var6_10 & 8;
        if (n8 != 0) {
            string5 = ratingQueryParamters.optionCode;
        }
        void var10_14 = string5;
        int n10 = var6_10 & 0x10;
        if (n10 != 0) {
            bl4 = ratingQueryParamters.fetchAggRating;
        }
        string6 = string2;
        int n14 = n4;
        n4 = (int)(bl4 ? 1 : 0);
        return ratingQueryParamters.copy(string2, n14 != 0, (String)var9_13, (String)var10_14, bl4);
    }

    public final String component1() {
        return this.source;
    }

    public final boolean component2() {
        return this.fetchSubRatingQuestion;
    }

    public final String component3() {
        return this.skuId;
    }

    public final String component4() {
        return this.optionCode;
    }

    public final boolean component5() {
        return this.fetchAggRating;
    }

    public final RatingQueryParamters copy(String string2, boolean bl2, String string3, String string4, boolean bl3) {
        RatingQueryParamters ratingQueryParamters = new RatingQueryParamters(string2, bl2, string3, string4, bl3);
        return ratingQueryParamters;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RatingQueryParamters;
        if (!bl3) {
            return false;
        }
        object = (RatingQueryParamters)object;
        String string2 = this.source;
        String string3 = ((RatingQueryParamters)object).source;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.fetchSubRatingQuestion;
        boolean bl4 = ((RatingQueryParamters)object).fetchSubRatingQuestion;
        if (bl3 != bl4) {
            return false;
        }
        string2 = this.skuId;
        string3 = ((RatingQueryParamters)object).skuId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.optionCode;
        string3 = ((RatingQueryParamters)object).optionCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.fetchAggRating;
        boolean bl5 = ((RatingQueryParamters)object).fetchAggRating;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final boolean getFetchAggRating() {
        return this.fetchAggRating;
    }

    public final boolean getFetchSubRatingQuestion() {
        return this.fetchSubRatingQuestion;
    }

    public final String getOptionCode() {
        return this.optionCode;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int n3;
        String string2 = this.source;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        int n7 = this.fetchSubRatingQuestion;
        int n8 = 1237;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        String string3 = this.skuId;
        if (string3 == null) {
            n7 = 0;
            string3 = null;
        } else {
            n7 = string3.hashCode();
        }
        n3 = (n3 + n7) * 31;
        string3 = this.optionCode;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.fetchAggRating ? 1 : 0);
        if (n4 != 0) {
            n8 = 1231;
        }
        return n3 + n8;
    }

    public String toString() {
        String string2 = this.source;
        boolean bl2 = this.fetchSubRatingQuestion;
        String string3 = this.skuId;
        String string4 = this.optionCode;
        boolean bl3 = this.fetchAggRating;
        StringBuilder stringBuilder = new StringBuilder("RatingQueryParamters(source=");
        stringBuilder.append(string2);
        stringBuilder.append(", fetchSubRatingQuestion=");
        stringBuilder.append(bl2);
        stringBuilder.append(", skuId=");
        X50.a(stringBuilder, string3, ", optionCode=", string4, ", fetchAggRating=");
        return Vm.a(")", bl3, stringBuilder);
    }
}

