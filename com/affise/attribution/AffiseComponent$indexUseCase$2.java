/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.affise.attribution;

import android.content.SharedPreferences;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.usecase.IndexUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$indexUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$indexUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final IndexUseCaseImpl invoke() {
        SharedPreferences sharedPreferences2 = this.this$0.getSharedPreferences();
        IndexUseCaseImpl indexUseCaseImpl = new IndexUseCaseImpl(sharedPreferences2);
        return indexUseCaseImpl;
    }
}

