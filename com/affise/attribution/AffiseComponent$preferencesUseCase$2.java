/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.affise.attribution;

import android.content.SharedPreferences;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.preferences.ApplicationLifecyclePreferencesRepositoryImpl;
import com.affise.attribution.preferences.ApplicationLifetimePreferencesRepositoryImpl;
import com.affise.attribution.usecase.PreferencesUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$preferencesUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$preferencesUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final PreferencesUseCaseImpl invoke() {
        ApplicationLifecyclePreferencesRepositoryImpl applicationLifecyclePreferencesRepositoryImpl = new ApplicationLifecyclePreferencesRepositoryImpl();
        SharedPreferences sharedPreferences2 = this.this$0.getSharedPreferences();
        ApplicationLifetimePreferencesRepositoryImpl applicationLifetimePreferencesRepositoryImpl = new ApplicationLifetimePreferencesRepositoryImpl(sharedPreferences2);
        PreferencesUseCaseImpl preferencesUseCaseImpl = new PreferencesUseCaseImpl(applicationLifecyclePreferencesRepositoryImpl, applicationLifetimePreferencesRepositoryImpl);
        return preferencesUseCaseImpl;
    }
}

