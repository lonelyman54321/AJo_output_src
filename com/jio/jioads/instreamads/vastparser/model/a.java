/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final String a;

    public a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "trackingUrl");
        this.a = string2;
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
        object = ((a)object).a;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClickTracking(trackingUrl=");
        String string2 = this.a;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

