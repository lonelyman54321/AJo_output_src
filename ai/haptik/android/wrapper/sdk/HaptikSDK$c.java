/*
 * Decompiled with CFR 0.152.
 */
package ai.haptik.android.wrapper.sdk;

import ai.haptik.android.wrapper.sdk.model.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class HaptikSDK$c
extends Lambda
implements Function1 {
    public static final HaptikSDK$c c;

    static {
        HaptikSDK$c haptikSDK$c;
        c = haptikSDK$c = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter((Response)object, "it");
        return Unit.a;
    }
}

