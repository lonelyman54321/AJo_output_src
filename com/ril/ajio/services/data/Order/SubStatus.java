/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubStatus
implements Serializable {
    private final String subStatusMessage;
    private String textColorCode;

    public SubStatus(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "subStatusMessage");
        this.subStatusMessage = string2;
        this.textColorCode = string3;
    }

    public /* synthetic */ SubStatus(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            string3 = "";
        }
        this(string2, string3);
    }

    public static /* synthetic */ SubStatus copy$default(SubStatus subStatus, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = subStatus.subStatusMessage;
        }
        if ((n3 &= 2) != 0) {
            string3 = subStatus.textColorCode;
        }
        return subStatus.copy(string2, string3);
    }

    public final String component1() {
        return this.subStatusMessage;
    }

    public final String component2() {
        return this.textColorCode;
    }

    public final SubStatus copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "subStatusMessage");
        SubStatus subStatus = new SubStatus(string2, string3);
        return subStatus;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SubStatus;
        if (!bl3) {
            return false;
        }
        object = (SubStatus)object;
        String string2 = this.subStatusMessage;
        String string3 = ((SubStatus)object).subStatusMessage;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.textColorCode;
        object = ((SubStatus)object).textColorCode;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getSubStatusMessage() {
        return this.subStatusMessage;
    }

    public final String getTextColorCode() {
        return this.textColorCode;
    }

    public int hashCode() {
        int n3;
        String string2 = this.subStatusMessage;
        int n4 = string2.hashCode() * 31;
        String string3 = this.textColorCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        return n4 + n3;
    }

    public final void setTextColorCode(String string2) {
        this.textColorCode = string2;
    }

    public String toString() {
        String string2 = this.subStatusMessage;
        String string3 = this.textColorCode;
        return uc0_0.a("SubStatus(subStatusMessage=", string2, ", textColorCode=", string3, ")");
    }
}

