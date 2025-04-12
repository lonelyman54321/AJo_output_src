/*
 * Decompiled with CFR 0.152.
 */
public final class aG2 {
    public static final aG2 e;
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    static {
        aG2 aG22;
        e = aG22 = new aG2(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public aG2(float f5, float f6, float f7, float f8) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
    }

    public final boolean a(long l2) {
        float f5;
        float f6;
        float f7;
        int n3;
        float f8;
        float f11;
        float f12;
        float f14 = e72.d(l2);
        float f15 = f14 - (f12 = this.a);
        Object object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (object >= 0 && (object = (f11 = (f14 = e72.d(l2)) - (f12 = this.c)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) < 0 && (object = (f8 = (f14 = e72.e(l2)) - (f12 = this.b)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) >= 0 && (n3 = (f7 = (f6 = e72.e(l2)) - (f5 = this.d)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) < 0) {
            n3 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f6 = 0.0f;
        }
        return n3 != 0;
    }

    public final long b() {
        float f5 = this.d();
        float f6 = 2.0f;
        f5 /= f6;
        float f7 = this.a;
        f5 += f7;
        f7 = this.c() / f6;
        f6 = this.b;
        return h72.a(f5, f7 += f6);
    }

    public final float c() {
        float f5 = this.d;
        float f6 = this.b;
        return f5 - f6;
    }

    public final float d() {
        float f5 = this.c;
        float f6 = this.a;
        return f5 - f6;
    }

    public final aG2 e(aG2 aG22) {
        float f5 = aG22.a;
        f5 = Math.max(this.a, f5);
        float f6 = this.b;
        float f7 = aG22.b;
        f6 = Math.max(f6, f7);
        f7 = this.c;
        float f8 = aG22.c;
        f7 = Math.min(f7, f8);
        f8 = this.d;
        float f11 = aG22.d;
        f11 = Math.min(f8, f11);
        aG2 aG23 = new aG2(f5, f6, f7, f11);
        return aG23;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof aG2;
        if (n3 == 0) {
            return false;
        }
        object = (aG2)object;
        float f5 = this.a;
        float f6 = ((aG2)object).a;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.b;
        f5 = ((aG2)object).b;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.c;
        f5 = ((aG2)object).c;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.d;
        float f7 = ((aG2)object).d;
        int n4 = Float.compare(f6, f7);
        if (n4 != 0) {
            return false;
        }
        return bl2;
    }

    public final boolean f() {
        float f5;
        float f6 = this.a;
        float f7 = this.c;
        float f8 = f6 - f7;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object < 0 && (object = (f5 = (f6 = this.b) - (f7 = this.d)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) < 0) {
            object = false;
            f6 = 0.0f;
        } else {
            object = true;
            f6 = Float.MIN_VALUE;
        }
        return (boolean)object;
    }

    public final boolean g(aG2 aG22) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12 = this.c;
        float f14 = aG22.a;
        float f15 = f12 - f14;
        Object object = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        return object > 0 && (object = (f11 = (f12 = aG22.c) - (f14 = this.a)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) > 0 && (object = (f8 = (f12 = this.d) - (f14 = aG22.b)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) > 0 && (f7 = (f6 = (f5 = aG22.d) - (f12 = this.b)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) > 0;
        {
        }
    }

    public final aG2 h(float f5, float f6) {
        float f7 = this.a + f5;
        float f8 = this.b + f6;
        float f11 = this.c + f5;
        f5 = this.d + f6;
        aG2 aG22 = new aG2(f7, f8, f11, f5);
        return aG22;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, n4);
        n3 = UR0.a(this.c, n3, n4);
        return Float.floatToIntBits(this.d) + n3;
    }

    public final aG2 i(long l2) {
        float f5 = this.a;
        float f6 = e72.d(l2) + f5;
        f5 = this.b;
        float f7 = e72.e(l2) + f5;
        f5 = this.c;
        float f8 = e72.d(l2) + f5;
        f5 = this.d;
        float f11 = e72.e(l2) + f5;
        aG2 aG22 = new aG2(f6, f7, f8, f11);
        return aG22;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Rect.fromLTRB(");
        String string2 = jZ0.a(this.a);
        stringBuilder.append(string2);
        string2 = ", ";
        stringBuilder.append(string2);
        String string3 = jZ0.a(this.b);
        stringBuilder.append(string3);
        stringBuilder.append(string2);
        string3 = jZ0.a(this.c);
        stringBuilder.append(string3);
        stringBuilder.append(string2);
        string2 = jZ0.a(this.d);
        stringBuilder.append(string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

