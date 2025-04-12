/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.internal.PendingResultUtil$ResultConverter;
import com.google.android.gms.common.internal.zao;
import com.google.android.gms.common.internal.zap;
import com.google.android.gms.common.internal.zaq;
import com.google.android.gms.common.internal.zar;
import com.google.android.gms.common.internal.zas;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class PendingResultUtil {
    private static final zas zaa;

    static {
        zao zao2 = new zao();
        zaa = zao2;
    }

    public static Task toResponseTask(PendingResult pendingResult, Response response) {
        zaq zaq2 = new zaq(response);
        return PendingResultUtil.toTask(pendingResult, zaq2);
    }

    public static Task toTask(PendingResult pendingResult, PendingResultUtil$ResultConverter pendingResultUtil$ResultConverter) {
        zas zas2 = zaa;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zap zap2 = new zap(pendingResult, taskCompletionSource, pendingResultUtil$ResultConverter, zas2);
        pendingResult.addStatusListener(zap2);
        return taskCompletionSource.getTask();
    }

    public static Task toVoidTask(PendingResult pendingResult) {
        zar zar2 = new zar();
        return PendingResultUtil.toTask(pendingResult, zar2);
    }
}

