/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.dynamicanimation.animation.b$s;

public final class b$a
extends b$s {
    public final float getValue(Object object) {
        return ((View)object).getY();
    }

    public final void setValue(Object object, float f5) {
        ((View)object).setY(f5);
    }
}

