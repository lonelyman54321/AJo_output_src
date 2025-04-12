/*
 * Decompiled with CFR 0.152.
 */
public final class Ko0
implements mx0 {
    public final int a;
    public final int b;

    public Ko0(int n3, int n4) {
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
        char c2;
        int n3;
        int n4;
        int n7;
        int n8 = 0;
        int n10 = 0;
        for (n7 = 0; n7 < (n4 = this.a); ++n7) {
            n3 = xx0.b;
            n4 = n10 + 1;
            if (n3 > n4) {
                n3 = n3 - n4 + -1;
                n3 = xx0.b(n3);
                c2 = xx0.b - n4;
                c2 = xx0.b(c2);
                if ((n3 = (int)(Character.isHighSurrogate((char)n3) ? 1 : 0)) != 0 && (n3 = (int)(Character.isLowSurrogate(c2) ? 1 : 0)) != 0) {
                    n10 += 2;
                    continue;
                }
                n10 = n4;
                continue;
            }
            n10 = n3;
            break;
        }
        n7 = 0;
        while (n8 < (n4 = this.b)) {
            n4 = n7 + 1;
            n3 = xx0.c + n4;
            dn2 dn22 = xx0.a;
            int n14 = dn22.a();
            if (n3 < n14) {
                n3 = xx0.c + n4 + -1;
                n3 = xx0.b(n3);
                c2 = xx0.c + n4;
                c2 = xx0.b(c2);
                n7 = (n3 = (int)(Character.isHighSurrogate((char)n3) ? 1 : 0)) != 0 && (n3 = (int)(Character.isLowSurrogate(c2) ? 1 : 0)) != 0 ? (n7 += 2) : n4;
                ++n8;
                continue;
            }
            n8 = dn22.a();
            n7 = xx0.c;
            n7 = n8 - n7;
            break;
        }
        n8 = xx0.c;
        xx0.a(n8, n7 += n8);
        n8 = xx0.b;
        n7 = n8 - n10;
        xx0.a(n7, n8);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Ko0;
        if (n3 == 0) {
            return false;
        }
        object = (Ko0)object;
        int n4 = this.a;
        n3 = ((Ko0)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        int n7 = ((Ko0)object).b;
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
        StringBuilder stringBuilder = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", lengthAfterCursor=");
        n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

