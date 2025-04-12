/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.Property
 *  android.view.View
 */
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

public final class eE3$b
extends Property {
    public final Object get(Object object) {
        return ((View)object).getClipBounds();
    }

    public final void set(Object object, Object object2) {
        object = (View)object;
        object2 = (Rect)object2;
        object.setClipBounds((Rect)object2);
    }
}

