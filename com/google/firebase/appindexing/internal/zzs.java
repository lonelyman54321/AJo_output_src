/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.icing.zzaa;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.appindexing.internal.zzaf;

abstract class zzs
extends TaskApiCall
implements BaseImplementation$ResultHolder {
    protected TaskCompletionSource zzb;

    public zzs() {
        super(null, false, 9004);
    }

    public final void setFailedResult(Status object) {
        boolean bl2 = ((Status)object).isSuccess() ^ true;
        Object object2 = "Failed result must not be success.";
        Preconditions.checkArgument(bl2, object2);
        String string2 = ((Status)object).getStatusMessage();
        if (string2 == null) {
            string2 = "";
        }
        object2 = this.zzb;
        object = zzaf.zza((Status)object, string2);
        ((TaskCompletionSource)object2).setException((Exception)object);
    }

    public abstract void zza(zzaa var1);
}

