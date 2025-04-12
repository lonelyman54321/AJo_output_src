/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SG
 */
public final class sg_1
extends QG {
    public float e;

    public sg_1(float f5) {
        super(null);
        this.e = f5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof sg_1;
        if (bl3) {
            float f5 = this.f();
            object = (sg_1)object;
            float f6 = ((sg_1)object).f();
            boolean bl4 = Float.isNaN(f5);
            if (bl4 && (bl4 = Float.isNaN(f6))) {
                return bl2;
            }
            Object object2 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
            if (object2 != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final float f() {
        int n3;
        Object object;
        float f5 = this.e;
        int n4 = Float.isNaN(f5);
        if (n4 != 0 && (object = this.a) != null && (n4 = ((char[])object).length) >= (n3 = 1)) {
            object = this.e();
            this.e = f5 = Float.parseFloat((String)object);
        }
        return this.e;
    }

    public final int g() {
        int n3;
        Object object;
        float f5 = this.e;
        int n4 = Float.isNaN(f5);
        if (n4 != 0 && (object = this.a) != null && (n4 = ((char[])object).length) >= (n3 = 1)) {
            object = this.e();
            n4 = Integer.parseInt((String)object);
            this.e = f5 = (float)n4;
        }
        return (int)this.e;
    }

    public final int hashCode() {
        int n3;
        int n4 = super.hashCode() * 31;
        float f5 = this.e;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object != false) {
            n3 = Float.floatToIntBits(f5);
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return n4 + n3;
    }
}

