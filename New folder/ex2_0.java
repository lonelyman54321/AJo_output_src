/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eX2
 */
public final class ex2_0 {
    public static final ex2_0 c;
    public final long a;
    public final long b;

    static {
        long l2 = 0L;
        ex2_0 ex2_02 = new ex2_0(l2, l2);
        long l3 = Long.MAX_VALUE;
        ex2_0 ex2_03 = new ex2_0(l3, l3);
        new ex2_0(l3, l2);
        new ex2_0(l2, l3);
        c = ex2_02;
    }

    public ex2_0(long l2, long l3) {
        boolean bl2 = false;
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        l7 = l7 >= 0 ? (long)1 : (long)0;
        ct3.a((boolean)l7);
        l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 >= 0) {
            bl2 = true;
        }
        ct3.a(bl2);
        this.a = l2;
        this.b = l3;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<ex2_0> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = ex2_0.class) == (clazz = object.getClass())) {
            long l2;
            long l3;
            object = (ex2_0)object;
            long l4 = this.a;
            long l7 = ((ex2_0)object).a;
            long l8 = l4 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 != false || (l3 = (l2 = (l4 = this.b) - (l7 = ((ex2_0)object).b)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (int)this.a * 31;
        int n4 = (int)this.b;
        return n3 + n4;
    }
}

