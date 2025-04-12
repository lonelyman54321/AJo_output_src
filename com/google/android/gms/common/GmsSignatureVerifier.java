/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.zzaa;
import com.google.android.gms.common.zzl;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzy;
import com.google.android.gms.internal.common.zzak;
import java.util.HashMap;
import java.util.List;

public class GmsSignatureVerifier {
    private static final zzaa zza;
    private static final zzaa zzb;
    private static final HashMap zzc;

    static {
        HashMap hashMap = new HashMap();
        ((zzy)((Object)hashMap)).zzd("com.google.android.gms");
        ((zzy)((Object)hashMap)).zza(204200000L);
        Object object = zzn.zzd;
        Object object2 = ((zzl)object).zzf();
        Object object3 = zzn.zzb.zzf();
        object2 = zzak.zzn(object2, object3);
        ((zzy)((Object)hashMap)).zzc((List)object2);
        object2 = zzn.zzc;
        object3 = ((zzl)object2).zzf();
        byte[] byArray = zzn.zza.zzf();
        object3 = zzak.zzn(object3, byArray);
        ((zzy)((Object)hashMap)).zzb((List)object3);
        zza = ((zzy)((Object)hashMap)).zze();
        hashMap = new HashMap();
        ((zzy)((Object)hashMap)).zzd("com.android.vending");
        ((zzy)((Object)hashMap)).zza(82240000L);
        object = zzak.zzm(((zzl)object).zzf());
        ((zzy)((Object)hashMap)).zzc((List)object);
        object = zzak.zzm(((zzl)object2).zzf());
        ((zzy)((Object)hashMap)).zzb((List)object);
        zzb = ((zzy)((Object)hashMap)).zze();
        zzc = hashMap = new HashMap();
    }
}

