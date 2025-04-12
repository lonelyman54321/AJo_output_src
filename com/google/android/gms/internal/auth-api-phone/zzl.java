/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth-api-phone.zzh;
import com.google.android.gms.internal.auth-api-phone.zzq;
import com.google.android.gms.internal.auth-api-phone.zzr;
import com.google.android.gms.internal.auth-api-phone.zzw;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzl
implements RemoteCall {
    public final /* synthetic */ zzr zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzl(zzr zzr2, String string2) {
        this.zza = zzr2;
        this.zzb = string2;
    }

    public final void accept(Object object, Object object2) {
        object = (zzw)object;
        object2 = (TaskCompletionSource)object2;
        zzr zzr2 = this.zza;
        zzq zzq2 = new zzq(zzr2, (TaskCompletionSource)object2);
        object = (zzh)((BaseGmsClient)object).getService();
        object2 = this.zzb;
        ((zzh)object).zzd((String)object2, zzq2);
    }
}

