/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;
import java.util.List;

/*
 * Renamed from Lv2
 */
public final class lv2_1
extends co1_1 {
    public final PointF i;

    public lv2_1(List list) {
        super(list);
        super();
        this.i = list;
    }

    public final Object g(Bo1 bo1, float f5) {
        return this.m(bo1, f5, f5, f5);
    }

    public final PointF m(Bo1 object, float f5, float f6, float f7) {
        Object object2;
        Object object3 = ((Bo1)object).b;
        if (object3 != null && (object2 = ((Bo1)object).c) != null) {
            float f8;
            float f11;
            Float f12;
            float f14;
            float f15;
            object3 = (PointF)object3;
            object2 = (PointF)object2;
            LC1 lC1 = this.e;
            if (lC1 != null && (object = (PointF)lC1.b(f15 = ((Bo1)object).g, f14 = (f12 = ((Bo1)object).h).floatValue(), object3, object2, f5, f11 = this.e(), f8 = this.d)) != null) {
                return object;
            }
            object = this.i;
            f5 = ((PointF)object3).x;
            f5 = xu0_1.a(((PointF)object2).x, f5, f6, f5);
            f6 = ((PointF)object3).y;
            f6 = xu0_1.a(((PointF)object2).y, f6, f7, f6);
            object.set(f5, f6);
            return object;
        }
        object = new IllegalStateException("Missing values for keyframe.");
        throw object;
    }
}

