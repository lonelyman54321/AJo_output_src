/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;

public final class Oe0 {
    public final PointF a;
    public final PointF b;
    public final PointF c;

    public Oe0() {
        PointF pointF;
        this.a = pointF = new PointF();
        this.b = pointF = new PointF();
        this.c = pointF = new PointF();
    }

    public Oe0(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }

    public final String toString() {
        Object object = this.c;
        Float f5 = Float.valueOf(object.x);
        object = Float.valueOf(object.y);
        Object object2 = this.a;
        Float f6 = Float.valueOf(object2.x);
        object2 = Float.valueOf(object2.y);
        Object object3 = this.b;
        Float f7 = Float.valueOf(object3.x);
        object3 = Float.valueOf(object3.y);
        Object[] objectArray = new Object[]{f5, object, f6, object2, f7, object3};
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", objectArray);
    }
}

