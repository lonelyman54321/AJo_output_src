/*
 * Decompiled with CFR 0.152.
 */
public final class C63 {
    public final long a;

    public /* synthetic */ C63(long l2) {
        this.a = l2;
    }

    public static final boolean a(long l2, long l3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = l4 == false;
        return bl2;
    }

    public static final float b(long l2) {
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) {
            return Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
        }
        IllegalStateException illegalStateException = new IllegalStateException("Size is unspecified");
        throw illegalStateException;
    }

    public static final float c(long l2) {
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) {
            l3 = l2 >> 32;
            long l8 = Integer.MAX_VALUE;
            float f5 = Float.intBitsToFloat((int)(l3 & l8));
            float f6 = Float.intBitsToFloat((int)(l2 & l8));
            return Math.min(f5, f6);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Size is unspecified");
        throw illegalStateException;
    }

    public static final float d(long l2) {
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) {
            return Float.intBitsToFloat((int)(l2 >> 32));
        }
        IllegalStateException illegalStateException = new IllegalStateException("Size is unspecified");
        throw illegalStateException;
    }

    public static final boolean e(long l2) {
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) {
            boolean bl2;
            l3 = (0x8000000080000000L & l2) >>> 31;
            long l8 = -1;
            l3 = l3 * l8 ^ (long)-1;
            l2 &= l3;
            int n3 = 32;
            l3 = l2 >>> n3;
            l8 = 0xFFFFFFFFL;
            long l12 = (l2 = l2 & l8 & l3) - (l3 = 0L);
            l7 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (l7 == false) {
                bl2 = true;
            } else {
                bl2 = false;
                Object var9_6 = null;
            }
            return bl2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Size is unspecified");
        throw illegalStateException;
    }

    public static String f(long l2) {
        String string2;
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) {
            StringBuilder stringBuilder = new StringBuilder("Size(");
            float f5 = C63.d(l2);
            String string3 = jZ0.a(f5);
            stringBuilder.append(string3);
            string3 = ", ";
            stringBuilder.append(string3);
            string2 = jZ0.a(C63.b(l2));
            stringBuilder.append(string2);
            char c2 = ')';
            stringBuilder.append(c2);
            string2 = stringBuilder.toString();
        } else {
            string2 = "Size.Unspecified";
        }
        return string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof C63;
        boolean bl3 = false;
        if (bl2) {
            object = (C63)object;
            long l2 = this.a;
            long l3 = ((C63)object).a;
            long l4 = l2 - l3;
            long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l7 == false) {
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
        return C63.f(this.a);
    }
}

