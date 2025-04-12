/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicReference;

public final class zak
implements SuccessContinuation {
    public final /* synthetic */ AtomicReference zaa;

    public /* synthetic */ zak(AtomicReference atomicReference) {
        this.zaa = atomicReference;
    }

    public final Task then(Object object) {
        object = (Void)object;
        object = this.zaa;
        Object object2 = ((AtomicReference)object).get();
        if (object2 != null) {
            object = Tasks.forResult((ModuleInstallResponse)((AtomicReference)object).get());
        } else {
            object2 = Status.RESULT_INTERNAL_ERROR;
            object = new ApiException((Status)object2);
            object = Tasks.forException((Exception)object);
        }
        return object;
    }
}

