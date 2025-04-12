/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class InstantDiscountInfo {
    private String description;
    private String tncURL;

    public InstantDiscountInfo() {
        this(null, null, 3, null);
    }

    public InstantDiscountInfo(String string2, String string3) {
        this.description = string2;
        this.tncURL = string3;
    }

    public /* synthetic */ InstantDiscountInfo(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ InstantDiscountInfo copy$default(InstantDiscountInfo instantDiscountInfo, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = instantDiscountInfo.description;
        }
        if ((n3 &= 2) != 0) {
            string3 = instantDiscountInfo.tncURL;
        }
        return instantDiscountInfo.copy(string2, string3);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.tncURL;
    }

    public final InstantDiscountInfo copy(String string2, String string3) {
        InstantDiscountInfo instantDiscountInfo = new InstantDiscountInfo(string2, string3);
        return instantDiscountInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof InstantDiscountInfo;
        if (!bl3) {
            return false;
        }
        object = (InstantDiscountInfo)object;
        String string2 = this.description;
        String string3 = ((InstantDiscountInfo)object).description;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.tncURL;
        object = ((InstantDiscountInfo)object).tncURL;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTncURL() {
        return this.tncURL;
    }

    public int hashCode() {
        int n3;
        String string2 = this.description;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.tncURL;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setTncURL(String string2) {
        this.tncURL = string2;
    }

    public String toString() {
        String string2 = this.description;
        String string3 = this.tncURL;
        return uc0_0.a("InstantDiscountInfo(description=", string2, ", tncURL=", string3, ")");
    }
}

