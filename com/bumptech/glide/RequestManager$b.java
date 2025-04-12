/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.a$a;

public final class RequestManager$b
implements a$a {
    public final iK2 a;
    public final /* synthetic */ RequestManager b;

    public RequestManager$b(RequestManager requestManager, iK2 iK22) {
        this.b = requestManager;
        this.a = iK22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl2) {
        if (!bl2) return;
        RequestManager requestManager = this.b;
        synchronized (requestManager) {
            iK2 iK22 = this.a;
            iK22.b();
            return;
        }
    }
}

