/*
 * Decompiled with CFR 0.152.
 */
package ai.haptik.android.wrapper.sdk;

import ai.haptik.android.wrapper.sdk.model.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class HaptikSDK$d
extends Lambda
implements Function1 {
    public static final HaptikSDK$d c;

    static {
        HaptikSDK$d haptikSDK$d;
        c = haptikSDK$d = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter((Response)object, "it");
        return Unit.a;
    }
}

