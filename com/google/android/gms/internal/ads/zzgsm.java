/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghw;
import com.google.android.gms.internal.ads.zzgoy;
import com.google.android.gms.internal.ads.zzgpg;
import com.google.android.gms.internal.ads.zzgqk;
import com.google.android.gms.internal.ads.zzgsl;
import com.google.android.gms.internal.ads.zzgtl;
import com.google.android.gms.internal.ads.zzgtr;

final class zzgsm
implements zzghw {
    private final zzgqk zza;
    private final zzgtl zzb;
    private final zzgtl zzc;

    /*
     * Enabled aggressive block sorting
     */
    public /* synthetic */ zzgsm(zzgqk object, zzgsl object2) {
        this.zza = object;
        boolean bl2 = ((zzgqk)object).zzg();
        if (bl2) {
            object2 = zzgpg.zza().zzb();
            object = zzgoy.zza((zzgqk)object);
            String string2 = "mac";
            Object object3 = object2.zza((zzgtr)object, string2, "compute");
            this.zzb = object3;
            object3 = "verify";
            object = object2.zza((zzgtr)object, string2, (String)object3);
        } else {
            this.zzb = object = zzgoy.zza;
        }
        this.zzc = object;
    }
}

