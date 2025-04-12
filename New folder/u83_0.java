/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from u83
 */
public final class u83_0
implements xw0_1 {
    public final int a;

    public u83_0() {
        this(0);
    }

    public u83_0(int n3) {
        this.a = n3;
    }

    public final ma3_0 b(Vs3 object) {
        int n3 = this.a;
        object = new ta3_0(n3);
        return object;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof u83_0;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (u83_0)object;
            int n4 = ((u83_0)object).a;
            n3 = this.a;
            if (n4 == n3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }
}

