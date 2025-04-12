/*
 * Decompiled with CFR 0.152.
 */
public final class NP2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        long l2 = r90_0.a;
        float f5 = r90_0.b(l2);
        float f6 = r90_0.c(l2);
        s90.a(f5, f6);
    }

    public NP2(float f5, float f6, float f7, float f8, long l2, long l3, long l4, long l7) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = l7;
    }

    public final float a() {
        float f5 = this.d;
        float f6 = this.b;
        return f5 - f6;
    }

    public final float b() {
        float f5 = this.c;
        float f6 = this.a;
        return f5 - f6;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof NP2;
        if (n3 == 0) {
            return false;
        }
        object = (NP2)object;
        float f5 = this.a;
        float f6 = ((NP2)object).a;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.b;
        f5 = ((NP2)object).b;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.c;
        f5 = ((NP2)object).c;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.d;
        f5 = ((NP2)object).d;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        long l2 = this.e;
        long l3 = ((NP2)object).e;
        n3 = r90_0.a(l2, l3) ? 1 : 0;
        if (n3 == 0) {
            return false;
        }
        l2 = this.f;
        l3 = ((NP2)object).f;
        n3 = r90_0.a(l2, l3) ? 1 : 0;
        if (n3 == 0) {
            return false;
        }
        l2 = this.g;
        l3 = ((NP2)object).g;
        n3 = r90_0.a(l2, l3) ? 1 : 0;
        if (n3 == 0) {
            return false;
        }
        l2 = this.h;
        l3 = ((NP2)object).h;
        boolean bl3 = r90_0.a(l2, l3);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, n4);
        n3 = UR0.a(this.c, n3, n4);
        n3 = UR0.a(this.d, n3, n4);
        long l2 = this.e;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = ((int)(l2 ^ l3) + n3) * 31;
        l3 = this.f;
        long l4 = l3 >>> n7;
        n3 = ((int)(l3 ^ l4) + n8) * 31;
        l2 = this.g;
        l3 = l2 >>> n7;
        n8 = ((int)(l2 ^ l3) + n3) * 31;
        long l7 = this.h;
        long l8 = l7 >>> n7;
        return (int)(l7 ^ l8) + n8;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        String string2 = jZ0.a(this.a);
        ((StringBuilder)charSequence).append(string2);
        string2 = ", ";
        ((StringBuilder)charSequence).append(string2);
        String string3 = jZ0.a(this.b);
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(string2);
        float f5 = this.c;
        string3 = jZ0.a(f5);
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(string2);
        float f6 = this.d;
        string2 = jZ0.a(f6);
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        long l2 = this.e;
        long l3 = this.f;
        boolean bl2 = r90_0.a(l2, l3);
        char c2 = ')';
        String string4 = "RoundRect(rect=";
        long l4 = this.g;
        long l7 = this.h;
        if (bl2 && (bl2 = r90_0.a(l3, l4)) && (bl2 = r90_0.a(l4, l7))) {
            float f7;
            float f8 = r90_0.b(l2);
            float f11 = f8 - (f7 = r90_0.c(l2));
            float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (f12 == false) {
                charSequence = Gn.a(string4, (String)charSequence, ", radius=");
                string2 = jZ0.a(r90_0.b(l2));
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(c2);
                return ((StringBuilder)charSequence).toString();
            }
            charSequence = Gn.a(string4, (String)charSequence, ", x=");
            String string5 = jZ0.a(r90_0.b(l2));
            ((StringBuilder)charSequence).append(string5);
            ((StringBuilder)charSequence).append(", y=");
            string2 = jZ0.a(r90_0.c(l2));
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(c2);
            return ((StringBuilder)charSequence).toString();
        }
        charSequence = Gn.a(string4, (String)charSequence, ", topLeft=");
        string2 = r90_0.d(l2);
        ((StringBuilder)charSequence).append((Object)string2);
        ((StringBuilder)charSequence).append(", topRight=");
        string2 = r90_0.d(l3);
        ((StringBuilder)charSequence).append((Object)string2);
        ((StringBuilder)charSequence).append(", bottomRight=");
        string2 = r90_0.d(l4);
        ((StringBuilder)charSequence).append((Object)string2);
        ((StringBuilder)charSequence).append(", bottomLeft=");
        string2 = r90_0.d(l7);
        ((StringBuilder)charSequence).append((Object)string2);
        ((StringBuilder)charSequence).append(c2);
        return ((StringBuilder)charSequence).toString();
    }
}

