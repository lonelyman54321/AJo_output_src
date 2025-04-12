/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.Property
 *  android.view.View
 */
package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import androidx.transition.ChangeBounds$i;

public final class ChangeBounds$a
extends Property {
    public final void set(Object object, Object object2) {
        int n3;
        int n4;
        object = (ChangeBounds$i)object;
        object2 = (PointF)object2;
        object.getClass();
        float f5 = ((PointF)object2).x;
        ((ChangeBounds$i)object).a = n4 = Math.round(f5);
        float f6 = ((PointF)object2).y;
        ((ChangeBounds$i)object).b = n3 = Math.round(f6);
        ((ChangeBounds$i)object).f = n4 = ((ChangeBounds$i)object).f + 1;
        int n7 = ((ChangeBounds$i)object).g;
        if (n4 == n7) {
            n4 = ((ChangeBounds$i)object).a;
            n7 = ((ChangeBounds$i)object).c;
            int n8 = ((ChangeBounds$i)object).d;
            View view = ((ChangeBounds$i)object).e;
            ee3_0.a(view, n4, n3, n7, n8);
            n3 = 0;
            f6 = 0.0f;
            object2 = null;
            ((ChangeBounds$i)object).f = 0;
            ((ChangeBounds$i)object).g = 0;
        }
    }
}

