/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth-api-phone.zzaa;
import com.google.android.gms.internal.auth-api-phone.zzab;
import com.google.android.gms.internal.auth-api-phone.zzh;
import com.google.android.gms.internal.auth-api-phone.zzw;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzy
implements RemoteCall {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzy(zzab zzab2, String string2) {
        this.zza = zzab2;
        this.zzb = string2;
    }

    public final void accept(Object object, Object object2) {
        object = (zzw)object;
        object2 = (TaskCompletionSource)object2;
        object = (zzh)((BaseGmsClient)object).getService();
        zzab zzab2 = this.zza;
        zzaa zzaa2 = new zzaa(zzab2, (TaskCompletionSource)object2);
        object2 = this.zzb;
        ((zzh)object).zzh((String)object2, zzaa2);
    }
}

