/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import kotlin.jvm.internal.Intrinsics;

public final class h {
    public String a = null;
    public String b = null;
    public String c = null;
    public final String d;

    public h() {
        this.d = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof h;
        if (!bl3) {
            return false;
        }
        object = (h)object;
        String string2 = this.a;
        String string3 = ((h)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.b;
        string3 = ((h)object).b;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.c;
        string3 = ((h)object).c;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.d;
        object = ((h)object).d;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        String string2 = this.a;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.b;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.c;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.d;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OmVerificationData(vendorKey=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", verificationParameters=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", verificationUrl=");
        string2 = this.c;
        stringBuilder.append(string2);
        stringBuilder.append(", skipOffset=");
        string2 = this.d;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

