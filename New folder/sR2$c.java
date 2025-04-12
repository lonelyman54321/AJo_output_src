/*
 * Decompiled with CFR 0.152.
 */
public final class sR2$c {
    public final float a;
    public final float b;
    public float c = 0.0f;
    public float d = 0.0f;
    public boolean e = false;

    public sR2$c(float f5, float f6, float f7, float f8) {
        this.a = f5;
        this.b = f6;
        f5 = f7 * f7;
        f6 = f8 * f8 + f5;
        double d2 = Math.sqrt(f6);
        double d5 = 0.0;
        double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (d7 != false) {
            d5 = (double)f7 / d2;
            this.c = f7 = (float)d5;
            double d9 = (double)f8 / d2;
            this.d = f5 = (float)d9;
        }
    }

    public final void a(float f5, float f6) {
        float f7;
        float f8;
        float f11;
        double d2;
        float f12;
        double d5;
        double d7;
        double d9;
        float f14 = this.a;
        f5 -= f14;
        f14 = this.b;
        if ((d9 = (d7 = (d5 = Math.sqrt(f12 = (f6 -= f14) * f6 + (f14 = f5 * f5))) - (d2 = 0.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) != false) {
            f5 = (float)((double)f5 / d5);
            d2 = (double)f6 / d5;
            f6 = (float)d2;
        }
        if ((f11 = (f8 = f5 - (f12 = -(f14 = this.c))) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) == false && (f11 = (f7 = f6 - (f12 = -this.d)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) == false) {
            boolean bl2 = true;
            f14 = Float.MIN_VALUE;
            this.e = bl2;
            this.c = f6 = -f6;
            this.d = f5;
        } else {
            this.c = f14 += f5;
            this.d = f5 = this.d + f6;
        }
    }

    public final void b(sR2$c sR2$c) {
        float f5;
        float f6;
        float f7;
        float f8 = sR2$c.c;
        float f11 = this.c;
        float f12 = -f11;
        float f14 = f8 - f12;
        Object object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (object == false && (f7 = (f6 = (f12 = sR2$c.d) - (f5 = -this.d)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) == false) {
            float f15;
            boolean bl2;
            this.e = bl2 = true;
            this.c = f8 = -f12;
            this.d = f15 = sR2$c.c;
        } else {
            this.c = f11 += f8;
            f8 = this.d;
            float f16 = sR2$c.d;
            this.d = f8 += f16;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        float f5 = this.a;
        stringBuilder.append(f5);
        String string2 = ",";
        stringBuilder.append(string2);
        float f6 = this.b;
        stringBuilder.append(f6);
        stringBuilder.append(" ");
        f6 = this.c;
        stringBuilder.append(f6);
        stringBuilder.append(string2);
        f5 = this.d;
        stringBuilder.append(f5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

