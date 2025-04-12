/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import kotlin.jvm.internal.Intrinsics;

public final class VerifyVpaRequestUPI {
    private String type;
    private String vpa;

    public VerifyVpaRequestUPI(String string2, String string3) {
        this.type = string2;
        this.vpa = string3;
    }

    public static /* synthetic */ VerifyVpaRequestUPI copy$default(VerifyVpaRequestUPI verifyVpaRequestUPI, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = verifyVpaRequestUPI.type;
        }
        if ((n3 &= 2) != 0) {
            string3 = verifyVpaRequestUPI.vpa;
        }
        return verifyVpaRequestUPI.copy(string2, string3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.vpa;
    }

    public final VerifyVpaRequestUPI copy(String string2, String string3) {
        VerifyVpaRequestUPI verifyVpaRequestUPI = new VerifyVpaRequestUPI(string2, string3);
        return verifyVpaRequestUPI;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof VerifyVpaRequestUPI;
        if (!bl3) {
            return false;
        }
        object = (VerifyVpaRequestUPI)object;
        String string2 = this.type;
        String string3 = ((VerifyVpaRequestUPI)object).type;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.vpa;
        object = ((VerifyVpaRequestUPI)object).vpa;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVpa() {
        return this.vpa;
    }

    public int hashCode() {
        int n3;
        String string2 = this.type;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.vpa;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setVpa(String string2) {
        this.vpa = string2;
    }

    public String toString() {
        String string2 = this.type;
        String string3 = this.vpa;
        return uc0_0.a("VerifyVpaRequestUPI(type=", string2, ", vpa=", string3, ")");
    }
}

