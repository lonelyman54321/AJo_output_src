/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UserRating {
    private String optionCode;
    private Integer rating;
    private String skuId;
    private String uuid;

    public UserRating() {
        this(null, null, null, null, 15, null);
    }

    public UserRating(String string2, Integer n3, String string3, String string4) {
        this.optionCode = string2;
        this.rating = n3;
        this.skuId = string3;
        this.uuid = string4;
    }

    public /* synthetic */ UserRating(String string2, Integer n3, String string3, String string4, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = null;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = null;
        }
        if ((n4 &= 8) != 0) {
            string4 = null;
        }
        this(string2, n3, string3, string4);
    }

    public static /* synthetic */ UserRating copy$default(UserRating userRating, String string2, Integer n3, String string3, String string4, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = userRating.optionCode;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = userRating.rating;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = userRating.skuId;
        }
        if ((n4 &= 8) != 0) {
            string4 = userRating.uuid;
        }
        return userRating.copy(string2, n3, string3, string4);
    }

    public final String component1() {
        return this.optionCode;
    }

    public final Integer component2() {
        return this.rating;
    }

    public final String component3() {
        return this.skuId;
    }

    public final String component4() {
        return this.uuid;
    }

    public final UserRating copy(String string2, Integer n3, String string3, String string4) {
        UserRating userRating = new UserRating(string2, n3, string3, string4);
        return userRating;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UserRating;
        if (!bl3) {
            return false;
        }
        object = (UserRating)object;
        Object object2 = this.optionCode;
        Object object3 = ((UserRating)object).optionCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rating;
        object3 = ((UserRating)object).rating;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.skuId;
        object3 = ((UserRating)object).skuId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.uuid;
        object = ((UserRating)object).uuid;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getOptionCode() {
        return this.optionCode;
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final String getUuid() {
        return this.uuid;
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
        Object object = this.rating;
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
        object = this.uuid;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setOptionCode(String string2) {
        this.optionCode = string2;
    }

    public final void setRating(Integer n3) {
        this.rating = n3;
    }

    public final void setSkuId(String string2) {
        this.skuId = string2;
    }

    public final void setUuid(String string2) {
        this.uuid = string2;
    }

    public String toString() {
        String string2 = this.optionCode;
        Integer n3 = this.rating;
        String string3 = this.skuId;
        String string4 = this.uuid;
        StringBuilder stringBuilder = new StringBuilder("UserRating(optionCode=");
        stringBuilder.append(string2);
        stringBuilder.append(", rating=");
        stringBuilder.append(n3);
        stringBuilder.append(", skuId=");
        return ko_0.a(stringBuilder, string3, ", uuid=", string4, ")");
    }
}

