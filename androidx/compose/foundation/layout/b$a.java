/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.b;
import kotlin.jvm.internal.Intrinsics;

public final class b$a
extends b {
    public final Oc a;

    public b$a(Oc oc) {
        this.a = oc;
    }

    public final int a(Ns2 ns2) {
        Oc oc = this.a;
        return ns2.U(oc);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof b$a;
        if (!bl3) {
            return false;
        }
        object = (b$a)object;
        Oc oc = this.a;
        object = ((b$a)object).a;
        boolean bl4 = Intrinsics.areEqual(oc, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Value(alignmentLine=");
        Oc oc = this.a;
        stringBuilder.append(oc);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

