/*
 * Decompiled with CFR 0.152.
 */
public final class Sa3
implements cs0_1 {
    public final VR0 a;

    public Sa3(Vo0 vo0) {
        VR0 vR0;
        float f5 = Ta3.a;
        this.a = vR0 = new VR0(f5, vo0);
    }

    public final float a(float f5, float f6, long l2) {
        float f7;
        float f8;
        l2 /= 1000000L;
        VR0 vR0 = this.a;
        VR0$a vR0$a = vR0.a(f6);
        long l3 = vR0$a.c;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0) {
            f8 = l2;
            f7 = l3;
            f8 /= f7;
        } else {
            f8 = 1.0f;
        }
        f7 = Math.signum(vR0$a.a);
        f6 = vR0$a.b;
        f7 *= f6;
        f6 = zh.a((float)f8).a;
        return f7 * f6 + f5;
    }

    public final long b(float f5) {
        double d2 = this.a.b(f5);
        double d5 = (double)WR0.a - 1.0;
        return (long)(Math.exp(d2 / d5) * 1000.0) * 1000000L;
    }

    public final float c(float f5, float f6) {
        VR0 vR0 = this.a;
        double d2 = vR0.b(f6);
        double d5 = WR0.a;
        double d7 = d5 - 1.0;
        float f7 = vR0.a;
        float f8 = vR0.c;
        double d9 = f7 * f8;
        f8 = (float)(Math.exp(d5 / d7 * d2) * d9);
        return Math.signum(f6) * f8 + f5;
    }

    public final float d(long l2, float f5) {
        float f6;
        float f7;
        l2 /= 1000000L;
        VR0 vR0 = this.a;
        VR0$a vR0$a = vR0.a(f5);
        long l3 = vR0$a.c;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0) {
            f7 = l2;
            f6 = l3;
            f7 /= f6;
        } else {
            f7 = 1.0f;
        }
        zh$a zh$a = zh.a(f7);
        f6 = Math.signum(vR0$a.a);
        f7 = zh$a.b;
        f6 *= f7;
        f7 = vR0$a.b;
        f6 *= f7;
        f7 = l3;
        return f6 / f7 * 1000.0f;
    }
}

