/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.login.activity;

import com.ril.ajio.login.activity.ResetPasswordActivity;
import com.ril.ajio.view.BaseSplitActivity;

public abstract class Hilt_ResetPasswordActivity
extends BaseSplitActivity {
    public boolean X = false;

    public Hilt_ResetPasswordActivity() {
        j61_0 j61_02 = new j61_0(this);
        this.addOnContextAvailableListener(j61_02);
    }

    public final void inject() {
        boolean bl2 = this.X;
        if (!bl2) {
            this.X = bl2 = true;
            rk2_2 rk2_22 = (rk2_2)this.generatedComponent();
            ResetPasswordActivity cfr_ignored_0 = (ResetPasswordActivity)this;
            rk2_22.getClass();
        }
    }
}

