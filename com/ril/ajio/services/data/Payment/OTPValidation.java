/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OTPValidation {
    private String action;
    private String message;

    public OTPValidation() {
        this(null, null, 3, null);
    }

    public OTPValidation(String string2, String string3) {
        this.action = string2;
        this.message = string3;
    }

    public /* synthetic */ OTPValidation(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ OTPValidation copy$default(OTPValidation oTPValidation, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = oTPValidation.action;
        }
        if ((n3 &= 2) != 0) {
            string3 = oTPValidation.message;
        }
        return oTPValidation.copy(string2, string3);
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.message;
    }

    public final OTPValidation copy(String string2, String string3) {
        OTPValidation oTPValidation = new OTPValidation(string2, string3);
        return oTPValidation;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OTPValidation;
        if (!bl3) {
            return false;
        }
        object = (OTPValidation)object;
        String string2 = this.action;
        String string3 = ((OTPValidation)object).action;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.message;
        object = ((OTPValidation)object).message;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int n3;
        String string2 = this.action;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.message;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setAction(String string2) {
        this.action = string2;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public String toString() {
        String string2 = this.action;
        String string3 = this.message;
        return uc0_0.a("OTPValidation(action=", string2, ", message=", string3, ")");
    }
}

