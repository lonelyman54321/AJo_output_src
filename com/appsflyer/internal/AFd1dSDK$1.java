/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class AFd1dSDK$1
extends Lambda
implements Function1 {
    public static final AFd1dSDK$1 getMediationNetwork;

    static {
        AFd1dSDK$1 aFd1dSDK$1;
        getMediationNetwork = aFd1dSDK$1 = new AFd1dSDK$1();
    }

    public AFd1dSDK$1() {
        super(1);
    }

    public final CharSequence getMediationNetwork(StackTraceElement stackTraceElement) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "");
        StringBuilder stringBuilder = new StringBuilder("at ");
        stringBuilder.append(stackTraceElement);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object invoke(Object object) {
        object = (StackTraceElement)object;
        return this.getMediationNetwork((StackTraceElement)object);
    }
}

