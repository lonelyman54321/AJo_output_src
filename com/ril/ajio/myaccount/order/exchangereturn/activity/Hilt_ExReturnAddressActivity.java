/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.view.BaseSplitActivity;

public abstract class Hilt_ExReturnAddressActivity
extends BaseSplitActivity {
    public boolean X = false;

    public Hilt_ExReturnAddressActivity() {
        o51 o512 = new o51(this);
        this.addOnContextAvailableListener(o512);
    }

    public final void inject() {
        boolean bl2 = this.X;
        if (!bl2) {
            this.X = bl2 = true;
            wb0_0 wb0_02 = (wb0_0)this.generatedComponent();
            ExReturnAddressActivity cfr_ignored_0 = (ExReturnAddressActivity)this;
            wb0_02.getClass();
        }
    }
}

