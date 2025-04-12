/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ll
 */
public final class ll_1
extends Ol {
    public float a;
    public float b;
    public final int c;

    public ll_1(float f5, float f6) {
        this.a = f5;
        this.b = f6;
        this.c = 2;
    }

    public final float a(int n3) {
        float f5;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n3 = 0;
                f5 = 0.0f;
            } else {
                f5 = this.b;
            }
        } else {
            f5 = this.a;
        }
        return f5;
    }

    public final int b() {
        return this.c;
    }

    public final Ol c() {
        ll_1 ll_12 = new ll_1(0.0f, 0.0f);
        return ll_12;
    }

    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    public final void e(float f5, int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
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
        boolean bl2 = object instanceof ll_1;
        if (!bl2) return false;
        object = (ll_1)object;
        float f5 = ((ll_1)object).a;
        float f6 = this.a;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 != false) return false;
        float f8 = ((ll_1)object).b;
        f5 = this.b;
        float f11 = f8 - f5;
        Object object3 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object3) return false;
        return true;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        return Float.floatToIntBits(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnimationVector2D: v1 = ");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", v2 = ");
        f5 = this.b;
        stringBuilder.append(f5);
        return stringBuilder.toString();
    }
}

