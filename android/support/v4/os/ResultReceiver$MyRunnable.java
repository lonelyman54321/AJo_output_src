/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package android.support.v4.os;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

class ResultReceiver$MyRunnable
implements Runnable {
    final int mResultCode;
    final Bundle mResultData;
    final /* synthetic */ ResultReceiver this$0;

    public ResultReceiver$MyRunnable(ResultReceiver resultReceiver, int n3, Bundle bundle) {
        this.this$0 = resultReceiver;
        this.mResultCode = n3;
        this.mResultData = bundle;
    }

    public void run() {
        ResultReceiver resultReceiver = this.this$0;
        int n3 = this.mResultCode;
        Bundle bundle = this.mResultData;
        resultReceiver.onReceiveResult(n3, bundle);
    }
}

