/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity;
import com.ril.ajio.view.BaseSplitActivity;

public abstract class Hilt_ExchangeReturnTabActivity
extends BaseSplitActivity {
    public boolean X = false;

    public Hilt_ExchangeReturnTabActivity() {
        w51_0 w51_02 = new w51_0(this);
        this.addOnContextAvailableListener(w51_02);
    }

    public final void inject() {
        boolean bl2 = this.X;
        if (!bl2) {
            this.X = bl2 = true;
            od0_0 od0_02 = (od0_0)this.generatedComponent();
            ExchangeReturnTabActivity cfr_ignored_0 = (ExchangeReturnTabActivity)this;
            od0_02.getClass();
        }
    }
}

