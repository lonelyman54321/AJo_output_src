/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide;

import com.bumptech.glide.RequestManager;

class RequestManager$1
implements Runnable {
    public final /* synthetic */ RequestManager a;

    public RequestManager$1(RequestManager requestManager) {
        this.a = requestManager;
    }

    public final void run() {
        RequestManager requestManager = this.a;
        requestManager.c.b(requestManager);
    }
}

