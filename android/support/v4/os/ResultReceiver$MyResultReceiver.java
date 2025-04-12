/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 */
package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.os.IResultReceiver$Stub;
import android.support.v4.os.ResultReceiver;
import android.support.v4.os.ResultReceiver$MyRunnable;

class ResultReceiver$MyResultReceiver
extends IResultReceiver$Stub {
    final /* synthetic */ ResultReceiver this$0;

    public ResultReceiver$MyResultReceiver(ResultReceiver resultReceiver) {
        this.this$0 = resultReceiver;
    }

    public void send(int n3, Bundle bundle) {
        ResultReceiver resultReceiver = this.this$0;
        Handler handler = resultReceiver.mHandler;
        if (handler != null) {
            ResultReceiver$MyRunnable resultReceiver$MyRunnable = new ResultReceiver$MyRunnable(resultReceiver, n3, bundle);
            handler.post((Runnable)resultReceiver$MyRunnable);
        } else {
            resultReceiver.onReceiveResult(n3, bundle);
        }
    }
}

