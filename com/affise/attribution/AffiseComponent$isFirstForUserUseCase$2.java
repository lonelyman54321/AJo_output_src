/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.events.IsFirstForUserUseCaseImpl;
import com.affise.attribution.storages.IsFirstForUserStorage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$isFirstForUserUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$isFirstForUserUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final IsFirstForUserUseCaseImpl invoke() {
        IsFirstForUserStorage isFirstForUserStorage2 = AffiseComponent.access$isFirstForUserStorage(this.this$0);
        IsFirstForUserUseCaseImpl isFirstForUserUseCaseImpl = new IsFirstForUserUseCaseImpl(isFirstForUserStorage2);
        return isFirstForUserUseCaseImpl;
    }
}

