/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzh;
import com.google.android.gms.measurement.internal.zzhm;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class zzhp
implements Callable {
    private /* synthetic */ zzhm zza;
    private /* synthetic */ String zzb;

    public /* synthetic */ zzhp(zzhm zzhm2, String string2) {
        this.zza = zzhm2;
        this.zzb = string2;
    }

    public final Object call() {
        Object object = this.zza;
        Object object2 = this.zzb;
        object = ((zzhm)object).zzh().zzd((String)object2);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        String string2 = "android";
        hashMap.put("platform", string2);
        hashMap.put("package_name", object2);
        long l2 = 114010L;
        object2 = l2;
        String string3 = "gmp_version";
        hashMap.put(string3, object2);
        if (object != null) {
            object2 = ((zzh)object).zzaf();
            if (object2 != null) {
                string3 = "app_version";
                hashMap.put(string3, object2);
            }
            l2 = ((zzh)object).zze();
            object2 = l2;
            string3 = "app_version_int";
            hashMap.put(string3, object2);
            long l3 = ((zzh)object).zzo();
            object = l3;
            object2 = "dynamite_version";
            hashMap.put(object2, object);
        }
        return hashMap;
    }
}

