/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ht3
 */
public final class ht3_0
implements Comparable {
    public static final Ht3$a b;
    public final int a;

    static {
        Ht3$a ht3$a;
        b = ht3$a = new Ht3$a(null);
    }

    public /* synthetic */ ht3_0(int n3) {
        this.a = n3;
    }

    public final int compareTo(Object object) {
        int n3 = ((ht3_0)object).a;
        int n4 = this.a;
        int n7 = -1 << -1;
        return Intrinsics.compare(n4 ^= n7, n3 ^= n7);
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof ht3_0;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (ht3_0)object;
            n3 = this.a;
            int n4 = ((ht3_0)object).a;
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf((long)this.a & 0xFFFFFFFFL);
    }
}

