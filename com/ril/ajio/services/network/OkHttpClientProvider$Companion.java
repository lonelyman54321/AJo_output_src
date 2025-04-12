/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network;

import com.ril.ajio.services.network.OkHttpClientProvider;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OkHttpClientProvider$Companion {
    private OkHttpClientProvider$Companion() {
    }

    public /* synthetic */ OkHttpClientProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final OkHttpClientProvider getInstance() {
        // MONITORENTER : this
        Object object = OkHttpClientProvider.access$getOkHttpClientProvider$cp();
        if (object == null) {
            object = new OkHttpClientProvider();
            OkHttpClientProvider.access$setOkHttpClientProvider$cp((OkHttpClientProvider)object);
        }
        object = Unit.a;
        // MONITOREXIT : this
        object = OkHttpClientProvider.access$getOkHttpClientProvider$cp();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.network.OkHttpClientProvider");
        return object;
    }
}

