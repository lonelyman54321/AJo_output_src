/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbxz;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzfyv;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzbes {
    private final String zza;
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbes(Context object, String object2) {
        int n3;
        this.zzc = object;
        this.zzd = object2;
        object2 = (String)zzbge.zzb.zze();
        this.zza = object2;
        object2 = new LinkedHashMap();
        this.zzb = object2;
        object2.put("s", "gmob_sdk");
        object2.put("v", "3");
        String string2 = Build.VERSION.RELEASE;
        object2.put("os", string2);
        string2 = Build.VERSION.SDK;
        object2.put("api_v", string2);
        zzu.zzp();
        string2 = zzt.zzr();
        object2.put("device", string2);
        Object object3 = object.getApplicationContext();
        object3 = object3 != null ? object.getApplicationContext().getPackageName() : object.getPackageName();
        object2.put("app", object3);
        zzu.zzp();
        int n4 = zzt.zzE((Context)object);
        string2 = "1";
        String string3 = "0";
        int n7 = 1;
        object3 = n7 != n4 ? string3 : string2;
        object2.put("is_lite_sdk", object3);
        object3 = zzu.zzm().zzb((Context)object);
        Object object4 = "network_coarse";
        Object object5 = object3.get();
        object5 = (zzbxz)object5;
        int n8 = ((zzbxz)object5).zzk;
        object5 = Integer.toString(n8);
        object2.put(object4, object5);
        object4 = "network_fine";
        object3 = object3.get();
        object3 = (zzbxz)object3;
        n4 = object3.zzl;
        object3 = Integer.toString(n4);
        try {
            object2.put(object4, object3);
        }
        catch (Exception exception) {
            object3 = "CsiConfiguration.CsiConfiguration";
            object4 = zzu.zzo();
            ((zzcby)object4).zzw(exception, (String)object3);
        }
        object2 = zzbep.zzlp;
        object3 = zzba.zzc();
        object2 = (Boolean)object3.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = this.zzb;
            zzu.zzp();
            n3 = zzt.zzB((Context)object);
            if (n7 != n3) {
                string2 = string3;
            }
            object = "is_bstar";
            object2.put(object, string2);
        }
        object = zzbep.zzju;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        if (n3 != 0) {
            object = zzbep.zzck;
            object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(zzfyv.zzd((String)(object = zzu.zzo().zzn())) ? 1 : 0)) == 0) {
                object = this.zzb;
                object2 = zzu.zzo().zzn();
                object3 = "plugin";
                object.put(object3, object2);
            }
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}

