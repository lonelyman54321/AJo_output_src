/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.sidesheet;

import com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker;

public final class b
implements Runnable {
    public final /* synthetic */ SideSheetBehavior$StateSettlingTracker a;

    public /* synthetic */ b(SideSheetBehavior$StateSettlingTracker sideSheetBehavior$StateSettlingTracker) {
        this.a = sideSheetBehavior$StateSettlingTracker;
    }

    public final void run() {
        SideSheetBehavior$StateSettlingTracker.a(this.a);
    }
}

