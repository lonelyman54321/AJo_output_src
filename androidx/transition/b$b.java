/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
package androidx.transition;

import android.graphics.Rect;
import androidx.transition.Transition$f;

public final class b$b
extends Transition$f {
    public final /* synthetic */ Rect a;

    public b$b(Rect rect) {
        this.a = rect;
    }

    public final Rect a() {
        boolean bl2;
        Rect rect = this.a;
        if (rect != null && !(bl2 = rect.isEmpty())) {
            return rect;
        }
        return null;
    }
}

