/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio;

import android.content.Context;
import com.ril.ajio.Hilt_AJIOApplication;
import com.ril.ajio.jiobannerads.di.NetworkModule;

public final class Hilt_AJIOApplication$a
implements s10_0 {
    public final /* synthetic */ Hilt_AJIOApplication a;

    public Hilt_AJIOApplication$a(Hilt_AJIOApplication hilt_AJIOApplication) {
        this.a = hilt_AJIOApplication;
    }

    public final Wh0 a() {
        Wh0 wh0;
        Object object = this.a;
        hp_1 hp_12 = new hp_1((Context)object);
        zv0_1 zv0_12 = new Object();
        yq0_1 yq0_12 = new Object();
        NetworkModule networkModule = new NetworkModule();
        dl_2 dl_22 = new dl_2(2);
        vx2_1 vx2_12 = new Object();
        yQ2 yQ22 = new Object();
        HV2 hV2 = new Object();
        object = wh0;
        wh0 = new Wh0(hp_12, zv0_12, yq0_12, networkModule, dl_22, vx2_12, yQ22, hV2);
        return wh0;
    }
}

