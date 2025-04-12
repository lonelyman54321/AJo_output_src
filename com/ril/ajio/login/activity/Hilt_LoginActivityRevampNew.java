/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.login.activity;

import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.login.activity.LoginBaseActivity;

public abstract class Hilt_LoginActivityRevampNew
extends LoginBaseActivity {
    public boolean p0 = false;

    public Hilt_LoginActivityRevampNew() {
        G51 g51 = new G51(this);
        this.addOnContextAvailableListener(g51);
    }

    public final void inject() {
        boolean bl2 = this.p0;
        if (!bl2) {
            this.p0 = bl2 = true;
            sy1_0 sy1_02 = (sy1_0)this.generatedComponent();
            LoginActivityRevampNew cfr_ignored_0 = (LoginActivityRevampNew)this;
            sy1_02.getClass();
        }
    }
}

