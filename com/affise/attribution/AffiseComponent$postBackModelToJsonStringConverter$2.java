/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.PostBackModelToJsonStringConverter;
import com.affise.attribution.usecase.IndexUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$postBackModelToJsonStringConverter$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$postBackModelToJsonStringConverter$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final PostBackModelToJsonStringConverter invoke() {
        IndexUseCase indexUseCase2 = AffiseComponent.access$getIndexUseCase(this.this$0);
        PostBackModelToJsonStringConverter postBackModelToJsonStringConverter2 = new PostBackModelToJsonStringConverter(indexUseCase2);
        return postBackModelToJsonStringConverter2;
    }
}

