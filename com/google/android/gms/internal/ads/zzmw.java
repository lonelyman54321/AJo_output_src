/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.wifi.WifiManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.wifi.WifiManager;

final class zzmw {
    private final WifiManager zza;

    public zzmw(Context context) {
        context = (WifiManager)context.getApplicationContext().getSystemService("wifi");
        this.zza = context;
    }
}

