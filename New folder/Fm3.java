/*
 * Decompiled with CFR 0.152.
 */
public final class Fm3 {
    public final long a;

    public /* synthetic */ Fm3(long l2) {
        this.a = l2;
    }

    public static final boolean a(long l2, long l3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = l4 == false;
        return bl2;
    }

    public static String b(long l2) {
        boolean bl2;
        long l3 = 0L;
        boolean bl3 = Fm3.a(l2, l3);
        String string2 = bl3 ? "Unspecified" : ((bl3 = Fm3.a(l2, l3 = 0x100000000L)) ? "Sp" : ((bl2 = Fm3.a(l2, l3 = 0x200000000L)) ? "Em" : "Invalid"));
        return string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Fm3;
        boolean bl3 = false;
        if (bl2) {
            object = (Fm3)object;
            long l2 = this.a;
            long l3 = ((Fm3)object).a;
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
        return Fm3.b(this.a);
    }
}

