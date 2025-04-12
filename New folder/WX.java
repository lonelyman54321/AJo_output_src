/*
 * Decompiled with CFR 0.152.
 */
public final class WX
extends co1_1 {
    public final Object g(Bo1 bo1, float f5) {
        return this.m(bo1, f5);
    }

    public final int m(Bo1 object, float f5) {
        Object object2 = ((Bo1)object).b;
        if (object2 != null && (object2 = ((Bo1)object).c) != null) {
            Object object3;
            Object object4 = this.e;
            object2 = ((Bo1)object).b;
            if (object4 != null && (object3 = ((Bo1)object).h) != null) {
                float f6;
                float f7 = ((Float)object3).floatValue();
                Object object5 = object2;
                object5 = (Integer)object2;
                Object object6 = object3 = ((Bo1)object).c;
                float f8 = ((Bo1)object).g;
                object6 = (Integer)object3;
                float f11 = this.e();
                if ((object4 = (Integer)((LC1)object4).b(f8, f7, object5, object6, f5, f11, f6 = this.d)) != null) {
                    return (Integer)object4;
                }
            }
            f5 = mp1_0.b(f5, 0.0f, 1.0f);
            int n3 = (Integer)object2;
            int n4 = (Integer)((Bo1)object).c;
            return hh3_1.c(f5, n3, n4);
        }
        object = new IllegalStateException("Missing values for keyframe.");
        throw object;
    }
}

