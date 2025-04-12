/*
 * Decompiled with CFR 0.152.
 */
public final class c60 {
    public final long a;

    public /* synthetic */ c60(long l2) {
        this.a = l2;
    }

    public static final long a(int n3, int n4, int n7, int n8) {
        boolean bl2 = false;
        char c2 = '\u0001';
        boolean bl3 = n7 >= 0 && n3 >= 0;
        if (bl3) {
            if (n4 >= n3) {
                bl2 = true;
            }
            c2 = ')';
            if (bl2) {
                if (n8 >= n7) {
                    return f60.i(n3, n4, n7, n8);
                }
                StringBuilder stringBuilder = new StringBuilder("maxHeight(");
                stringBuilder.append(n8);
                stringBuilder.append(") must be >= minHeight(");
                stringBuilder.append(n7);
                stringBuilder.append(c2);
                hz0.a(stringBuilder.toString());
                throw null;
            }
            StringBuilder stringBuilder = new StringBuilder("maxWidth(");
            stringBuilder.append(n4);
            stringBuilder.append(") must be >= minWidth(");
            stringBuilder.append(n3);
            stringBuilder.append(c2);
            hz0.a(stringBuilder.toString());
            throw null;
        }
        StringBuilder stringBuilder = new StringBuilder("minHeight(");
        stringBuilder.append(n7);
        stringBuilder.append(") and minWidth(");
        stringBuilder.append(n3);
        stringBuilder.append(") must be >= 0");
        hz0.a(stringBuilder.toString());
        throw null;
    }

    public static /* synthetic */ long b(long l2, int n3, int n4, int n7, int n8, int n10) {
        int n14 = n10 & 1;
        if (n14 != 0) {
            n3 = c60.k(l2);
        }
        if ((n14 = n10 & 2) != 0) {
            n4 = c60.i(l2);
        }
        if ((n14 = n10 & 4) != 0) {
            n7 = c60.j(l2);
        }
        if ((n10 &= 8) != 0) {
            n8 = c60.h(l2);
        }
        return c60.a(n3, n4, n7, n8);
    }

    public static final boolean c(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static final boolean d(long l2) {
        long l3 = (long)3 & l2;
        int n3 = (int)l3;
        int n4 = n3 & 1;
        int n7 = 1;
        n3 = ((n3 & 2) >> n7) * 3 + (n4 <<= n7);
        n4 = 18 - n3;
        int n8 = (int)(l2 >>= (n3 += 46));
        int n10 = n8 & (n4 = (n7 << n4) - n7);
        if (n10 == 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public static final boolean e(long l2) {
        long l3 = (long)3 & l2;
        int n3 = (int)l3;
        int n4 = n3 & 1;
        int n7 = 1;
        n4 <<= n7;
        n3 = (n3 & 2) >> n7;
        int n8 = 3;
        int n10 = 13;
        n4 = a60.a(n3, n8, n4, n10);
        n3 = 33;
        int n14 = (int)(l2 >>= n3);
        int n15 = n14 & (n4 = (n7 << n4) - n7);
        if (n15 == 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public static final boolean f(long l2) {
        long l3 = (long)3 & l2;
        int n3 = (int)l3;
        int n4 = n3 & 1;
        int n7 = 1;
        n3 = ((n3 & 2) >> n7) * 3 + (n4 <<= n7);
        n4 = 18 - n3;
        n4 = (n7 << n4) - n7;
        int n8 = n3 + 15;
        long l4 = l2 >> n8;
        int n10 = (int)l4;
        n8 = n10 & n4;
        int n14 = (int)(l2 >>= (n3 += 46));
        int n15 = n14 & n4;
        n15 = n15 == 0 ? -1 >>> 1 : (n15 -= n7);
        if (n8 != n15) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public static final boolean g(long l2) {
        long l3 = (long)3 & l2;
        int n3 = (int)l3;
        int n4 = n3 & 1;
        int n7 = 1;
        n4 <<= n7;
        int n8 = 2;
        n3 = (n3 & n8) >> n7;
        int n10 = 3;
        int n14 = 13;
        n4 = a60.a(n3, n10, n4, n14);
        n4 = (n7 << n4) - n7;
        long l4 = l2 >> n8;
        n3 = (int)l4 & n4;
        n8 = 33;
        int n15 = (int)(l2 >>= n8);
        int n16 = n15 & n4;
        n16 = n16 == 0 ? -1 >>> 1 : (n16 -= n7);
        if (n3 != n16) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public static final int h(long l2) {
        long l3 = (long)3 & l2;
        int n3 = (int)l3;
        int n4 = n3 & 1;
        int n7 = 1;
        n3 = ((n3 & 2) >> n7) * 3 + (n4 <<= n7);
        n4 = 18 - n3;
        int n8 = (int)(l2 >>= (n3 += 46));
        int n10 = n8 & (n4 = (n7 << n4) - n7);
        n10 = n10 == 0 ? -1 >>> 1 : (n10 -= n7);
        return n10;
    }

    public static final int i(long l2) {
        long l3 = (long)3 & l2;
        int n3 = (int)l3;
        int n4 = n3 & 1;
        int n7 = 1;
        n4 <<= n7;
        n3 = (n3 & 2) >> n7;
        int n8 = 3;
        int n10 = 13;
        n4 = a60.a(n3, n8, n4, n10);
        n3 = 33;
        int n14 = (int)(l2 >>= n3);
        int n15 = n14 & (n4 = (n7 << n4) - n7);
        n15 = n15 == 0 ? -1 >>> 1 : (n15 -= n7);
        return n15;
    }

    public static final int j(long l2) {
        int n3 = (int)((long)3 & l2);
        int n4 = n3 & 1;
        int n7 = 1;
        n3 = ((n3 & 2) >> n7) * 3 + (n4 <<= n7);
        n4 = 18 - n3;
        n4 = (n7 << n4) - n7;
        return (int)(l2 >> (n3 += 15)) & n4;
    }

    public static final int k(long l2) {
        int n3 = (int)((long)3 & l2);
        int n4 = n3 & 1;
        int n7 = 1;
        n4 <<= n7;
        int n8 = 2;
        n4 = a60.a((n3 & n8) >> n7, 3, n4, 13);
        n4 = (n7 << n4) - n7;
        return (int)(l2 >> n8) & n4;
    }

    public static final boolean l(long l2) {
        long l3 = (long)3 & l2;
        int n3 = (int)l3;
        int n4 = n3 & 1;
        int n7 = 1;
        n3 = ((n3 & 2) >> n7) * 3 + (n4 <<= n7);
        long l4 = l2 >> 33;
        n4 = (int)l4;
        int n8 = n3 + 13;
        if ((n4 = (n4 & (n8 = (n7 << n8) - n7)) - n7) == 0) {
            return n7 != 0;
        }
        n4 = n3 + 46;
        int n10 = (int)(l2 >>= n4);
        int n14 = 18 - n3;
        if ((n14 = ((n7 << n14) - n7 & n10) - n7) != 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public static String m(long l2) {
        int n3 = c60.i(l2);
        String string2 = "Infinity";
        int n4 = -1 >>> 1;
        String string3 = n3 == n4 ? string2 : String.valueOf(n3);
        int n7 = c60.h(l2);
        if (n7 != n4) {
            string2 = String.valueOf(n7);
        }
        StringBuilder stringBuilder = new StringBuilder("Constraints(minWidth = ");
        n7 = c60.k(l2);
        stringBuilder.append(n7);
        stringBuilder.append(", maxWidth = ");
        stringBuilder.append(string3);
        stringBuilder.append(", minHeight = ");
        int n8 = c60.j(l2);
        stringBuilder.append(n8);
        stringBuilder.append(", maxHeight = ");
        return ui0_1.a(stringBuilder, string2, ')');
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof c60;
        boolean bl3 = false;
        if (bl2) {
            object = (c60)object;
            long l2 = this.a;
            long l3 = ((c60)object).a;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        long l2 = this.a;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public final String toString() {
        return c60.m(this.a);
    }
}

