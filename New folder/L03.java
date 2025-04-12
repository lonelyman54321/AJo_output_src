/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

public final class L03
implements mx0 {
    public final int a;
    public final int b;

    public L03(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public final void a(Xx0 xx0) {
        int n3 = xx0.d;
        int n4 = -1;
        if (n3 != n4) {
            xx0.d = n4;
            xx0.e = n4;
        }
        dn2 dn22 = xx0.a;
        n4 = dn22.a();
        n4 = f.g(this.a, 0, n4);
        n3 = dn22.a();
        int n7 = this.b;
        if (n4 != (n3 = f.g(n7, 0, n3))) {
            if (n4 < n3) {
                xx0.e(n4, n3);
            } else {
                xx0.e(n3, n4);
            }
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof L03;
        if (n3 == 0) {
            return false;
        }
        object = (L03)object;
        int n4 = this.a;
        n3 = ((L03)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        int n7 = ((L03)object).b;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SetComposingRegionCommand(start=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", end=");
        n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

