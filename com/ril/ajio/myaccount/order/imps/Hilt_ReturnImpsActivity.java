/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.imps;

import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.view.BaseSplitActivity;

public abstract class Hilt_ReturnImpsActivity
extends BaseSplitActivity {
    public boolean X = false;

    public Hilt_ReturnImpsActivity() {
        m61 m612 = new m61(this);
        this.addOnContextAvailableListener(m612);
    }

    public final void inject() {
        boolean bl2 = this.X;
        if (!bl2) {
            this.X = bl2 = true;
            nn2_0 nn2_02 = (nn2_0)this.generatedComponent();
            ReturnImpsActivity cfr_ignored_0 = (ReturnImpsActivity)this;
            nn2_02.getClass();
        }
    }
}

