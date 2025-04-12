/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class fC1$c
implements fc1_0 {
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof fC1$c;
        boolean bl3 = false;
        if (bl2) {
            ((fC1$c)object).getClass();
            object = null;
            boolean bl4 = Intrinsics.areEqual(null, null);
            if (bl4) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "File(fileName=null)";
    }
}

