/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Slide$i;

public final class Slide$f
extends Slide$i {
    public final float a(ViewGroup viewGroup, View view) {
        float f5 = view.getTranslationY();
        float f6 = viewGroup.getHeight();
        return f5 + f6;
    }
}

