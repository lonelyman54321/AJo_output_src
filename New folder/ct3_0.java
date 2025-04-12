/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ct3
 */
public final class ct3_0
implements Comparable {
    public static final Ct3$a b;
    public final byte a;

    static {
        Ct3$a ct3$a;
        b = ct3$a = new Ct3$a(null);
    }

    public /* synthetic */ ct3_0(byte by2) {
        this.a = by2;
    }

    public final /* synthetic */ int compareTo(Object object) {
        int n3 = ((ct3_0)object).a;
        int n4 = this.a & 0xFF;
        return Intrinsics.compare(n4, n3 &= 0xFF);
    }

    public final boolean equals(Object object) {
        byte by2 = object instanceof ct3_0;
        boolean bl2 = false;
        if (by2 != 0) {
            object = (ct3_0)object;
            by2 = this.a;
            byte by4 = ((ct3_0)object).a;
            if (by2 == by4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a & 0xFF);
    }
}

