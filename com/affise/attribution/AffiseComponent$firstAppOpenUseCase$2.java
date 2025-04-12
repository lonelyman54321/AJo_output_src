/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.affise.attribution;

import android.content.SharedPreferences;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$firstAppOpenUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$firstAppOpenUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final FirstAppOpenUseCase invoke() {
        SharedPreferences sharedPreferences2 = this.this$0.getSharedPreferences();
        CurrentActiveActivityCountProvider currentActiveActivityCountProvider = AffiseComponent.access$getActivityCountProvider(this.this$0);
        FirstAppOpenUseCase firstAppOpenUseCase2 = new FirstAppOpenUseCase(sharedPreferences2, currentActiveActivityCountProvider);
        return firstAppOpenUseCase2;
    }
}

