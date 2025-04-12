/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Jo0
 */
public final class jo0_0
implements mx0 {
    public final int a;
    public final int b;

    public jo0_0(int n3, int n4) {
        this.a = n3;
        this.b = n4;
        if (n3 >= 0 && n4 >= 0) {
            return;
        }
        String string2 = z41.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", n3, n4);
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final void a(Xx0 xx0) {
        int n3 = xx0.c;
        int n4 = this.b;
        int n7 = n3 + n4;
        n3 ^= n7;
        dn2 dn22 = xx0.a;
        if ((n3 &= (n4 ^= n7)) < 0) {
            n7 = dn22.a();
        }
        n3 = xx0.c;
        n4 = dn22.a();
        n4 = Math.min(n7, n4);
        xx0.a(n3, n4);
        n3 = xx0.b;
        n4 = this.a;
        n7 = n3 - n4;
        n4 ^= n3;
        n3 = (n3 ^ n7) & n4;
        n4 = 0;
        dn22 = null;
        if (n3 < 0) {
            n7 = 0;
        }
        n3 = Math.max(0, n7);
        n4 = xx0.b;
        xx0.a(n3, n4);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof jo0_0;
        if (n3 == 0) {
            return false;
        }
        object = (jo0_0)object;
        int n4 = this.a;
        n3 = ((jo0_0)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        int n7 = ((jo0_0)object).b;
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
        StringBuilder stringBuilder = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", lengthAfterCursor=");
        n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

