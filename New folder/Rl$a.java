/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 */
import android.animation.TypeEvaluator;

public final class Rl$a
implements TypeEvaluator {
    public rn2$a[] a;

    public final Object evaluate(float f5, Object rn2$aArray, Object rn2$aArray2) {
        boolean bl2 = rn2.a(rn2$aArray = (rn2$a[])rn2$aArray, rn2$aArray2 = (rn2$a[])rn2$aArray2);
        if (bl2) {
            int n3;
            rn2$a[] rn2$aArray3 = this.a;
            bl2 = rn2.a(rn2$aArray3, rn2$aArray);
            if (!bl2) {
                rn2$aArray3 = rn2.e(rn2$aArray);
                this.a = rn2$aArray3;
            }
            bl2 = false;
            rn2$aArray3 = null;
            for (int i3 = 0; i3 < (n3 = rn2$aArray.length); ++i3) {
                float[] fArray;
                int n4;
                int n7;
                rn2$a rn2$a = this.a[i3];
                rn2$a rn2$a2 = rn2$aArray[i3];
                rn2$a rn2$a3 = rn2$aArray2[i3];
                rn2$a.getClass();
                rn2$a.a = n7 = rn2$a2.a;
                for (n7 = 0; n7 < (n4 = (fArray = rn2$a2.b).length); ++n7) {
                    float f6 = fArray[n7];
                    n4 = 1065353216;
                    float f7 = (1.0f - f5) * f6;
                    fArray = rn2$a3.b;
                    f6 = fArray[n7] * f5 + f7;
                    float[] fArray2 = rn2$a.b;
                    fArray2[n7] = f6;
                }
            }
            return this.a;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        throw illegalArgumentException;
    }
}

