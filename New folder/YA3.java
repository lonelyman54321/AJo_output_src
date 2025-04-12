/*
 * Decompiled with CFR 0.152.
 */
public final class YA3 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public final void a(float f5, float f6, int n3, int n4, float[] fArray) {
        float f7 = fArray[0];
        int n7 = 1;
        float f8 = fArray[n7];
        float f11 = 0.5f;
        float f12 = f5 - f11;
        float f14 = 2.0f;
        f12 *= f14;
        f11 = (f6 - f11) * f14;
        f14 = this.c;
        f7 += f14;
        f14 = this.d;
        f8 += f14;
        f14 = this.a * f12 + f7;
        f7 = this.b * f11 + f8;
        f8 = (float)Math.toRadians(this.f);
        float f15 = (float)Math.toRadians(this.e);
        double d2 = (float)(-n3) * f12;
        double d5 = f8;
        double d7 = Math.sin(d5) * d2;
        double d9 = (float)n4 * f11;
        d2 = Math.cos(d5) * d9;
        float f16 = (float)(d7 - d2) * f15 + f14;
        double d12 = (float)n3 * f12;
        d7 = Math.cos(d5) * d12;
        d12 = Math.sin(d5) * d9;
        float f17 = (float)(d7 - d12);
        f15 = f15 * f17 + f7;
        fArray[0] = f16;
        fArray[n7] = f15;
    }
}

