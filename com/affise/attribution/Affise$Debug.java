/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.Affise;
import com.affise.attribution.debug.network.DebugOnNetworkCallback;
import com.affise.attribution.debug.validate.DebugOnValidateCallback;
import kotlin.jvm.internal.Intrinsics;

public final class Affise$Debug {
    public static final Affise$Debug INSTANCE;

    static {
        Affise$Debug affise$Debug;
        INSTANCE = affise$Debug = new Affise$Debug();
    }

    private Affise$Debug() {
    }

    public static final void network(DebugOnNetworkCallback debugOnNetworkCallback) {
        Intrinsics.checkNotNullParameter(debugOnNetworkCallback, "callback");
        Object object = Affise.access$getApi$p();
        if (object != null && (object = object.getDebugNetworkUseCase()) != null) {
            object.onRequest(debugOnNetworkCallback);
        }
    }

    public static final void validate(DebugOnValidateCallback debugOnValidateCallback) {
        Intrinsics.checkNotNullParameter(debugOnValidateCallback, "callback");
        Object object = Affise.access$getApi$p();
        if (object != null && (object = object.getDebugValidateUseCase()) != null) {
            object.validate(debugOnValidateCallback);
        }
    }
}

