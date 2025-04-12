/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.Property
 */
package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import androidx.transition.ChangeTransform$e;

public final class ChangeTransform$b
extends Property {
    public final void set(Object object, Object object2) {
        float f5;
        float f6;
        object = (ChangeTransform$e)object;
        object2 = (PointF)object2;
        object.getClass();
        ((ChangeTransform$e)object).d = f6 = ((PointF)object2).x;
        ((ChangeTransform$e)object).e = f5 = ((PointF)object2).y;
        ((ChangeTransform$e)object).a();
    }
}

