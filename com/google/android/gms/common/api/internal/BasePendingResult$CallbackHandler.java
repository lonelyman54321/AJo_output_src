/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  android.util.Pair
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;

public class BasePendingResult$CallbackHandler
extends zau {
    public BasePendingResult$CallbackHandler() {
        Looper looper = Looper.getMainLooper();
        super(looper);
    }

    public BasePendingResult$CallbackHandler(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message object) {
        int n3 = object.what;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                object = hj0_0.a(n3, "Don't know how to handle message: ");
                Exception exception = new Exception();
                Log.wtf((String)"BasePendingResult", (String)object, (Throwable)exception);
                return;
            }
            object = (BasePendingResult)object.obj;
            Status status = Status.RESULT_TIMEOUT;
            object.forceFailureUnlessReady(status);
            return;
        }
        object = (Pair)object.obj;
        ResultCallback resultCallback = (ResultCallback)object.first;
        object = (Result)object.second;
        try {
            resultCallback.onResult((Result)object);
            return;
        }
        catch (RuntimeException runtimeException) {
            BasePendingResult.zal((Result)object);
            throw runtimeException;
        }
    }

    public final void zaa(ResultCallback resultCallback, Result result2) {
        resultCallback = (ResultCallback)Preconditions.checkNotNull(resultCallback);
        Pair pair = new Pair((Object)resultCallback, (Object)result2);
        resultCallback = this.obtainMessage(1, pair);
        this.sendMessage((Message)resultCallback);
    }
}

