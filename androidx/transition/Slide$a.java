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
import androidx.transition.Slide$h;

public final class Slide$a
extends Slide$h {
    public final float b(ViewGroup viewGroup, View view) {
        float f5 = view.getTranslationX();
        float f6 = viewGroup.getWidth();
        return f5 - f6;
    }
}

