/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class CsiParamDefaults_Factory
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public CsiParamDefaults_Factory(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public static CsiParamDefaults_Factory create(zzhlg zzhlg2, zzhlg zzhlg3) {
        CsiParamDefaults_Factory csiParamDefaults_Factory = new CsiParamDefaults_Factory(zzhlg2, zzhlg3);
        return csiParamDefaults_Factory;
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel) {
        CsiParamDefaults csiParamDefaults = new CsiParamDefaults(context, versionInfoParcel);
        return csiParamDefaults;
    }

    public CsiParamDefaults get() {
        Context context = (Context)this.zza.zzb();
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel)this.zzb.zzb();
        return CsiParamDefaults_Factory.newInstance(context, versionInfoParcel);
    }
}

