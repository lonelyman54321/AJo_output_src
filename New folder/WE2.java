/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class WE2
implements L63 {
    public final B63 b;

    public WE2(B63 b63) {
        this.b = b63;
    }

    public final boolean equals(Object object) {
        B63 b63;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof WE2;
        if (!bl4 || !(bl2 = Intrinsics.areEqual(b63 = this.b, object = ((WE2)object).b))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Object j(pe2_0 pe2_02) {
        return this.b;
    }
}

