/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdey;
import com.google.android.gms.internal.ads.zzfky;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflu;

public final class zzflo
implements zzdey {
    public final /* synthetic */ zzfky zza;
    public final /* synthetic */ Throwable zzb;

    public /* synthetic */ zzflo(zzfky zzfky2, Throwable throwable) {
        this.zza = zzfky2;
        this.zzb = throwable;
    }

    public final void zza(Object object) {
        Object object2 = this.zza;
        object = (zzflu)object;
        Object object3 = ((zzfky)object2).zza();
        object2 = ((zzfky)object2).zzb();
        object3 = (zzfln)((Object)object3);
        Throwable throwable = this.zzb;
        object.zzdD((zzfln)((Object)object3), (String)object2, throwable);
    }
}

