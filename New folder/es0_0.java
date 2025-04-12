/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eS0
 */
public final class es0_0
extends co1_1 {
    public es0_0() {
        throw null;
    }

    public final Object g(Bo1 bo1, float f5) {
        return Float.valueOf(this.n(bo1, f5));
    }

    public final float m() {
        Bo1 bo1 = this.b();
        float f5 = this.d();
        return this.n(bo1, f5);
    }

    public final float n(Bo1 object, float f5) {
        Object object2 = ((Bo1)object).b;
        if (object2 != null && (object2 = ((Bo1)object).c) != null) {
            float f6;
            float f7;
            float f8;
            Object object3;
            float f11;
            Object object4 = this.e;
            object2 = ((Bo1)object).b;
            if (object4 != null) {
                float f12;
                Object object5;
                float f14 = ((Bo1)object).h.floatValue();
                Object object6 = object2;
                object6 = (Float)object2;
                Object object7 = object5 = ((Bo1)object).c;
                f11 = ((Bo1)object).g;
                object7 = (Float)object5;
                float f15 = this.e();
                if ((object4 = (Float)((LC1)object4).b(f11, f14, object6, object7, f5, f15, f12 = this.d)) != null) {
                    return ((Float)object4).floatValue();
                }
            }
            if ((object3 = (f8 = (f7 = ((Bo1)object).i) - (f11 = -3987645.8f)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) == false) {
                object2 = (Float)object2;
                ((Bo1)object).i = f6 = ((Float)object2).floatValue();
            }
            f6 = ((Bo1)object).i;
            f7 = ((Bo1)object).j;
            float f16 = f7 - f11;
            object3 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
            if (object3 == false) {
                object4 = (Float)((Bo1)object).c;
                ((Bo1)object).j = f7 = ((Float)object4).floatValue();
            }
            float f17 = ((Bo1)object).j;
            return mp1_0.f(f6, f17, f5);
        }
        object = new IllegalStateException("Missing values for keyframe.");
        throw object;
    }
}

