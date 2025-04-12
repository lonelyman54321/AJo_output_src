/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubRating {
    private String optionCode;
    private String productCode;
    private Integer questionId;
    private String skuId;
    private Integer subResponseId;

    public SubRating() {
        this(null, null, null, null, null, 31, null);
    }

    public SubRating(String string2, String string3, Integer n3, String string4, Integer n4) {
        this.optionCode = string2;
        this.productCode = string3;
        this.questionId = n3;
        this.skuId = string4;
        this.subResponseId = n4;
    }

    public /* synthetic */ SubRating(String object, String object2, Integer object3, String object4, Integer object5, int n3, DefaultConstructorMarker object6) {
        Integer n4;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            object6 = null;
        } else {
            object6 = object;
        }
        int n8 = n3 & 2;
        Object object7 = n8 != 0 ? null : object2;
        n8 = n3 & 4;
        Object object8 = n8 != 0 ? null : object3;
        n8 = n3 & 8;
        Object object9 = n8 != 0 ? null : object4;
        n8 = n3 & 0x10;
        if (n8 != 0) {
            n3 = 0;
            n4 = null;
        } else {
            n4 = object5;
        }
        object = this;
        object2 = object6;
        object3 = object7;
        object4 = object8;
        object5 = object9;
        this((String)object6, (String)object7, (Integer)object8, (String)object9, n4);
    }

    public static /* synthetic */ SubRating copy$default(SubRating subRating, String string2, String object, Integer object2, String object3, Integer n3, int n4, Object object4) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = subRating.optionCode;
        }
        if ((n7 = n4 & 2) != 0) {
            object = subRating.productCode;
        }
        object4 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            object2 = subRating.questionId;
        }
        Integer n10 = object2;
        n8 = n4 & 8;
        if (n8 != 0) {
            object3 = subRating.skuId;
        }
        String string3 = object3;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            n3 = subRating.subResponseId;
        }
        Integer n14 = n3;
        object = subRating;
        object2 = string2;
        object3 = object4;
        n3 = n10;
        object4 = n14;
        return subRating.copy(string2, (String)object3, n10, string3, n14);
    }

    public final String component1() {
        return this.optionCode;
    }

    public final String component2() {
        return this.productCode;
    }

    public final Integer component3() {
        return this.questionId;
    }

    public final String component4() {
        return this.skuId;
    }

    public final Integer component5() {
        return this.subResponseId;
    }

    public final SubRating copy(String string2, String string3, Integer n3, String string4, Integer n4) {
        SubRating subRating = new SubRating(string2, string3, n3, string4, n4);
        return subRating;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SubRating;
        if (!bl3) {
            return false;
        }
        object = (SubRating)object;
        Object object2 = this.optionCode;
        Object object3 = ((SubRating)object).optionCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productCode;
        object3 = ((SubRating)object).productCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.questionId;
        object3 = ((SubRating)object).questionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.skuId;
        object3 = ((SubRating)object).skuId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subResponseId;
        object = ((SubRating)object).subResponseId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getOptionCode() {
        return this.optionCode;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final Integer getQuestionId() {
        return this.questionId;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final Integer getSubResponseId() {
        return this.subResponseId;
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
        Object object = this.productCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.questionId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.subResponseId;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setOptionCode(String string2) {
        this.optionCode = string2;
    }

    public final void setProductCode(String string2) {
        this.productCode = string2;
    }

    public final void setQuestionId(Integer n3) {
        this.questionId = n3;
    }

    public final void setSkuId(String string2) {
        this.skuId = string2;
    }

    public final void setSubResponseId(Integer n3) {
        this.subResponseId = n3;
    }

    public String toString() {
        CharSequence charSequence = this.optionCode;
        String string2 = this.productCode;
        Integer n3 = this.questionId;
        String string3 = this.skuId;
        Integer n4 = this.subResponseId;
        charSequence = og_1.a("SubRating(optionCode=", (String)charSequence, ", productCode=", string2, ", questionId=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", skuId=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", subResponseId=");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

