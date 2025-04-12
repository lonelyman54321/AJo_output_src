/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class F92 {
    public final String a;

    public F92(String string2) {
        this.a = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof F92;
        if (!bl3) {
            return false;
        }
        object = (F92)object;
        String string2 = this.a;
        object = ((F92)object).a;
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
        StringBuilder stringBuilder = new StringBuilder("OpaqueKey(key=");
        String string2 = this.a;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

