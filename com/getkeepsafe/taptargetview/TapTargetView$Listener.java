/*
 * Decompiled with CFR 0.152.
 */
package com.getkeepsafe.taptargetview;

import com.getkeepsafe.taptargetview.TapTargetView;

public class TapTargetView$Listener {
    public void onOuterCircleClick(TapTargetView tapTargetView) {
    }

    public void onTargetCancel(TapTargetView tapTargetView) {
        tapTargetView.dismiss(false);
    }

    public void onTargetClick(TapTargetView tapTargetView) {
        tapTargetView.dismiss(true);
    }

    public void onTargetDismissed(TapTargetView tapTargetView, boolean bl2) {
    }

    public void onTargetLongClick(TapTargetView tapTargetView) {
        this.onTargetClick(tapTargetView);
    }
}

