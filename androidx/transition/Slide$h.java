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
import androidx.transition.Slide$g;

public abstract class Slide$h
implements Slide$g {
    public final float a(ViewGroup viewGroup, View view) {
        return view.getTranslationY();
    }
}

