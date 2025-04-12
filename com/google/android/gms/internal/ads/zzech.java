/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyv;
import java.util.List;

public final class zzech
implements zzfxu {
    public final /* synthetic */ zzbxu zza;

    public /* synthetic */ zzech(zzbxu zzbxu2) {
        this.zza = zzbxu2;
    }

    public final Object apply(Object object) {
        object = this.zza;
        Bundle bundle = ((zzbxu)object).zza;
        String string2 = zzfyv.zzc(bundle.getString("ms"));
        ApplicationInfo applicationInfo = ((zzbxu)object).zzc;
        String string3 = ((zzbxu)object).zzh;
        String string4 = ((zzbxu)object).zzd;
        List list = ((zzbxu)object).zze;
        PackageInfo packageInfo = ((zzbxu)object).zzf;
        boolean bl2 = ((zzbxu)object).zzk;
        boolean bl3 = ((zzbxu)object).zzl;
        zzbwv zzbwv2 = new zzbwv(applicationInfo, string4, packageInfo, string2, -1, string3, list, bl2, bl3);
        return zzbwv2;
    }
}

