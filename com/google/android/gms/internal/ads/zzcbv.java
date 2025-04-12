/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 */
package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import com.google.android.gms.internal.ads.zzcby;

final class zzcbv
extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcby zza;

    public zzcbv(zzcby zzcby2) {
        this.zza = zzcby2;
    }

    public final void onAvailable(Network network) {
        zzcby.zzp(this.zza).set(true);
    }

    public final void onLost(Network network) {
        zzcby.zzp(this.zza).set(false);
    }
}

