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

public final class Slide$b
extends Slide$h {
    public final float b(ViewGroup viewGroup, View view) {
        float f5;
        int n3;
        int n4 = viewGroup.getLayoutDirection();
        if (n4 == (n3 = 1)) {
            f5 = view.getTranslationX();
            int n7 = viewGroup.getWidth();
            float f6 = n7;
            f5 += f6;
        } else {
            f5 = view.getTranslationX();
            int n8 = viewGroup.getWidth();
            float f7 = n8;
            f5 -= f7;
        }
        return f5;
    }
}

