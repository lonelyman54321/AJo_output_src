/*
 * Decompiled with CFR 0.152.
 */
public final class Kl3
extends co1_1 {
    public final Object g(Bo1 object, float f5) {
        LC1 lC1 = this.e;
        Object object2 = ((Bo1)object).b;
        if (lC1 != null) {
            Float f6 = ((Bo1)object).h;
            float f7 = f6 == null ? Float.MAX_VALUE : f6.floatValue();
            Object object3 = object2;
            object3 = (wr0_0)object2;
            object2 = ((Bo1)object).c;
            Object object4 = object2 == null ? object3 : (object2 = (wr0_0)object2);
            float f8 = this.d();
            float f11 = this.d;
            float f12 = ((Bo1)object).g;
            object = (wr0_0)lC1.b(f12, f7, object3, object4, f5, f8, f11);
        } else {
            float f14 = 1.0f;
            float f15 = f5 - f14;
            Object object5 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            if (object5 == false && (object = ((Bo1)object).c) != null) {
                object = (wr0_0)object;
            } else {
                object = object2;
                object = (wr0_0)object2;
            }
        }
        return object;
    }
}

