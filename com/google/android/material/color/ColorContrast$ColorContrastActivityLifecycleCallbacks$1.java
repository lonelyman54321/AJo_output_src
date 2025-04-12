/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.UiModeManager$ContrastChangeListener
 */
package com.google.android.material.color;

import android.app.Activity;
import android.app.UiModeManager;
import com.google.android.material.color.ColorContrast$ColorContrastActivityLifecycleCallbacks;
import java.util.Iterator;

class ColorContrast$ColorContrastActivityLifecycleCallbacks$1
implements UiModeManager.ContrastChangeListener {
    final /* synthetic */ ColorContrast$ColorContrastActivityLifecycleCallbacks this$0;

    public ColorContrast$ColorContrastActivityLifecycleCallbacks$1(ColorContrast$ColorContrastActivityLifecycleCallbacks colorContrastActivityLifecycleCallbacks) {
        this.this$0 = colorContrastActivityLifecycleCallbacks;
    }

    public void onContrastChanged(float f5) {
        boolean bl2;
        Iterator iterator = ColorContrast$ColorContrastActivityLifecycleCallbacks.access$000(this.this$0).iterator();
        while (bl2 = iterator.hasNext()) {
            Activity activity = (Activity)iterator.next();
            activity.recreate();
        }
    }
}

