/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Bv0$a
extends bv0_1 {
    public final String a;

    public Bv0$a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        this.a = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Bv0$a;
        if (!bl3) {
            return false;
        }
        object = (Bv0$a)object;
        String string2 = this.a;
        object = ((Bv0$a)object).a;
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
        StringBuilder stringBuilder = new StringBuilder("FAILURE(message=");
        String string2 = this.a;
        return h30_0.a(stringBuilder, string2, ")");
    }
}

