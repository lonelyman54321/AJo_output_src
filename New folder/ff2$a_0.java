/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fF2$a
 */
public final class ff2$a_0
extends ff2_1 {
    public final String a;

    public ff2$a_0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        this.a = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ff2$a_0;
        if (!bl3) {
            return false;
        }
        object = (ff2$a_0)object;
        String string2 = this.a;
        object = ((ff2$a_0)object).a;
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

