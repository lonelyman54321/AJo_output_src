/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 *  android.graphics.Rect
 */
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/*
 * Renamed from bG2
 */
public final class bg2_0
implements TypeEvaluator {
    public Rect a;

    public final Object evaluate(float f5, Object object, Object object2) {
        object = (Rect)object;
        object2 = (Rect)object2;
        int n3 = ((Rect)object).left;
        float f6 = (float)(((Rect)object2).left - n3) * f5;
        int n4 = (int)f6;
        n3 += n4;
        n4 = ((Rect)object).top;
        float f7 = (float)(((Rect)object2).top - n4) * f5;
        int n7 = (int)f7;
        n4 += n7;
        n7 = ((Rect)object).right;
        float f8 = (float)(((Rect)object2).right - n7) * f5;
        int n8 = (int)f8;
        n7 += n8;
        int n10 = ((Rect)object).bottom;
        int n14 = ((Rect)object2).bottom - n10;
        float f11 = (float)n14 * f5;
        int n15 = (int)f11;
        n10 += n15;
        Rect rect = this.a;
        if (rect == null) {
            rect = new Rect(n3, n4, n7, n10);
        } else {
            rect.set(n3, n4, n7, n10);
        }
        return rect;
    }
}

