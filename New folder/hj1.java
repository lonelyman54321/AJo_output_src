/*
 * Decompiled with CFR 0.152.
 */
public final class hj1
extends co1_1 {
    /*
     * Enabled aggressive block sorting
     */
    public final Object g(Bo1 object, float f5) {
        int n3;
        int n4;
        int n7;
        Object object2 = ((Bo1)object).b;
        if (object2 == null) {
            object = new IllegalStateException("Missing values for keyframe.");
            throw object;
        }
        Object object3 = ((Bo1)object).c;
        int n8 = 784923401;
        if (object3 == null) {
            n7 = ((Bo1)object).k;
            if (n7 == n8) {
                object3 = object2;
                object3 = (Integer)object2;
                ((Bo1)object).k = n7 = ((Integer)object3).intValue();
            }
            n7 = ((Bo1)object).k;
        } else {
            n4 = ((Bo1)object).l;
            if (n4 == n8) {
                object3 = (Integer)object3;
                ((Bo1)object).l = n7 = ((Integer)object3).intValue();
            }
            n7 = ((Bo1)object).l;
        }
        Object object4 = this.e;
        if (object4 != null) {
            float f6;
            float f7;
            Float f8 = ((Bo1)object).h;
            float f11 = f8.floatValue();
            Object object5 = object2;
            float f12 = ((Bo1)object).g;
            object5 = (Integer)object2;
            Integer n10 = n7;
            if ((object4 = (Integer)((LC1)object4).b(f12, f11, object5, n10, f5, f7 = this.e(), f6 = this.d)) != null) {
                n3 = (Integer)object4;
                return n3;
            }
        }
        if ((n4 = ((Bo1)object).k) == n8) {
            int n14;
            object2 = (Integer)object2;
            ((Bo1)object).k = n14 = ((Integer)object2).intValue();
        }
        n3 = ((Bo1)object).k;
        object2 = mp1_0.a;
        float f14 = n3;
        float f15 = n7 -= n3;
        f5 = f5 * f15 + f14;
        n3 = (int)f5;
        return n3;
    }
}

