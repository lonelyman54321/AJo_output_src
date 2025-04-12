/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Af0 {
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Af0;
        if (!bl3) {
            return false;
        }
        object = (Af0)object;
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

    public final String toString() {
        return "CustomAccessibilityAction(label=null, action=null)";
    }
}

