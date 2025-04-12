/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 */
import android.animation.TypeEvaluator;

/*
 * Renamed from aS0
 */
public final class as0_1
implements TypeEvaluator {
    public float[] a;

    public final Object evaluate(float f5, Object object, Object object2) {
        int n3;
        object = (float[])object;
        object2 = (float[])object2;
        float[] fArray = this.a;
        if (fArray == null) {
            int n4 = ((Object)object).length;
            fArray = new float[n4];
        }
        for (int i3 = 0; i3 < (n3 = fArray.length); ++i3) {
            Object object3 = object[i3];
            Object object4 = object2[i3];
            object3 = xu0_1.a((float)object4, (float)object3, f5, (float)object3);
            fArray[i3] = (float)object3;
        }
        return fArray;
    }
}

