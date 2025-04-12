/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser;

import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.r;
import kotlin.jvm.internal.Intrinsics;

public final class p
implements r {
    public final j a;

    public p(j j3) {
        this.a = j3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof p;
        if (!bl3) {
            return false;
        }
        object = (p)object;
        j j3 = this.a;
        object = ((p)object).a;
        boolean bl4 = Intrinsics.areEqual(j3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        j j3 = this.a;
        if (j3 == null) {
            n3 = 0;
            j3 = null;
        } else {
            n3 = j3.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WrapperError(vastAd=");
        j j3 = this.a;
        stringBuilder.append(j3);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

