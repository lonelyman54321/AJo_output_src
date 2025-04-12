/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.view;

import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.view.BaseSplitActivity;

public abstract class Hilt_BaseActivity
extends BaseSplitActivity {
    public boolean X = false;

    public Hilt_BaseActivity() {
        d51_0 d51_02 = new d51_0(this);
        this.addOnContextAvailableListener(d51_02);
    }

    public void inject() {
        boolean bl2 = this.X;
        if (!bl2) {
            this.X = bl2 = true;
            sv_2 sv_22 = (sv_2)this.generatedComponent();
            BaseActivity cfr_ignored_0 = (BaseActivity)this;
            sv_22.getClass();
        }
    }
}

