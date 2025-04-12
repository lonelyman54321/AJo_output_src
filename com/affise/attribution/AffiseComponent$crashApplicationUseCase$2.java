/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.test.CrashApplicationUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$crashApplicationUseCase$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$crashApplicationUseCase$2 INSTANCE;

    static {
        AffiseComponent$crashApplicationUseCase$2 affiseComponent$crashApplicationUseCase$2;
        INSTANCE = affiseComponent$crashApplicationUseCase$2 = new AffiseComponent$crashApplicationUseCase$2();
    }

    public AffiseComponent$crashApplicationUseCase$2() {
        super(0);
    }

    public final CrashApplicationUseCaseImpl invoke() {
        CrashApplicationUseCaseImpl crashApplicationUseCaseImpl = new CrashApplicationUseCaseImpl();
        return crashApplicationUseCaseImpl;
    }
}

