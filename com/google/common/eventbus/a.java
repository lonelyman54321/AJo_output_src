/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.eventbus;

import com.google.common.eventbus.Subscriber;

public final class a
implements Runnable {
    public final /* synthetic */ Subscriber a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object object, Subscriber subscriber) {
        this.a = subscriber;
        this.b = object;
    }

    public final void run() {
        Subscriber subscriber = this.a;
        Subscriber.a(this.b, subscriber);
    }
}

