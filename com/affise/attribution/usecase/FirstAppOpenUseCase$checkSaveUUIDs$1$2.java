/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.utils.UUIDKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class FirstAppOpenUseCase$checkSaveUUIDs$1$2
extends Lambda
implements Function0 {
    public static final FirstAppOpenUseCase$checkSaveUUIDs$1$2 INSTANCE;

    static {
        FirstAppOpenUseCase$checkSaveUUIDs$1$2 firstAppOpenUseCase$checkSaveUUIDs$1$2;
        INSTANCE = firstAppOpenUseCase$checkSaveUUIDs$1$2 = new FirstAppOpenUseCase$checkSaveUUIDs$1$2();
    }

    public FirstAppOpenUseCase$checkSaveUUIDs$1$2() {
        super(0);
    }

    public final String invoke() {
        String string2 = UUIDKt.generateUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "generateUUID().toString()");
        return string2;
    }
}

