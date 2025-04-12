/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkCapabilities
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.google.android.gms.internal.ads.zzaxg;

public final class zzaxh {
    private NetworkCapabilities zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzaxh(ConnectivityManager object) {
        if (object == null) return;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 < n4) {
            return;
        }
        try {
            zzaxg zzaxg2 = new zzaxg(this);
            MU1.a(object, zzaxg2);
            return;
        }
        catch (RuntimeException runtimeException) {
            object = zzaxh.class;
            synchronized (object) {
                n3 = 0;
                Object var4_5 = null;
                this.zza = null;
                return;
            }
        }
    }

    public static zzaxh zzc(Context context) {
        if (context != null) {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            zzaxh zzaxh2 = new zzaxh((ConnectivityManager)context);
            return zzaxh2;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzaxh zzaxh2, NetworkCapabilities networkCapabilities) {
        zzaxh2.zza = networkCapabilities;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zza() {
        Class<zzaxh> clazz = zzaxh.class;
        synchronized (clazz) {
            Throwable throwable2;
            block7: {
                block6: {
                    boolean bl2;
                    int n3;
                    NetworkCapabilities networkCapabilities;
                    try {
                        networkCapabilities = this.zza;
                        if (networkCapabilities == null) break block6;
                        n3 = 4;
                        bl2 = networkCapabilities.hasTransport(n3);
                        if (bl2) {
                            return 2;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    networkCapabilities = this.zza;
                    n3 = 1;
                    bl2 = networkCapabilities.hasTransport(n3);
                    if (bl2) {
                        return 1L;
                    }
                    networkCapabilities = this.zza;
                    n3 = 0;
                    bl2 = networkCapabilities.hasTransport(0);
                    if (bl2) {
                        return 0L;
                    }
                }
                return -1;
            }
            throw throwable2;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }
}

