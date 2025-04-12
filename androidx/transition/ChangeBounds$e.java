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

public final class ChangeBounds$e
extends Property {
    public final void set(Object object, Object object2) {
        object = (View)object;
        object2 = (PointF)object2;
        int n3 = Math.round(((PointF)object2).x);
        int n4 = Math.round(((PointF)object2).y);
        int n7 = object.getWidth() + n3;
        int n8 = object.getHeight() + n4;
        ee3_0.a((View)object, n3, n4, n7, n8);
    }
}

