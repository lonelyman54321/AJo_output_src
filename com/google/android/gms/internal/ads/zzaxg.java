/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkCapabilities
 */
package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.internal.ads.zzaxh;

final class zzaxg
extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzaxh zza;

    public zzaxg(zzaxh zzaxh2) {
        this.zza = zzaxh2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCapabilitiesChanged(Network object, NetworkCapabilities networkCapabilities) {
        object = zzaxh.class;
        synchronized (object) {
            zzaxh zzaxh2 = this.zza;
            zzaxh.zzd(zzaxh2, networkCapabilities);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onLost(Network object) {
        object = zzaxh.class;
        synchronized (object) {
            zzaxh zzaxh2 = this.zza;
            zzaxh.zzd(zzaxh2, null);
            return;
        }
    }
}

