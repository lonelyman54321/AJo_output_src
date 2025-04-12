/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzgw;
import com.google.android.gms.internal.gtm.zzgx;
import com.google.android.gms.internal.gtm.zzgz;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhp;
import com.google.android.gms.internal.gtm.zzhy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzgr
implements zzgw {
    private static zzgr zza;
    private static final Object zzb;
    private static final Set zzc;
    private final zzgx zzd;
    private final zzhy zze;

    static {
        HashSet<String> hashSet = new HashSet<String>();
        zzb = hashSet;
        List<String> list = Arrays.asList("GET", "HEAD", "POST", "PUT");
        zzc = hashSet = new HashSet<String>(list);
    }

    private zzgr(Context object) {
        object = zzgz.zzd(object);
        zzhy zzhy2 = new zzhy();
        this.zzd = object;
        this.zze = zzhy2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzgw zza(Context object) {
        Object object2 = zzb;
        synchronized (object2) {
            try {
                zzgr zzgr2 = zza;
                if (zzgr2 != null) return zza;
                zza = zzgr2 = new zzgr((Context)object);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean zzb(String charSequence, String string2, String string3, Map map2, String string4) {
        Object object;
        boolean bl2;
        if (string2 != null && !(bl2 = (object = zzc).contains(string2))) {
            charSequence = new StringBuilder("Unsupport http method ");
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(". Drop the hit.");
            zzhi.zze(((StringBuilder)charSequence).toString());
            return false;
        }
        object = zzhp.zza();
        bl2 = ((zzhp)object).zzd();
        if (!bl2 && !(bl2 = ((zzhy)(object = this.zze)).zza())) {
            zzhi.zze("Too many hits sent too quickly (rate throttled).");
            return false;
        }
        this.zzd.zzb((String)charSequence, string2, string3, map2, string4);
        return true;
    }
}

