/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio;

import com.google.android.play.core.splitcompat.SplitCompatApplication;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.Hilt_AJIOApplication$a;

public abstract class Hilt_AJIOApplication
extends SplitCompatApplication
implements az0_2 {
    public boolean a = false;
    public final gp_2 b;

    public Hilt_AJIOApplication() {
        gp_2 gp_22;
        Hilt_AJIOApplication$a hilt_AJIOApplication$a = new Hilt_AJIOApplication$a(this);
        this.b = gp_22 = new gp_2(hilt_AJIOApplication$a);
    }

    public final Object generatedComponent() {
        return this.b.generatedComponent();
    }

    public void onCreate() {
        boolean bl2 = this.a;
        if (!bl2) {
            this.a = bl2 = true;
            W w4 = (W)this.b.generatedComponent();
            AJIOApplication cfr_ignored_0 = (AJIOApplication)this;
            w4.getClass();
        }
        super.onCreate();
    }
}

