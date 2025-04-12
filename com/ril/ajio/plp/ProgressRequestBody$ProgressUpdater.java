/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.plp;

import com.ril.ajio.plp.ProgressRequestBody;
import com.ril.ajio.plp.ProgressRequestBody$a;

class ProgressRequestBody$ProgressUpdater
implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ ProgressRequestBody c;

    public ProgressRequestBody$ProgressUpdater(ProgressRequestBody progressRequestBody, long l2, long l3) {
        this.c = progressRequestBody;
        this.a = l2;
        this.b = l3;
    }

    public final void run() {
        long l2 = this.a;
        float f5 = l2;
        long l3 = this.b;
        float f6 = l3;
        f5 = f5 / f6 * 100.0f;
        int n3 = (int)f5;
        int n4 = 100;
        f6 = 1.4E-43f;
        ProgressRequestBody progressRequestBody = this.c;
        if (n3 < n4) {
            ProgressRequestBody$a progressRequestBody$a = progressRequestBody.b;
            progressRequestBody$a.t7(n3);
        } else {
            ProgressRequestBody$a progressRequestBody$a = progressRequestBody.b;
            progressRequestBody$a.U();
        }
    }
}

