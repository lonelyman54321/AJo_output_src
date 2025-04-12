/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import kotlin.jvm.internal.Intrinsics;

public final class i {
    public final String a;
    public final String b;

    public i(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof i;
        if (!bl3) {
            return false;
        }
        object = (i)object;
        String string2 = this.a;
        String string3 = ((i)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        object = ((i)object).b;
        boolean bl4 = Intrinsics.areEqual(string3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        String string2 = this.a;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.b;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TrackingEvent(event=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", trackingUrl=");
        string2 = this.b;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

