/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Completer;

class DelegatingScheduledFuture$1
implements DelegatingScheduledFuture$Completer {
    final /* synthetic */ DelegatingScheduledFuture this$0;

    public DelegatingScheduledFuture$1(DelegatingScheduledFuture delegatingScheduledFuture) {
        this.this$0 = delegatingScheduledFuture;
    }

    public void set(Object object) {
        DelegatingScheduledFuture.access$000(this.this$0, object);
    }

    public void setException(Throwable throwable) {
        DelegatingScheduledFuture.access$100(this.this$0, throwable);
    }
}

