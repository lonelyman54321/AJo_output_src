/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.Metadata;
import com.google.firebase.messaging.TopicsSubscriber;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

public final class m
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ScheduledExecutorService b;
    public final /* synthetic */ FirebaseMessaging c;
    public final /* synthetic */ Metadata d;
    public final /* synthetic */ GmsRpc e;

    public /* synthetic */ m(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = firebaseMessaging;
        this.d = metadata;
        this.e = gmsRpc;
    }

    public final Object call() {
        Metadata metadata = this.d;
        GmsRpc gmsRpc = this.e;
        Context context = this.a;
        ScheduledExecutorService scheduledExecutorService = this.b;
        FirebaseMessaging firebaseMessaging = this.c;
        return TopicsSubscriber.a(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
    }
}

