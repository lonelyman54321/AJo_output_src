/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzexk;
import com.google.android.gms.internal.ads.zzexm;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzexl
implements zzexw {
    private final zzgge zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    public zzexl(zzgge zzgge2, Context context, VersionInfoParcel versionInfoParcel, String string2) {
        this.zza = zzgge2;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = string2;
    }

    public final int zza() {
        return 35;
    }

    public final ListenableFuture zzb() {
        zzexk zzexk2 = new zzexk(this);
        return this.zza.zzb(zzexk2);
    }

    public final /* synthetic */ zzexm zzc() {
        zzexm zzexm2;
        int n3;
        boolean bl2 = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        zzu.zzp();
        boolean bl3 = zzt.zzE(this.zzb);
        String string2 = this.zzc.afmaVersion;
        zzu.zzp();
        boolean bl4 = zzt.zzF();
        zzu.zzp();
        Object object = this.zzb.getApplicationInfo();
        if (object == null) {
            boolean bl5 = false;
            object = null;
            n3 = 0;
        } else {
            int n4;
            n3 = n4 = object.targetSdkVersion;
        }
        object = this.zzb;
        String string3 = this.zzd;
        String string4 = "com.google.android.gms.ads.dynamite";
        int n7 = DynamiteModule.getRemoteVersion((Context)object, string4);
        int n8 = DynamiteModule.getLocalVersion((Context)object, string4);
        object = zzexm2;
        int n10 = n7;
        n7 = n8;
        zzexm2 = new zzexm(bl2, bl3, string2, bl4, n3, n10, n8, string3);
        return zzexm2;
    }
}

