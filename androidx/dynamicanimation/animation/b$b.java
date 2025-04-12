/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.core.view.ViewCompat$c;
import androidx.dynamicanimation.animation.b$s;

public final class b$b
extends b$s {
    public final float getValue(Object object) {
        object = (View)object;
        return ViewCompat$c.i((View)object);
    }

    public final void setValue(Object object, float f5) {
        object = (View)object;
        ViewCompat$c.r((View)object, f5);
    }
}

