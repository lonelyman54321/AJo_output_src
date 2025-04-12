/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PathMeasure
 *  android.graphics.PointF
 */
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

public final class on2
extends co1_1 {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public nn2 m;

    public on2(List object) {
        super((List)object);
        super();
        this.i = object;
        int n3 = 2;
        float[] fArray = new float[n3];
        this.j = fArray;
        object = new float[n3];
        this.k = (float[])object;
        object = new PathMeasure();
        this.l = object;
    }

    public final Object g(Bo1 object, float f5) {
        Object object2;
        block10: {
            float f6;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            block9: {
                float f7;
                object6 = object;
                object6 = (nn2)object;
                object5 = ((nn2)object6).q;
                object2 = this.e;
                if (object2 == null || (object4 = ((Bo1)object).h) == null) break block9;
                object3 = ((Bo1)object6).h.floatValue();
                Object object7 = object4 = ((Bo1)object6).b;
                object7 = (PointF)object4;
                Object object8 = object4 = ((Bo1)object6).c;
                f6 = ((Bo1)object6).g;
                object8 = (PointF)object4;
                float f8 = this.e();
                if ((object2 = (PointF)((LC1)object2).b(f6, (float)object3, object7, object8, f8, f5, f7 = this.d)) != null) break block10;
            }
            if (object5 == null) {
                object2 = object = ((Bo1)object).b;
                object2 = (PointF)object;
            } else {
                object = this.m;
                object2 = this.l;
                f6 = 0.0f;
                object4 = null;
                if (object != object6) {
                    object2.setPath(object5, false);
                    this.m = object6;
                }
                Object object9 = object2.getLength();
                object6 = this.j;
                object5 = this.k;
                object2.getPosTan(f5 *= object9, (float[])object6, (float[])object5);
                object2 = this.i;
                object3 = object6[0];
                int n3 = 1;
                reference var15_15 = object6[n3];
                object2.set(object3, (float)var15_15);
                var15_15 = (reference)0.0f;
                object6 = null;
                float f7 = f5 - 0.0f;
                Object object10 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                if (object10 < 0) {
                    object9 = object5[0] * f5;
                    var15_15 = object5[n3] * f5;
                    object2.offset(object9, (float)var15_15);
                } else {
                    object10 = f5 == object9 ? 0 : (f5 > object9 ? 1 : -1);
                    if (object10 > 0) {
                        var15_15 = object5[0];
                        var15_15 *= (f5 -= object9);
                        object9 = object5[n3] * f5;
                        object2.offset((float)var15_15, object9);
                    }
                }
            }
        }
        return object2;
    }
}

