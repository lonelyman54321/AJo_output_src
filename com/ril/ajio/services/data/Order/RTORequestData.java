/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RTORequestData {
    private final String reason;
    private final String returnId;

    public RTORequestData() {
        this(null, null, 3, null);
    }

    public RTORequestData(String string2, String string3) {
        this.returnId = string2;
        this.reason = string3;
    }

    public /* synthetic */ RTORequestData(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ RTORequestData copy$default(RTORequestData rTORequestData, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = rTORequestData.returnId;
        }
        if ((n3 &= 2) != 0) {
            string3 = rTORequestData.reason;
        }
        return rTORequestData.copy(string2, string3);
    }

    public final String component1() {
        return this.returnId;
    }

    public final String component2() {
        return this.reason;
    }

    public final RTORequestData copy(String string2, String string3) {
        RTORequestData rTORequestData = new RTORequestData(string2, string3);
        return rTORequestData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RTORequestData;
        if (!bl3) {
            return false;
        }
        object = (RTORequestData)object;
        String string2 = this.returnId;
        String string3 = ((RTORequestData)object).returnId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.reason;
        object = ((RTORequestData)object).reason;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReturnId() {
        return this.returnId;
    }

    public int hashCode() {
        int n3;
        String string2 = this.returnId;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.reason;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.returnId;
        String string3 = this.reason;
        return uc0_0.a("RTORequestData(returnId=", string2, ", reason=", string3, ")");
    }
}

