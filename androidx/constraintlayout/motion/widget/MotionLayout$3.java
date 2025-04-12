/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.constraintlayout.motion.widget;

import android.view.View;

class MotionLayout$3
implements Runnable {
    public final /* synthetic */ View a;

    public MotionLayout$3(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.setNestedScrollingEnabled(true);
    }
}

