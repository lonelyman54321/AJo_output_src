/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.vod;

import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public a(String string2, String string3, String string4, String string5) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof a;
        if (!bl3) {
            return false;
        }
        object = (a)object;
        String string2 = this.a;
        String string3 = ((a)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        string2 = ((a)object).b;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.c;
        string2 = ((a)object).c;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.d;
        object = ((a)object).d;
        boolean bl4 = Intrinsics.areEqual(string3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        String string2 = this.a;
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
        return (n4 + n7) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VodAdDetails(daterangeId=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", startTime=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", adsBreakDuration=");
        string2 = this.c;
        stringBuilder.append(string2);
        stringBuilder.append(", vastAdID=");
        string2 = this.d;
        return h30_0.a(stringBuilder, string2, ", alreadyServed=false)");
    }
}

