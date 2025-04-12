/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeConfirmedActivity;
import com.ril.ajio.view.BaseSplitActivity;

public abstract class Hilt_ExchangeConfirmedActivity
extends BaseSplitActivity {
    public boolean X = false;

    public Hilt_ExchangeConfirmedActivity() {
        s51 s512 = new s51(this);
        this.addOnContextAvailableListener(s512);
    }

    public final void inject() {
        boolean bl2 = this.X;
        if (!bl2) {
            this.X = bl2 = true;
            EC0 eC0 = (EC0)this.generatedComponent();
            ExchangeConfirmedActivity cfr_ignored_0 = (ExchangeConfirmedActivity)this;
            eC0.getClass();
        }
    }
}

