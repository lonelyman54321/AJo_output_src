/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;

public final class NewProductDetailsFragment$h
extends TapTargetView$Listener {
    public final /* synthetic */ NewProductDetailsFragment a;

    public NewProductDetailsFragment$h(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void onOuterCircleClick(TapTargetView tapTargetView) {
        super.onOuterCircleClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }

    public final void onTargetCancel(TapTargetView tapTargetView) {
        super.onTargetCancel(tapTargetView);
        this.a.cb().d().putPreference("pdp_footer_coachmark_in_revamp", true);
    }

    public final void onTargetClick(TapTargetView tapTargetView) {
        super.onTargetClick(tapTargetView);
        this.a.cb().d().putPreference("pdp_footer_coachmark_in_revamp", true);
    }

    public final void onTargetDismissed(TapTargetView tapTargetView, boolean bl2) {
        super.onTargetDismissed(tapTargetView, bl2);
        this.a.cb().d().putPreference("pdp_footer_coachmark_in_revamp", true);
    }

    public final void onTargetLongClick(TapTargetView tapTargetView) {
        super.onTargetLongClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }
}

