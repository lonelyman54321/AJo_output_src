/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.reviewRatings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LargeSize {
    private final Integer imageId;
    private final String imageStatus;
    private final String imageUrl;

    public LargeSize() {
        this(null, null, null, 7, null);
    }

    public LargeSize(Integer n3, String string2, String string3) {
        this.imageId = n3;
        this.imageStatus = string2;
        this.imageUrl = string3;
    }

    public /* synthetic */ LargeSize(Integer n3, String string2, String string3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = 0;
        }
        n7 = n4 & 2;
        String string4 = "";
        if (n7 != 0) {
            string2 = string4;
        }
        if ((n4 &= 4) != 0) {
            string3 = string4;
        }
        this(n3, string2, string3);
    }

    public static /* synthetic */ LargeSize copy$default(LargeSize largeSize, Integer n3, String string2, String string3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = largeSize.imageId;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = largeSize.imageStatus;
        }
        if ((n4 &= 4) != 0) {
            string3 = largeSize.imageUrl;
        }
        return largeSize.copy(n3, string2, string3);
    }

    public final Integer component1() {
        return this.imageId;
    }

    public final String component2() {
        return this.imageStatus;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final LargeSize copy(Integer n3, String string2, String string3) {
        LargeSize largeSize = new LargeSize(n3, string2, string3);
        return largeSize;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LargeSize;
        if (!bl3) {
            return false;
        }
        object = (LargeSize)object;
        Object object2 = this.imageId;
        Object object3 = ((LargeSize)object).imageId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageStatus;
        object3 = ((LargeSize)object).imageStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object = ((LargeSize)object).imageUrl;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getImageId() {
        return this.imageId;
    }

    public final String getImageStatus() {
        return this.imageStatus;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.imageId;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        String string2 = this.imageStatus;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.imageUrl;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return n4 + n8;
    }

    public String toString() {
        Integer n3 = this.imageId;
        String string2 = this.imageStatus;
        String string3 = this.imageUrl;
        StringBuilder stringBuilder = new StringBuilder("LargeSize(imageId=");
        stringBuilder.append(n3);
        stringBuilder.append(", imageStatus=");
        stringBuilder.append(string2);
        stringBuilder.append(", imageUrl=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

