/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class zi3 {
    public static final zi3 b;
    public final Map a;

    static {
        zi3 zi32;
        nz0_2 nz0_22 = fh1_2.f();
        b = zi32 = new zi3(nz0_22);
    }

    public zi3(Map map2) {
        this.a = map2;
    }

    public final boolean equals(Object object) {
        Map map2;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof zi3;
        if (!bl4 || !(bl2 = Intrinsics.areEqual(map2 = this.a, object = ((zi3)object).a))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Tags(tags=");
        Map map2 = this.a;
        stringBuilder.append(map2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

