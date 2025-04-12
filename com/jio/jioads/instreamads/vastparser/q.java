/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser;

import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.r;
import kotlin.jvm.internal.Intrinsics;

public final class q
implements r {
    public final m a;

    public q(m m2) {
        this.a = m2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof q;
        if (!bl3) {
            return false;
        }
        object = (q)object;
        m m2 = this.a;
        object = ((q)object).a;
        boolean bl4 = Intrinsics.areEqual(m2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        m m2 = this.a;
        if (m2 == null) {
            n3 = 0;
            m2 = null;
        } else {
            n3 = m2.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("XmlParsingError(vastModel=");
        m m2 = this.a;
        stringBuilder.append(m2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

