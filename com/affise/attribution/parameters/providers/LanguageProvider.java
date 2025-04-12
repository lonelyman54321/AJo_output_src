/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.usecase.RemarketingUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class LanguageProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final RemarketingUseCase useCase;

    public LanguageProvider(RemarketingUseCase object) {
        Intrinsics.checkNotNullParameter(object, "useCase");
        this.useCase = object;
        this.order = 40.0f;
        object = ProviderType.LANGUAGE;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return this.useCase.locale();
    }
}

