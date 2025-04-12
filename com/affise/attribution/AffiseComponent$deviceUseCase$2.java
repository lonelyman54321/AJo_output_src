/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.usecase.DeviceUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$deviceUseCase$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$deviceUseCase$2 INSTANCE;

    static {
        AffiseComponent$deviceUseCase$2 affiseComponent$deviceUseCase$2;
        INSTANCE = affiseComponent$deviceUseCase$2 = new AffiseComponent$deviceUseCase$2();
    }

    public AffiseComponent$deviceUseCase$2() {
        super(0);
    }

    public final DeviceUseCaseImpl invoke() {
        DeviceUseCaseImpl deviceUseCaseImpl = new DeviceUseCaseImpl();
        return deviceUseCaseImpl;
    }
}

