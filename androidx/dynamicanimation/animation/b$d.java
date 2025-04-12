/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.dynamicanimation.animation.b$s;

public final class b$d
extends b$s {
    public final float getValue(Object object) {
        return ((View)object).getScrollX();
    }

    public final void setValue(Object object, float f5) {
        object = (View)object;
        int n3 = (int)f5;
        object.setScrollX(n3);
    }
}

