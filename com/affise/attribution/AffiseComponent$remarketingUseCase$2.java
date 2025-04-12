/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.usecase.RemarketingUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$remarketingUseCase$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$remarketingUseCase$2 INSTANCE;

    static {
        AffiseComponent$remarketingUseCase$2 affiseComponent$remarketingUseCase$2;
        INSTANCE = affiseComponent$remarketingUseCase$2 = new AffiseComponent$remarketingUseCase$2();
    }

    public AffiseComponent$remarketingUseCase$2() {
        super(0);
    }

    public final RemarketingUseCaseImpl invoke() {
        RemarketingUseCaseImpl remarketingUseCaseImpl = new RemarketingUseCaseImpl();
        return remarketingUseCaseImpl;
    }
}

