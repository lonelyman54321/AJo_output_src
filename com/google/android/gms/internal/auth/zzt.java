/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzi;
import com.google.android.gms.internal.auth.zzp;
import com.google.android.gms.internal.auth.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzt
implements RemoteCall {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ zzbw zzb;

    public /* synthetic */ zzt(zzab zzab2, zzbw zzbw2) {
        this.zza = zzab2;
        this.zzb = zzbw2;
    }

    public final void accept(Object object, Object object2) {
        zzab zzab2 = this.zza;
        zzbw zzbw2 = this.zzb;
        object = (zzi)object;
        object2 = (TaskCompletionSource)object2;
        object = (zzp)((BaseGmsClient)object).getService();
        zzx zzx2 = new zzx(zzab2, (TaskCompletionSource)object2);
        ((zzp)object).zzd(zzx2, zzbw2);
    }
}

