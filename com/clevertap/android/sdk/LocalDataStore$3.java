/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.b;

class LocalDataStore$3
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ LocalDataStore c;

    public LocalDataStore$3(LocalDataStore localDataStore, String string2, Runnable runnable2) {
        this.c = localDataStore;
        this.a = string2;
        this.b = runnable2;
    }

    public final void run() {
        long l2;
        Object object = this.c;
        Object object2 = "Local Data Store Executor service: Starting task - ";
        Object object3 = Thread.currentThread();
        LocalDataStore.j = l2 = ((Thread)object3).getId();
        object3 = ((LocalDataStore)object).b;
        object3 = ((CleverTapInstanceConfig)object3).b();
        Object object4 = ((LocalDataStore)object).b;
        object4 = ((CleverTapInstanceConfig)object4).a;
        StringBuilder stringBuilder = new StringBuilder((String)object2);
        object2 = this.a;
        stringBuilder.append((String)object2);
        object2 = stringBuilder.toString();
        ((b)object3).b((String)object4, (String)object2);
        object2 = this.b;
        try {
            object2.run();
        }
        catch (Throwable throwable) {
            object2 = ((LocalDataStore)object).b.b();
            object = ((LocalDataStore)object).b.a;
            object2.getClass();
            com.clevertap.android.sdk.b.m();
        }
    }
}

