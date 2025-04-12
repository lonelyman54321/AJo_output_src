/*
 * Decompiled with CFR 0.152.
 */
public final class VR0 {
    public final float a;
    public final Vo0 b;
    public final float c;

    public VR0(float f5, Vo0 vo0) {
        this.a = f5;
        this.b = vo0;
        f5 = vo0.getDensity();
        this.c = f5 = f5 * 386.0878f * 160.0f * 0.84f;
    }

    public final VR0$a a(float f5) {
        double d2 = this.b(f5);
        double d5 = WR0.a;
        double d7 = d5 - 1.0;
        float f6 = this.a;
        float f7 = this.c;
        double d9 = f6 * f7;
        float f8 = (float)(Math.exp(d5 / d7 * d2) * d9);
        long l2 = (long)(Math.exp(d2 / d7) * 1000.0);
        VR0$a vR0$a = new VR0$a(f5, f8, l2);
        return vR0$a;
    }

    public final double b(float f5) {
        float f6 = this.a;
        float f7 = this.c;
        double d2 = Math.abs(f5) * 0.35f;
        double d5 = f6 *= f7;
        return Math.log(d2 / d5);
    }
}

