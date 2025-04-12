/*
 * Decompiled with CFR 0.152.
 */
public final class Dm3 {
    public static final Fm3[] b;
    public static final long c;
    public final long a;

    static {
        long l2 = 0L;
        Fm3 fm3 = new Fm3(l2);
        Fm3 fm32 = new Fm3(0x100000000L);
        Fm3 fm33 = new Fm3(0x200000000L);
        Fm3[] fm3Array = new Fm3[]{fm3, fm32, fm33};
        b = fm3Array;
        c = Em3.i(l2, 0.0f / 0.0f);
    }

    public /* synthetic */ Dm3(long l2) {
        this.a = l2;
    }

    public static final boolean a(long l2, long l3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = l4 == false;
        return bl2;
    }

    public static final long b(long l2) {
        Fm3[] fm3Array = b;
        int n3 = (int)((l2 & 0xFF00000000L) >>> 32);
        return fm3Array[n3].a;
    }

    public static final float c(long l2) {
        return Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
    }

    public static int d(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public static String e(long l2) {
        String string2;
        long l3;
        long l4 = Dm3.b(l2);
        boolean bl2 = Fm3.a(l4, l3 = 0L);
        if (bl2) {
            string2 = "Unspecified";
        } else {
            l3 = 0x100000000L;
            bl2 = Fm3.a(l4, l3);
            if (bl2) {
                StringBuilder stringBuilder = new StringBuilder();
                float f5 = Dm3.c(l2);
                stringBuilder.append(f5);
                stringBuilder.append(".sp");
                string2 = stringBuilder.toString();
            } else {
                l3 = 0x200000000L;
                boolean bl3 = Fm3.a(l4, l3);
                if (bl3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    float f6 = Dm3.c(l2);
                    stringBuilder.append(f6);
                    stringBuilder.append(".em");
                    string2 = stringBuilder.toString();
                } else {
                    string2 = "Invalid";
                }
            }
        }
        return string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Dm3;
        boolean bl3 = false;
        if (bl2) {
            object = (Dm3)object;
            long l2 = this.a;
            long l3 = ((Dm3)object).a;
            long l4 = l2 - l3;
            long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l7 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return Dm3.d(this.a);
    }

    public final String toString() {
        return Dm3.e(this.a);
    }
}

