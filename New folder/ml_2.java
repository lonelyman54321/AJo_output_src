/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ml
 */
public final class ml_2
extends Ol {
    public float a;
    public float b;
    public float c;
    public final int d;

    public ml_2(float f5, float f6, float f7) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = 3;
    }

    public final float a(int n3) {
        float f5;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n3 = 0;
                    f5 = 0.0f;
                } else {
                    f5 = this.c;
                }
            } else {
                f5 = this.b;
            }
        } else {
            f5 = this.a;
        }
        return f5;
    }

    public final int b() {
        return this.d;
    }

    public final Ol c() {
        ml_2 ml_22 = new ml_2(0.0f, 0.0f, 0.0f);
        return ml_22;
    }

    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    public final void e(float f5, int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 == n4) {
                    this.c = f5;
                }
            } else {
                this.b = f5;
            }
        } else {
            this.a = f5;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof ml_2;
        if (!bl2) return false;
        object = (ml_2)object;
        float f5 = ((ml_2)object).a;
        float f6 = this.a;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 != false) return false;
        f5 = ((ml_2)object).b;
        f6 = this.b;
        float f8 = f5 - f6;
        Object object3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object3 != false) return false;
        float f11 = ((ml_2)object).c;
        f5 = this.c;
        float f12 = f11 - f5;
        Object object4 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object4) return false;
        return true;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        n3 = UR0.a(this.b, n3, 31);
        return Float.floatToIntBits(this.c) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnimationVector3D: v1 = ");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", v2 = ");
        f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(", v3 = ");
        f5 = this.c;
        stringBuilder.append(f5);
        return stringBuilder.toString();
    }
}

