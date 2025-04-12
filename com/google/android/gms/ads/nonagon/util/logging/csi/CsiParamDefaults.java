/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfyv;
import java.util.Map;

public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(Context object, VersionInfoParcel versionInfoParcel) {
        this.zza = object;
        object = object.getPackageName();
        this.zzb = object;
        object = versionInfoParcel.afmaVersion;
        this.zzc = object;
    }

    public void set(Map map2) {
        map2.put("s", "gmob_sdk");
        map2.put("v", "3");
        Object object = Build.VERSION.RELEASE;
        map2.put("os", object);
        object = Build.VERSION.SDK;
        map2.put("api_v", object);
        zzu.zzp();
        object = zzt.zzr();
        map2.put("device", object);
        object = this.zzb;
        map2.put("app", object);
        zzu.zzp();
        Object object2 = this.zza;
        boolean bl2 = zzt.zzE((Context)object2);
        object = "1";
        String string2 = "0";
        boolean bl3 = true;
        object2 = bl3 != bl2 ? string2 : object;
        map2.put("is_lite_sdk", object2);
        object2 = zzbep.zza;
        object2 = zzba.zza().zzb();
        Object object3 = zzbep.zzhd;
        zzben zzben2 = zzba.zzc();
        object3 = (Boolean)zzben2.zza((zzbeg)object3);
        boolean bl4 = (Boolean)object3;
        if (bl4) {
            object3 = zzu.zzo().zzi().zzh().zzd();
            object2.addAll(object3);
        }
        object2 = TextUtils.join((CharSequence)",", (Iterable)object2);
        map2.put("e", object2);
        object2 = this.zzc;
        map2.put("sdkVersion", object2);
        object2 = zzbep.zzlp;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        bl2 = (Boolean)object2;
        if (bl2) {
            zzu.zzp();
            object2 = this.zza;
            bl2 = zzt.zzB((Context)object2);
            if (bl3 != bl2) {
                object = string2;
            }
            object2 = "is_bstar";
            map2.put(object2, object);
        }
        object2 = zzbep.zzju;
        object = zzba.zzc();
        object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
        bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzbep.zzck;
            object = zzba.zzc();
            object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                object2 = zzfyv.zzc(zzu.zzo().zzn());
                object = "plugin";
                map2.put(object, object2);
            }
        }
    }
}

