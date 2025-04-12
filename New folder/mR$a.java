/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class mR$a {
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof mR$a;
        if (!bl3) {
            return false;
        }
        object = (mR$a)object;
        object.getClass();
        bl3 = false;
        boolean bl4 = Intrinsics.areEqual(null, null);
        if (!bl4) {
            return false;
        }
        object.getClass();
        bl4 = Intrinsics.areEqual(null, null);
        if (!bl4) {
            return false;
        }
        object.getClass();
        boolean bl5 = Intrinsics.areEqual(null, null);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}

