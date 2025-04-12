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

public abstract class Slide$i
implements Slide$g {
    public final float b(ViewGroup viewGroup, View view) {
        return view.getTranslationX();
    }
}

