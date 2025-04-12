/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.telephony.TelephonyManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzeyf;
import com.google.android.gms.internal.ads.zzeyg;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeyh
implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzeyh(zzgge zzgge2, Context context) {
        this.zza = zzgge2;
        this.zzb = context;
    }

    public final int zza() {
        return 39;
    }

    public final ListenableFuture zzb() {
        zzeyg zzeyg2 = new zzeyg(this);
        return this.zza.zzb(zzeyg2);
    }

    public final /* synthetic */ zzeyf zzc() {
        zzeyf zzeyf2;
        int n3;
        boolean bl2;
        int n4;
        TelephonyManager telephonyManager = (TelephonyManager)this.zzb.getSystemService("phone");
        String string2 = telephonyManager.getNetworkOperator();
        int n7 = telephonyManager.getPhoneType();
        zzu.zzp();
        telephonyManager = this.zzb;
        Object object = "android.permission.ACCESS_NETWORK_STATE";
        boolean bl3 = zzt.zzA((Context)telephonyManager, (String)object);
        int n8 = -1;
        if (bl3) {
            telephonyManager = (ConnectivityManager)this.zzb.getSystemService("connectivity");
            NetworkInfo networkInfo = telephonyManager.getActiveNetworkInfo();
            if (networkInfo != null) {
                n8 = networkInfo.getType();
                networkInfo = networkInfo.getDetailedState();
                int n10 = networkInfo.ordinal();
                n4 = n8;
                n8 = n10;
            } else {
                n4 = -1;
            }
            bl2 = bl3 = telephonyManager.isActiveNetworkMetered();
            n3 = n8;
        } else {
            bl3 = false;
            telephonyManager = null;
            n4 = -2;
            bl2 = false;
            n3 = -1;
        }
        telephonyManager = this.zzb;
        int n14 = zzu.zzq().zzm((Context)telephonyManager);
        object = zzeyf2;
        zzeyf2 = new zzeyf(string2, n4, n14, n7, bl2, n3);
        return zzeyf2;
    }
}

