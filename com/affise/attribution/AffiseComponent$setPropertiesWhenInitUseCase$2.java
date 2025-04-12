/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.init.SetPropertiesWhenAppInitializedUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$setPropertiesWhenInitUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$setPropertiesWhenInitUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final SetPropertiesWhenAppInitializedUseCaseImpl invoke() {
        InitPropertiesStorage initPropertiesStorage = this.this$0.getInitPropertiesStorage();
        SetPropertiesWhenAppInitializedUseCaseImpl setPropertiesWhenAppInitializedUseCaseImpl = new SetPropertiesWhenAppInitializedUseCaseImpl(initPropertiesStorage);
        return setPropertiesWhenAppInitializedUseCaseImpl;
    }
}

