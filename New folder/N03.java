/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

public final class N03
implements mx0 {
    public final int a;
    public final int b;

    public N03(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public final void a(Xx0 xx0) {
        dn2 dn22 = xx0.a;
        int n3 = dn22.a();
        n3 = f.g(this.a, 0, n3);
        dn2 dn23 = xx0.a;
        int n4 = dn23.a();
        int n7 = this.b;
        if (n3 < (n4 = f.g(n7, 0, n4))) {
            xx0.f(n3, n4);
        } else {
            xx0.f(n4, n3);
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof N03;
        if (n3 == 0) {
            return false;
        }
        object = (N03)object;
        int n4 = this.a;
        n3 = ((N03)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        int n7 = ((N03)object).b;
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
        StringBuilder stringBuilder = new StringBuilder("SetSelectionCommand(start=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", end=");
        n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

