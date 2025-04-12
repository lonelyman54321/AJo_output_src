/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Hm2$b {
    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl3 = object instanceof Hm2$b;
                if (!bl3) break block4;
                object = (Hm2$b)object;
                object.getClass();
                bl3 = false;
                boolean bl4 = Intrinsics.areEqual(null, null);
                if (!bl4) break block4;
                object.getClass();
                boolean bl5 = Intrinsics.areEqual(null, null);
                if (bl5) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Entry(value=null, memoryCacheKey=null)";
    }
}

