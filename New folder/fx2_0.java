/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fX2
 */
public final class fx2_0 {
    public static final fx2_0 c;
    public final long a;
    public final long b;

    static {
        fx2_0 fx2_02;
        long l2 = 0L;
        c = fx2_02 = new fx2_0(l2, l2);
    }

    public fx2_0(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<fx2_0> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = fx2_0.class) == (clazz = object.getClass())) {
            long l2;
            long l3;
            object = (fx2_0)object;
            long l4 = this.a;
            long l7 = ((fx2_0)object).a;
            long l8 = l4 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 != false || (l3 = (l2 = (l4 = this.b) - (l7 = ((fx2_0)object).b)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
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

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[timeUs=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", position=");
        l2 = this.b;
        return jl0_0.b(stringBuilder, l2, "]");
    }
}

