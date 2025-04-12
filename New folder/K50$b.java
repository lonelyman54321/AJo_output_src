/*
 * Decompiled with CFR 0.152.
 */
public final class K50$b
implements K50$c {
    public float a;
    public boolean b;
    public String c;
    public String d;
    public float e;
    public float f;

    public final float value() {
        float f5 = this.e;
        float f6 = this.f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object >= 0) {
            object = true;
            f6 = Float.MIN_VALUE;
            this.b = object;
        }
        if ((object = (Object)this.b) == false) {
            f6 = this.a;
            this.e = f5 += f6;
        }
        return this.e;
    }
}

