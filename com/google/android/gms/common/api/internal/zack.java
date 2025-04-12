/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods$Builder;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zack
extends RegisterListenerMethod {
    final /* synthetic */ RegistrationMethods$Builder zaa;

    public zack(RegistrationMethods$Builder registrationMethods$Builder, ListenerHolder listenerHolder, Feature[] featureArray, boolean bl2, int n3) {
        this.zaa = registrationMethods$Builder;
        super(listenerHolder, featureArray, bl2, n3);
    }

    public final void registerListener(Api$AnyClient api$AnyClient, TaskCompletionSource taskCompletionSource) {
        RegistrationMethods$Builder.zaa(this.zaa).accept(api$AnyClient, taskCompletionSource);
    }
}

