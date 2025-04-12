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

public final class ChangeBounds$c
extends Property {
    public final void set(Object object, Object object2) {
        object = (View)object;
        object2 = (PointF)object2;
        int n3 = object.getLeft();
        int n4 = object.getTop();
        int n7 = Math.round(((PointF)object2).x);
        int n8 = Math.round(((PointF)object2).y);
        ee3_0.a((View)object, n3, n4, n7, n8);
    }
}

