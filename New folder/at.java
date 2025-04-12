/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class at {
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof at;
        if (!bl3) {
            return false;
        }
        object = (at)object;
        object.getClass();
        bl3 = false;
        boolean bl4 = Intrinsics.areEqual(null, null);
        if (!bl4) {
            return false;
        }
        object.getClass();
        bl3 = Intrinsics.areEqual(null, null);
        if (!bl3) {
            return false;
        }
        object.getClass();
        return bl2;
    }

    public final int hashCode() {
        throw null;
    }
}

