/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.dynamicanimation.animation.b$s;

public final class b$l
extends b$s {
    public final float getValue(Object object) {
        return ((View)object).getRotation();
    }

    public final void setValue(Object object, float f5) {
        ((View)object).setRotation(f5);
    }
}

