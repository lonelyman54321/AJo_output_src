/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final class zzbd
implements OnCompleteListener {
    private final /* synthetic */ BaseImplementation$ResultHolder zza;

    public /* synthetic */ zzbd(BaseImplementation$ResultHolder baseImplementation$ResultHolder) {
        this.zza = baseImplementation$ResultHolder;
    }

    public final /* synthetic */ void onComplete(Task object) {
        BaseImplementation$ResultHolder baseImplementation$ResultHolder = this.zza;
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            object = Status.RESULT_SUCCESS;
            baseImplementation$ResultHolder.setResult(object);
            return;
        }
        bl2 = ((Task)object).isCanceled();
        if (bl2) {
            object = Status.RESULT_CANCELED;
            baseImplementation$ResultHolder.setFailedResult((Status)object);
            return;
        }
        bl2 = (object = ((Task)object).getException()) instanceof ApiException;
        if (bl2) {
            object = ((ApiException)object).getStatus();
            baseImplementation$ResultHolder.setFailedResult((Status)object);
            return;
        }
        object = Status.RESULT_INTERNAL_ERROR;
        baseImplementation$ResultHolder.setFailedResult((Status)object);
    }
}

