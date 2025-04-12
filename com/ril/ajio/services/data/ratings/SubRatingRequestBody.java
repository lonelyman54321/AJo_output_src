/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubRatingRequestBody {
    private ArrayList subRatings;
    private String userId;

    public SubRatingRequestBody() {
        this(null, null, 3, null);
    }

    public SubRatingRequestBody(ArrayList arrayList, String string2) {
        this.subRatings = arrayList;
        this.userId = string2;
    }

    public /* synthetic */ SubRatingRequestBody(ArrayList arrayList, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(arrayList, string2);
    }

    public static /* synthetic */ SubRatingRequestBody copy$default(SubRatingRequestBody subRatingRequestBody, ArrayList arrayList, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = subRatingRequestBody.subRatings;
        }
        if ((n3 &= 2) != 0) {
            string2 = subRatingRequestBody.userId;
        }
        return subRatingRequestBody.copy(arrayList, string2);
    }

    public final ArrayList component1() {
        return this.subRatings;
    }

    public final String component2() {
        return this.userId;
    }

    public final SubRatingRequestBody copy(ArrayList arrayList, String string2) {
        SubRatingRequestBody subRatingRequestBody = new SubRatingRequestBody(arrayList, string2);
        return subRatingRequestBody;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SubRatingRequestBody;
        if (!bl3) {
            return false;
        }
        object = (SubRatingRequestBody)object;
        Object object2 = this.subRatings;
        ArrayList arrayList = ((SubRatingRequestBody)object).subRatings;
        bl3 = Intrinsics.areEqual(object2, arrayList);
        if (!bl3) {
            return false;
        }
        object2 = this.userId;
        object = ((SubRatingRequestBody)object).userId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getSubRatings() {
        return this.subRatings;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.subRatings;
        int n4 = 0;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        n3 *= 31;
        String string2 = this.userId;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public final void setSubRatings(ArrayList arrayList) {
        this.subRatings = arrayList;
    }

    public final void setUserId(String string2) {
        this.userId = string2;
    }

    public String toString() {
        ArrayList arrayList = this.subRatings;
        String string2 = this.userId;
        StringBuilder stringBuilder = new StringBuilder("SubRatingRequestBody(subRatings=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", userId=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

