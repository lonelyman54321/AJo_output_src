/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.home;

import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.view.BaseActivity;

public abstract class Hilt_AjioHomeActivity
extends BaseActivity {
    public boolean L0 = false;

    public Hilt_AjioHomeActivity() {
        y41_0 y41_02 = new y41_0(this);
        this.addOnContextAvailableListener(y41_02);
    }

    public final void inject() {
        boolean bl2 = this.L0;
        if (!bl2) {
            this.L0 = bl2 = true;
            a8 a83 = (a8)this.generatedComponent();
            AjioHomeActivity cfr_ignored_0 = (AjioHomeActivity)this;
            a83.getClass();
        }
    }
}

