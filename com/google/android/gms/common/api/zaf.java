/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zaf
extends BasePendingResult {
    private final Result zae;

    public zaf(Result result2) {
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.zae = result2;
    }

    public final Result createFailedResult(Status object) {
        int n3;
        Result result2 = this.zae;
        int n4 = ((Status)object).getStatusCode();
        if (n4 == (n3 = ((Status)(result2 = result2.getStatus())).getStatusCode())) {
            return this.zae;
        }
        object = new UnsupportedOperationException("Creating failed results is not supported");
        throw object;
    }
}

