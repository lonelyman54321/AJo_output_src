/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import com.google.android.material.timepicker.RadialViewGroup;

public final class b
implements Runnable {
    public final /* synthetic */ RadialViewGroup a;

    public /* synthetic */ b(RadialViewGroup radialViewGroup) {
        this.a = radialViewGroup;
    }

    public final void run() {
        this.a.updateLayoutParams();
    }
}

