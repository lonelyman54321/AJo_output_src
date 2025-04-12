/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Network
 */
package com.google.android.gms.internal.ads;

import android.net.Network;
import com.google.android.gms.internal.ads.zzfup;
import com.google.android.gms.internal.ads.zzfuq;
import java.net.URL;
import java.net.URLConnection;

public final class zzfum
implements zzfup {
    public final /* synthetic */ Network zza;
    public final /* synthetic */ URL zzb;

    public /* synthetic */ zzfum(Network network, URL uRL) {
        this.zza = network;
        this.zzb = uRL;
    }

    public final URLConnection zza() {
        Network network = this.zza;
        URL uRL = this.zzb;
        return zzfuq.zzq(network, uRL);
    }
}

