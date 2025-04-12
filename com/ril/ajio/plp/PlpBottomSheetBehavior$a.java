/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.plp;

import com.ril.ajio.plp.PlpBottomSheetBehavior;
import com.ril.ajio.plp.PlpViewDragHelper$b;

public final class PlpBottomSheetBehavior$a
extends PlpViewDragHelper$b {
    public final /* synthetic */ PlpBottomSheetBehavior a;

    public PlpBottomSheetBehavior$a(PlpBottomSheetBehavior plpBottomSheetBehavior) {
        this.a = plpBottomSheetBehavior;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a() {
        int n3;
        PlpBottomSheetBehavior plpBottomSheetBehavior = this.a;
        int n4 = plpBottomSheetBehavior.g;
        if (n4 != 0) {
            n4 = plpBottomSheetBehavior.n;
            n3 = plpBottomSheetBehavior.e;
            return n4 - n3;
        }
        n4 = plpBottomSheetBehavior.f;
        n3 = plpBottomSheetBehavior.e;
        return n4 - n3;
    }
}

