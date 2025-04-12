/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vmapParser.model;

import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public a(String string2, String string3, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter(string3, "adTagUri");
        this.a = string2;
        this.b = bl2;
        this.c = bl3;
        this.d = string3;
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
        bl3 = this.b;
        boolean bl4 = ((a)object).b;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.c;
        bl4 = ((a)object).c;
        if (bl3 != bl4) {
            return false;
        }
        string3 = this.d;
        object = ((a)object).d;
        boolean bl5 = Intrinsics.areEqual(string3, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = string2.hashCode() * 31;
        int n4 = 1;
        int n7 = (int)(this.b ? 1 : 0);
        if (n7 != 0) {
            n7 = 1;
        }
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.c ? 1 : 0);
        if (n7 == 0) {
            n4 = n7;
        }
        n3 = (n3 + n4) * 31;
        return this.d.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdSource(id=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", allowMultipleAds=");
        boolean bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", followRedirects=");
        bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", adTagUri=");
        string2 = this.d;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

