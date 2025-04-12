/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from b13
 */
public final class b13_0 {
    public static final b13_0 d;
    public final long a;
    public final long b;
    public final float c;

    static {
        b13_0 b13_02;
        d = b13_02 = new b13_0();
    }

    public /* synthetic */ b13_0() {
        long l2 = zx_0.d(0xFF000000L);
        this(l2, 0L, 0.0f);
    }

    public b13_0(long l2, long l3, float f5) {
        this.a = l2;
        this.b = l3;
        this.c = f5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof b13_0;
        if (!bl3) {
            return false;
        }
        object = (b13_0)object;
        long l2 = this.a;
        long l3 = ((b13_0)object).a;
        bl3 = OX.c(l2, l3);
        if (!bl3) {
            return false;
        }
        l3 = this.b;
        l2 = ((b13_0)object).b;
        bl3 = e72.b(l3, l2);
        if (!bl3) {
            return false;
        }
        float f5 = this.c;
        float f6 = ((b13_0)object).c;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 == false) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = OX.m;
        n3 = mt3_0.a(this.a) * 31;
        int n4 = (e72.f(this.b) + n3) * 31;
        return Float.floatToIntBits(this.c) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Shadow(color=");
        String string2 = OX.i(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", offset=");
        string2 = e72.k(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", blurRadius=");
        float f5 = this.c;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

