/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

public final class zl2 {
    public final int a;

    public zl2(int n3) {
        this.a = n3;
    }

    public final int a(int n3, int n4) {
        long l2 = n3;
        long l3 = this.a;
        n3 = (int)f.b(l2 - l3, 0L);
        int n7 = (int)f.d(l2 + l3, Integer.MAX_VALUE);
        return f.g(n4, n3, n7);
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof zl2;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (zl2)object;
            n3 = this.a;
            int n4 = ((zl2)object).a;
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }
}

