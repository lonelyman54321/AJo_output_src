/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$State;

class ClosingFuture$9
implements Runnable {
    final /* synthetic */ ClosingFuture this$0;

    public ClosingFuture$9(ClosingFuture closingFuture) {
        this.this$0 = closingFuture;
    }

    public void run() {
        ClosingFuture closingFuture = this.this$0;
        ClosingFuture$State closingFuture$State = ClosingFuture$State.WILL_CLOSE;
        ClosingFuture$State closingFuture$State2 = ClosingFuture$State.CLOSING;
        ClosingFuture.access$1100(closingFuture, closingFuture$State, closingFuture$State2);
        ClosingFuture.access$100(this.this$0);
        closingFuture = this.this$0;
        closingFuture$State = ClosingFuture$State.CLOSED;
        ClosingFuture.access$1100(closingFuture, closingFuture$State2, closingFuture$State);
    }
}

