/*
 * Decompiled with CFR 0.152.
 */
public final class oO0
implements lg3_0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public oO0(float f5, float f6, float f7, float f8) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
    }

    public final int a(Vo0 vo0) {
        float f5 = this.b;
        return vo0.e0(f5);
    }

    public final int b(Vo0 vo0, bp1_0 bp1_02) {
        float f5 = this.c;
        return vo0.e0(f5);
    }

    public final int c(Vo0 vo0) {
        float f5 = this.d;
        return vo0.e0(f5);
    }

    public final int d(Vo0 vo0, bp1_0 bp1_02) {
        float f5 = this.a;
        return vo0.e0(f5);
    }

    public final boolean equals(Object object) {
        float f5;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof oO0;
        if (!bl4) {
            return false;
        }
        object = (oO0)object;
        float f6 = this.a;
        float f7 = ((oO0)object).a;
        bl4 = xs0_0.a(f6, f7);
        if (!(bl4 && (bl4 = xs0_0.a(f7 = this.b, f6 = ((oO0)object).b)) && (bl4 = xs0_0.a(f7 = this.c, f6 = ((oO0)object).c)) && (bl2 = xs0_0.a(f7 = this.d, f5 = ((oO0)object).d)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, n4);
        n3 = UR0.a(this.c, n3, n4);
        return Float.floatToIntBits(this.d) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Insets(left=");
        String string2 = xs0_0.b(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", top=");
        string2 = xs0_0.b(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", right=");
        string2 = xs0_0.b(this.c);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", bottom=");
        string2 = xs0_0.b(this.d);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

