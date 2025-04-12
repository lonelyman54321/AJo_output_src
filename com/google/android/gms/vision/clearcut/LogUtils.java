/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.vision.zzfi$zza;
import com.google.android.gms.internal.vision.zzfi$zza$zza;
import com.google.android.gms.internal.vision.zzfi$zzf;
import com.google.android.gms.internal.vision.zzfi$zzf$zzb;
import com.google.android.gms.internal.vision.zzfi$zzi;
import com.google.android.gms.internal.vision.zzfi$zzi$zza;
import com.google.android.gms.internal.vision.zzfi$zzj;
import com.google.android.gms.internal.vision.zzfi$zzj$zzb;
import com.google.android.gms.internal.vision.zzfi$zzo;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zzb;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.L;
import java.util.ArrayList;
import java.util.List;

public class LogUtils {
    public static zzfi$zza zza(Context object) {
        zzfi$zza$zza zzfi$zza$zza = zzfi$zza.zza();
        String string2 = object.getPackageName();
        zzfi$zza$zza = zzfi$zza$zza.zza(string2);
        if ((object = LogUtils.zzb(object)) != null) {
            zzfi$zza$zza.zzb((String)object);
        }
        return (zzfi$zza)((zzjb)zzfi$zza$zza.zzf());
    }

    public static zzfi$zzo zza(long l2, int n3, String object, String string2, List list, zzs zzs2) {
        object = zzfi$zzi.zza();
        zzkm zzkm2 = zzfi$zzf.zza().zza(string2).zza(l2);
        long l3 = n3;
        zzkm2 = ((zzfi$zzf$zzb)zzkm2).zzb(l3);
        ((zzfi$zzf$zzb)zzkm2).zza(list);
        Object object2 = new ArrayList();
        zzkm2 = (zzfi$zzf)((zzjb)((zzjb$zzb)zzkm2).zzf());
        ((ArrayList)object2).add(zzkm2);
        zzkm2 = ((zzfi$zzi$zza)object).zza((Iterable)object2);
        object2 = zzfi$zzj.zza();
        long l4 = zzs2.zzb;
        object2 = ((zzfi$zzj$zzb)object2).zzb(l4);
        l4 = zzs2.zza;
        object2 = ((zzfi$zzj$zzb)object2).zza(l4);
        l4 = zzs2.zzc;
        object2 = ((zzfi$zzj$zzb)object2).zzc(l4);
        l4 = zzs2.zzd;
        object2 = (zzfi$zzj)((zzjb)((zzfi$zzj$zzb)object2).zzd(l4).zzf());
        zzkm2 = (zzfi$zzi)((zzjb)((zzfi$zzi$zza)zzkm2).zza((zzfi$zzj)object2).zzf());
        return (zzfi$zzo)((zzjb)zzfi$zzo.zza().zza((zzfi$zzi)zzkm2).zzf());
    }

    private static String zzb(Context object) {
        Object[] objectArray;
        PackageManagerWrapper packageManagerWrapper;
        try {
            packageManagerWrapper = Wrappers.packageManager(object);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = object.getPackageName();
            objectArray = new Object[]{object};
            L.e(nameNotFoundException, "Unable to find calling package info for %s", objectArray);
            return null;
        }
        objectArray = object.getPackageName();
        packageManagerWrapper = packageManagerWrapper.getPackageInfo((String)objectArray, 0);
        return ((PackageInfo)packageManagerWrapper).versionName;
    }
}

