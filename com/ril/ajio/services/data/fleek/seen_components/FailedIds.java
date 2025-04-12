/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.seen_components;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FailedIds {
    private ArrayList brand;
    private ArrayList post;
    private ArrayList story;

    public FailedIds() {
        this(null, null, null, 7, null);
    }

    public FailedIds(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.post = arrayList;
        this.story = arrayList2;
        this.brand = arrayList3;
    }

    public /* synthetic */ FailedIds(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = null;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList2 = null;
        }
        if ((n3 &= 4) != 0) {
            arrayList3 = null;
        }
        this(arrayList, arrayList2, arrayList3);
    }

    public static /* synthetic */ FailedIds copy$default(FailedIds failedIds, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = failedIds.post;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList2 = failedIds.story;
        }
        if ((n3 &= 4) != 0) {
            arrayList3 = failedIds.brand;
        }
        return failedIds.copy(arrayList, arrayList2, arrayList3);
    }

    public final ArrayList component1() {
        return this.post;
    }

    public final ArrayList component2() {
        return this.story;
    }

    public final ArrayList component3() {
        return this.brand;
    }

    public final FailedIds copy(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        FailedIds failedIds = new FailedIds(arrayList, arrayList2, arrayList3);
        return failedIds;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FailedIds;
        if (!bl3) {
            return false;
        }
        object = (FailedIds)object;
        ArrayList arrayList = this.post;
        ArrayList arrayList2 = ((FailedIds)object).post;
        bl3 = Intrinsics.areEqual(arrayList, arrayList2);
        if (!bl3) {
            return false;
        }
        arrayList = this.story;
        arrayList2 = ((FailedIds)object).story;
        bl3 = Intrinsics.areEqual(arrayList, arrayList2);
        if (!bl3) {
            return false;
        }
        arrayList = this.brand;
        object = ((FailedIds)object).brand;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getBrand() {
        return this.brand;
    }

    public final ArrayList getPost() {
        return this.post;
    }

    public final ArrayList getStory() {
        return this.story;
    }

    public int hashCode() {
        int n3;
        int n4;
        ArrayList arrayList = this.post;
        int n7 = 0;
        if (arrayList == null) {
            n4 = 0;
            arrayList = null;
        } else {
            n4 = arrayList.hashCode();
        }
        n4 *= 31;
        ArrayList arrayList2 = this.story;
        if (arrayList2 == null) {
            n3 = 0;
            arrayList2 = null;
        } else {
            n3 = arrayList2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        arrayList2 = this.brand;
        if (arrayList2 != null) {
            n7 = arrayList2.hashCode();
        }
        return n4 + n7;
    }

    public final void setBrand(ArrayList arrayList) {
        this.brand = arrayList;
    }

    public final void setPost(ArrayList arrayList) {
        this.post = arrayList;
    }

    public final void setStory(ArrayList arrayList) {
        this.story = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.post;
        ArrayList arrayList2 = this.story;
        ArrayList arrayList3 = this.brand;
        StringBuilder stringBuilder = new StringBuilder("FailedIds(post=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", story=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(", brand=");
        stringBuilder.append(arrayList3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

