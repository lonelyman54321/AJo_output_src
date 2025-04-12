/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.model;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FeedbackData {
    public static final int $stable = 8;
    private ArrayList categories;
    private String footerData;
    private String headerData;

    public FeedbackData(String string2, ArrayList arrayList, String string3) {
        Intrinsics.checkNotNullParameter(string2, "headerData");
        Intrinsics.checkNotNullParameter(arrayList, "categories");
        Intrinsics.checkNotNullParameter(string3, "footerData");
        this.headerData = string2;
        this.categories = arrayList;
        this.footerData = string3;
    }

    public /* synthetic */ FeedbackData(String string2, ArrayList arrayList, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        String string4 = "";
        if (n4 != 0) {
            string2 = string4;
        }
        if ((n3 &= 4) != 0) {
            string3 = string4;
        }
        this(string2, arrayList, string3);
    }

    public static /* synthetic */ FeedbackData copy$default(FeedbackData feedbackData, String string2, ArrayList arrayList, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = feedbackData.headerData;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList = feedbackData.categories;
        }
        if ((n3 &= 4) != 0) {
            string3 = feedbackData.footerData;
        }
        return feedbackData.copy(string2, arrayList, string3);
    }

    public final String component1() {
        return this.headerData;
    }

    public final ArrayList component2() {
        return this.categories;
    }

    public final String component3() {
        return this.footerData;
    }

    public final FeedbackData copy(String string2, ArrayList arrayList, String string3) {
        Intrinsics.checkNotNullParameter(string2, "headerData");
        Intrinsics.checkNotNullParameter(arrayList, "categories");
        Intrinsics.checkNotNullParameter(string3, "footerData");
        FeedbackData feedbackData = new FeedbackData(string2, arrayList, string3);
        return feedbackData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FeedbackData;
        if (!bl3) {
            return false;
        }
        object = (FeedbackData)object;
        Object object2 = this.headerData;
        Object object3 = ((FeedbackData)object).headerData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.categories;
        object3 = ((FeedbackData)object).categories;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.footerData;
        object = ((FeedbackData)object).footerData;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getCategories() {
        return this.categories;
    }

    public final String getFooterData() {
        return this.footerData;
    }

    public final String getHeaderData() {
        return this.headerData;
    }

    public int hashCode() {
        int n3 = this.headerData.hashCode() * 31;
        int n4 = (this.categories.hashCode() + n3) * 31;
        return this.footerData.hashCode() + n4;
    }

    public final void setCategories(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.categories = arrayList;
    }

    public final void setFooterData(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.footerData = string2;
    }

    public final void setHeaderData(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.headerData = string2;
    }

    public String toString() {
        String string2 = this.headerData;
        ArrayList arrayList = this.categories;
        String string3 = this.footerData;
        StringBuilder stringBuilder = new StringBuilder("FeedbackData(headerData=");
        stringBuilder.append(string2);
        stringBuilder.append(", categories=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", footerData=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

