/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Kl
 */
public final class kl_1
extends Ol {
    public float a;
    public final int b;

    public kl_1(float f5) {
        this.a = f5;
        this.b = 1;
    }

    public final float a(int n3) {
        if (n3 == 0) {
            return this.a;
        }
        return 0.0f;
    }

    public final int b() {
        return this.b;
    }

    public final Ol c() {
        kl_1 kl_12 = new kl_1(0.0f);
        return kl_12;
    }

    public final void d() {
        this.a = 0.0f;
    }

    public final void e(float f5, int n3) {
        if (n3 == 0) {
            this.a = f5;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        void var5_8;
        boolean bl2 = object instanceof kl_1;
        if (bl2) {
            object = (kl_1)object;
            float f5 = ((kl_1)object).a;
            float f6 = this.a;
            float f7 = f5 - f6;
            Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object2 == false) {
                return (boolean)var5_8;
            }
        }
        boolean bl3 = false;
        return (boolean)var5_8;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnimationVector1D: value = ");
        float f5 = this.a;
        stringBuilder.append(f5);
        return stringBuilder.toString();
    }
}

