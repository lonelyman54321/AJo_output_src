/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zacx;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class TaskUtil {
    public static void setResultOrApiException(Status status, TaskCompletionSource taskCompletionSource) {
        TaskUtil.setResultOrApiException(status, null, taskCompletionSource);
    }

    public static void setResultOrApiException(Status object, Object object2, TaskCompletionSource taskCompletionSource) {
        boolean bl2 = ((Status)object).isSuccess();
        if (bl2) {
            taskCompletionSource.setResult(object2);
            return;
        }
        object = ApiExceptionUtil.fromStatus((Status)object);
        taskCompletionSource.setException((Exception)object);
    }

    public static Task toVoidTaskThatFailsOnFalse(Task task2) {
        zacx zacx2 = new zacx();
        return task2.continueWith(zacx2);
    }

    public static boolean trySetResultOrApiException(Status object, Object object2, TaskCompletionSource taskCompletionSource) {
        boolean bl2 = ((Status)object).isSuccess();
        if (bl2) {
            return taskCompletionSource.trySetResult(object2);
        }
        object = ApiExceptionUtil.fromStatus((Status)object);
        return taskCompletionSource.trySetException((Exception)object);
    }
}

