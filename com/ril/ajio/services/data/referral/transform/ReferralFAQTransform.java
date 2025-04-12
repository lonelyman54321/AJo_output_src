/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral.transform;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralFAQTransform {
    private ArrayList faqList;

    public ReferralFAQTransform(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "faqList");
        this.faqList = arrayList;
    }

    public static /* synthetic */ ReferralFAQTransform copy$default(ReferralFAQTransform referralFAQTransform, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = referralFAQTransform.faqList;
        }
        return referralFAQTransform.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.faqList;
    }

    public final ReferralFAQTransform copy(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "faqList");
        ReferralFAQTransform referralFAQTransform = new ReferralFAQTransform(arrayList);
        return referralFAQTransform;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReferralFAQTransform;
        if (!bl3) {
            return false;
        }
        object = (ReferralFAQTransform)object;
        ArrayList arrayList = this.faqList;
        object = ((ReferralFAQTransform)object).faqList;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getFaqList() {
        return this.faqList;
    }

    public int hashCode() {
        return this.faqList.hashCode();
    }

    public final void setFaqList(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.faqList = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.faqList;
        StringBuilder stringBuilder = new StringBuilder("ReferralFAQTransform(faqList=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

