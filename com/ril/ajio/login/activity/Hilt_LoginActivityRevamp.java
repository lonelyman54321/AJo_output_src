/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.login.activity;

import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.login.activity.LoginBaseActivity;

public abstract class Hilt_LoginActivityRevamp
extends LoginBaseActivity {
    public boolean p0 = false;

    public Hilt_LoginActivityRevamp() {
        F51 f51 = new F51(this);
        this.addOnContextAvailableListener(f51);
    }

    public final void inject() {
        boolean bl2 = this.p0;
        if (!bl2) {
            this.p0 = bl2 = true;
            ty1_0 ty1_02 = (ty1_0)this.generatedComponent();
            LoginActivityRevamp cfr_ignored_0 = (LoginActivityRevamp)this;
            ty1_02.getClass();
        }
    }
}

