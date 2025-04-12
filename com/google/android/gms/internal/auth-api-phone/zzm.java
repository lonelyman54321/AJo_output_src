/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth-api-phone.zzh;
import com.google.android.gms.internal.auth-api-phone.zzo;
import com.google.android.gms.internal.auth-api-phone.zzr;
import com.google.android.gms.internal.auth-api-phone.zzw;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzm
implements RemoteCall {
    public final /* synthetic */ zzr zza;

    public /* synthetic */ zzm(zzr zzr2) {
        this.zza = zzr2;
    }

    public final void accept(Object object, Object object2) {
        object = (zzw)object;
        object2 = (TaskCompletionSource)object2;
        zzr zzr2 = this.zza;
        zzo zzo2 = new zzo(zzr2, (TaskCompletionSource)object2);
        ((zzh)((BaseGmsClient)object).getService()).zze(zzo2);
    }
}

