/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.PowerManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

final class zzmv {
    private final PowerManager zza;

    public zzmv(Context context) {
        context = (PowerManager)context.getApplicationContext().getSystemService("power");
        this.zza = context;
    }
}

