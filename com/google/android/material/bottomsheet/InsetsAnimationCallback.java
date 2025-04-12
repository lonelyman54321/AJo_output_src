/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$a;
import androidx.core.view.WindowInsetsAnimationCompat$b;
import androidx.core.view.WindowInsetsAnimationCompat$d;
import androidx.core.view.f;
import com.google.android.material.animation.AnimationUtils;
import java.util.List;

class InsetsAnimationCallback
extends WindowInsetsAnimationCompat$b {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation;
    private final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        int[] nArray = new int[2];
        this.tmpLocation = nArray;
        this.view = view;
    }

    public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.view.setTranslationY(0.0f);
    }

    public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        int n3;
        windowInsetsAnimationCompat = this.view;
        int[] nArray = this.tmpLocation;
        windowInsetsAnimationCompat.getLocationOnScreen(nArray);
        this.startY = n3 = this.tmpLocation[1];
    }

    public f onProgress(f f5, List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat)object.next();
            WindowInsetsAnimationCompat$d windowInsetsAnimationCompat$d = windowInsetsAnimationCompat.a;
            int n3 = windowInsetsAnimationCompat$d.d() & 8;
            if (n3 == 0) continue;
            int n4 = this.startTranslationY;
            float f6 = windowInsetsAnimationCompat.a.c();
            n3 = 0;
            windowInsetsAnimationCompat$d = null;
            n4 = AnimationUtils.lerp(n4, 0, f6);
            float f7 = n4;
            windowInsetsAnimationCompat = this.view;
            windowInsetsAnimationCompat.setTranslationY(f7);
            break;
        }
        return f5;
    }

    public WindowInsetsAnimationCompat$a onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat$a windowInsetsAnimationCompat$a) {
        int n3;
        windowInsetsAnimationCompat = this.view;
        int[] nArray = this.tmpLocation;
        windowInsetsAnimationCompat.getLocationOnScreen(nArray);
        int n4 = this.tmpLocation[1];
        this.startTranslationY = n3 = this.startY - n4;
        windowInsetsAnimationCompat = this.view;
        float f5 = n3;
        windowInsetsAnimationCompat.setTranslationY(f5);
        return windowInsetsAnimationCompat$a;
    }
}

