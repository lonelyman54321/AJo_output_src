/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.reviewRatings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Thumbnail {
    private final Integer imageId;
    private final String imageStatus;
    private final String imageUrl;
    private final String parentImageId;

    public Thumbnail() {
        this(null, null, null, null, 15, null);
    }

    public Thumbnail(Integer n3, String string2, String string3, String string4) {
        this.imageId = n3;
        this.imageStatus = string2;
        this.imageUrl = string3;
        this.parentImageId = string4;
    }

    public /* synthetic */ Thumbnail(Integer n3, String string2, String string3, String string4, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = 0;
        }
        n7 = n4 & 2;
        String string5 = "";
        if (n7 != 0) {
            string2 = string5;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = string5;
        }
        if ((n4 &= 8) != 0) {
            string4 = string5;
        }
        this(n3, string2, string3, string4);
    }

    public static /* synthetic */ Thumbnail copy$default(Thumbnail thumbnail, Integer n3, String string2, String string3, String string4, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = thumbnail.imageId;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = thumbnail.imageStatus;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = thumbnail.imageUrl;
        }
        if ((n4 &= 8) != 0) {
            string4 = thumbnail.parentImageId;
        }
        return thumbnail.copy(n3, string2, string3, string4);
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

    public final String component4() {
        return this.parentImageId;
    }

    public final Thumbnail copy(Integer n3, String string2, String string3, String string4) {
        Thumbnail thumbnail = new Thumbnail(n3, string2, string3, string4);
        return thumbnail;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Thumbnail;
        if (!bl3) {
            return false;
        }
        object = (Thumbnail)object;
        Object object2 = this.imageId;
        Object object3 = ((Thumbnail)object).imageId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageStatus;
        object3 = ((Thumbnail)object).imageStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((Thumbnail)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.parentImageId;
        object = ((Thumbnail)object).parentImageId;
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

    public final String getParentImageId() {
        return this.parentImageId;
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
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.parentImageId;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return n4 + n8;
    }

    public String toString() {
        Integer n3 = this.imageId;
        String string2 = this.imageStatus;
        String string3 = this.imageUrl;
        String string4 = this.parentImageId;
        StringBuilder stringBuilder = new StringBuilder("Thumbnail(imageId=");
        stringBuilder.append(n3);
        stringBuilder.append(", imageStatus=");
        stringBuilder.append(string2);
        stringBuilder.append(", imageUrl=");
        return ko_0.a(stringBuilder, string3, ", parentImageId=", string4, ")");
    }
}

