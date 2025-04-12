/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.RegistrationMethods$Builder;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zacl
extends UnregisterListenerMethod {
    final /* synthetic */ RegistrationMethods$Builder zaa;

    public zacl(RegistrationMethods$Builder registrationMethods$Builder, ListenerHolder$ListenerKey listenerHolder$ListenerKey) {
        this.zaa = registrationMethods$Builder;
        super(listenerHolder$ListenerKey);
    }

    public final void unregisterListener(Api$AnyClient api$AnyClient, TaskCompletionSource taskCompletionSource) {
        RegistrationMethods$Builder.zab(this.zaa).accept(api$AnyClient, taskCompletionSource);
    }
}

