/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzcot;
import java.util.Map;

public final class zzcpj
implements zzcot {
    private final Context zza;
    private final zzg zzb;

    public zzcpj(Context context) {
        zzg zzg2;
        this.zzb = zzg2 = zzu.zzo().zzi();
        this.zza = context;
    }

    public final void zza(Map object) {
        Object object2;
        boolean bl2 = object.isEmpty();
        if (!bl2 && (object = (String)object.get(object2 = "gad_idless")) != null) {
            object2 = this.zzb;
            boolean bl3 = Boolean.parseBoolean((String)object);
            object2.zzI(bl3);
            if (bl3) {
                object = this.zza;
                zzad.zzc((Context)object);
            }
        }
    }
}

