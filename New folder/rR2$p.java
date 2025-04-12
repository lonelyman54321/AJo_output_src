/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$p
implements Cloneable {
    public final float a;
    public final rR2$d0 b;

    public rR2$p(float f5) {
        rR2$d0 rR2$d0;
        this.a = f5;
        this.b = rR2$d0 = rR2$d0.px;
    }

    public rR2$p(float f5, rR2$d0 rR2$d0) {
        this.a = f5;
        this.b = rR2$d0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float b(float f5) {
        int[] nArray = rR2$a.a;
        rR2$d0 rR2$d0 = this.b;
        int n3 = rR2$d0.ordinal();
        int n4 = nArray[n3];
        n3 = 1;
        float f6 = this.a;
        if (n4 == n3) return f6;
        switch (n4) {
            default: {
                return f6;
            }
            case 8: {
                f6 *= f5;
                f5 = 6.0f;
                return f6 / f5;
            }
            case 7: {
                f6 *= f5;
                f5 = 72.0f;
                return f6 / f5;
            }
            case 6: {
                f6 *= f5;
                f5 = 25.4f;
                return f6 / f5;
            }
            case 5: {
                f6 *= f5;
                f5 = 2.54f;
                return f6 / f5;
            }
            case 4: 
        }
        f6 *= f5;
        return f6;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float d(sR2 object) {
        void var2_5;
        rR2$d0 rR2$d0 = this.b;
        rR2$d0 rR2$d02 = rR2$d0.percent;
        if (rR2$d0 != rR2$d02) return this.f((sR2)object);
        object = ((sR2)object).d;
        rR2$b rR2$b = ((sR2$h)object).g;
        if (rR2$b == null) {
            rR2$b rR2$b2 = ((sR2$h)object).f;
        }
        float f5 = this.a;
        if (var2_5 == null) {
            return f5;
        }
        float f6 = var2_5.c;
        float f7 = var2_5.d;
        float f8 = 100.0f;
        Object object2 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
        if (object2 == false) {
            f5 *= f6;
            return f5 / f8;
        }
        f6 *= f6;
        double d2 = Math.sqrt(f7 * f7 + f6);
        double d5 = 1.414213562373095;
        f7 = (float)(d2 /= d5);
        f5 *= f7;
        return f5 / f8;
    }

    public final float e(sR2 sR22, float f5) {
        rR2$d0 rR2$d0 = this.b;
        rR2$d0 rR2$d02 = rR2$d0.percent;
        if (rR2$d0 == rR2$d02) {
            return this.a * f5 / 100.0f;
        }
        return this.f(sR22);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float f(sR2 object) {
        int[] nArray = rR2$a.a;
        rR2$d0 rR2$d0 = this.b;
        int n3 = rR2$d0.ordinal();
        int n4 = nArray[n3];
        float f5 = this.a;
        switch (n4) {
            default: {
                return f5;
            }
            case 9: {
                void var2_5;
                object = ((sR2)object).d;
                rR2$b rR2$b = ((sR2$h)object).g;
                if (rR2$b == null) {
                    rR2$b rR2$b2 = ((sR2$h)object).f;
                }
                if (var2_5 == null) {
                    return f5;
                }
                float f6 = var2_5.c;
                f5 *= f6;
                f6 = 100.0f;
                return f5 / f6;
            }
            case 8: {
                float f6 = ((sR2)object).b;
                f5 *= f6;
                f6 = 6.0f;
                return f5 / f6;
            }
            case 7: {
                float f6 = ((sR2)object).b;
                f5 *= f6;
                f6 = 72.0f;
                return f5 / f6;
            }
            case 6: {
                float f6 = ((sR2)object).b;
                f5 *= f6;
                f6 = 25.4f;
                return f5 / f6;
            }
            case 5: {
                float f6 = ((sR2)object).b;
                f5 *= f6;
                f6 = 2.54f;
                return f5 / f6;
            }
            case 4: {
                float f7 = ((sR2)object).b;
                return f5 * f7;
            }
            case 3: {
                return ((sR2)object).d.d.getTextSize() / 2.0f * f5;
            }
            case 2: 
        }
        return ((sR2)object).d.d.getTextSize() * f5;
    }

    public final float g(sR2 object) {
        Object object2 = this.b;
        rR2$d0 rR2$d0 = rR2$d0.percent;
        if (object2 == rR2$d0) {
            object = ((sR2)object).d;
            object2 = ((sR2$h)object).g;
            if (object2 == null) {
                object2 = ((sR2$h)object).f;
            }
            float f5 = this.a;
            if (object2 == null) {
                return f5;
            }
            float f6 = ((rR2$b)object2).d;
            return f5 * f6 / 100.0f;
        }
        return this.f((sR2)object);
    }

    public final boolean i() {
        float f5 = this.a;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object < 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    public final boolean j() {
        float f5 = this.a;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object == false) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = String.valueOf(this.a);
        stringBuilder.append((String)object);
        object = this.b;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

