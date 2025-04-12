/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.auth.zzbh;
import com.google.android.gms.internal.auth.zzbn;
import com.google.android.gms.internal.auth.zzbo;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzbk
implements RemoteCall {
    public final /* synthetic */ zzbo zza;

    public /* synthetic */ zzbk(zzbo zzbo2) {
        this.zza = zzbo2;
    }

    public final void accept(Object object, Object object2) {
        zzbo zzbo2 = this.zza;
        object = (zzbe)object;
        object2 = (TaskCompletionSource)object2;
        zzbn zzbn2 = new zzbn(zzbo2, (TaskCompletionSource)object2);
        ((zzbh)((BaseGmsClient)object).getService()).zzd(zzbn2);
    }
}

