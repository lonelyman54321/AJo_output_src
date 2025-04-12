/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from im3
 */
public final class im3_0 {
    public static final im3_0 c;
    public static final im3_0 d;
    public final int a;
    public final boolean b;

    static {
        im3_0 im3_02;
        c = im3_02 = new im3_0(2, false);
        boolean bl2 = true;
        d = im3_02 = new im3_0((int)(bl2 ? 1 : 0), bl2);
    }

    public im3_0(int n3, boolean bl2) {
        this.a = n3;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof im3_0;
        if (n3 == 0) {
            return false;
        }
        object = (im3_0)object;
        int n4 = this.a;
        n3 = ((im3_0)object).a;
        if (n4 == n3) {
            n3 = (int)(this.b ? 1 : 0);
            int n7 = ((im3_0)object).b;
            if (n3 != n7) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final String toString() {
        Object object = c;
        boolean bl2 = Intrinsics.areEqual(this, object);
        object = bl2 ? "TextMotion.Static" : ((bl2 = Intrinsics.areEqual(this, object = d)) ? "TextMotion.Animated" : "Invalid");
        return object;
    }
}

