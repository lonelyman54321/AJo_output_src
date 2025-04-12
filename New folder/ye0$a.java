/*
 * Decompiled with CFR 0.152.
 */
public final class ye0$a
implements pr3$a {
    public final int b;
    public final boolean c;

    public ye0$a() {
        this(0, 3);
    }

    public ye0$a(int n3, int n4) {
        if ((n4 &= 1) != 0) {
            n3 = 100;
        }
        this.b = n3;
        n4 = 0;
        String string2 = null;
        this.c = false;
        if (n3 > 0) {
            return;
        }
        string2 = "durationMillis must be > 0.".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final pr3_0 a(Nr3 nr3, se1_0 se1_02) {
        boolean bl2 = se1_02 instanceof cg3_2;
        if (!bl2) {
            n42_0 n42_02 = new n42_0(nr3, se1_02);
            return n42_02;
        }
        Object object = se1_02;
        object = ((cg3_2)se1_02).c;
        ri0 ri02 = ri0.MEMORY_CACHE;
        if (object == ri02) {
            object = new n42_0(nr3, se1_02);
            return object;
        }
        int n3 = this.b;
        boolean bl3 = this.c;
        object = new ye0_2(nr3, se1_02, n3, bl3);
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                int n3;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                int n4 = object instanceof ye0$a;
                if (n4 == 0) break block4;
                object = (ye0$a)object;
                int n7 = this.b;
                n4 = ((ye0$a)object).b;
                if (n7 == n4 && (n4 = (int)(this.c ? 1 : 0)) == (n3 = ((ye0$a)object).c)) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.b * 31;
        int n4 = this.c;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }
}

