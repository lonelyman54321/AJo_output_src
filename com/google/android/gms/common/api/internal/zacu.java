/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zacu
implements RemoteCall {
    public final /* synthetic */ BiConsumer zaa;

    public /* synthetic */ zacu(BiConsumer biConsumer) {
        this.zaa = biConsumer;
    }

    public final void accept(Object object, Object object2) {
        BiConsumer biConsumer = this.zaa;
        object = (Api$AnyClient)object;
        object2 = (TaskCompletionSource)object2;
        biConsumer.accept(object, object2);
    }
}

