/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from aT2
 */
public final class at2_0
extends co1_1 {
    public final bT2 i;

    public at2_0(List object) {
        super((List)object);
        this.i = object = new bT2();
    }

    public final Object g(Bo1 object, float f5) {
        Object object2;
        Object object3 = ((Bo1)object).b;
        if (object3 != null && (object2 = ((Bo1)object).c) != null) {
            float f6;
            float f7;
            Float f8;
            float f11;
            float f12;
            object3 = (bT2)object3;
            object2 = (bT2)object2;
            LC1 lC1 = this.e;
            if (lC1 == null || (object = (bT2)lC1.b(f12 = ((Bo1)object).g, f11 = (f8 = ((Bo1)object).h).floatValue(), object3, object2, f5, f7 = this.e(), f6 = this.d)) == null) {
                float f14 = ((bT2)object3).a;
                float f15 = ((bT2)object2).a;
                f14 = mp1_0.f(f14, f15, f5);
                float f16 = ((bT2)object3).b;
                float f17 = ((bT2)object2).b;
                f5 = mp1_0.f(f16, f17, f5);
                object3 = this.i;
                ((bT2)object3).a = f14;
                ((bT2)object3).b = f5;
                object = object3;
            }
            return object;
        }
        object = new IllegalStateException("Missing values for keyframe.");
        throw object;
    }
}

