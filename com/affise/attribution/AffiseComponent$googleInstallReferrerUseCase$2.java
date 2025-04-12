/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.SharedPreferences
 */
package com.affise.attribution;

import android.app.Application;
import android.content.SharedPreferences;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.StringToAffiseReferrerDataConverter;
import com.affise.attribution.deeplink.DeeplinkManagerImpl;
import com.affise.attribution.deeplink.InstallReferrerToDeeplinkUriConverter;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.referrer.AffiseReferrerDataToStringConverter;
import com.affise.attribution.usecase.GoogleInstallReferrerUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$googleInstallReferrerUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$googleInstallReferrerUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final GoogleInstallReferrerUseCase invoke() {
        GoogleInstallReferrerUseCase googleInstallReferrerUseCase2;
        SharedPreferences sharedPreferences2 = this.this$0.getSharedPreferences();
        AffiseReferrerDataToStringConverter affiseReferrerDataToStringConverter = new AffiseReferrerDataToStringConverter();
        Object object = this.this$0.getLogsManager();
        StringToAffiseReferrerDataConverter stringToAffiseReferrerDataConverter = new StringToAffiseReferrerDataConverter((LogsManager)object);
        Application application = AffiseComponent.access$getApp$p(this.this$0);
        DeeplinkManagerImpl deeplinkManagerImpl = this.this$0.getDeeplinkManager();
        LogsManager logsManager2 = this.this$0.getLogsManager();
        InstallReferrerToDeeplinkUriConverter installReferrerToDeeplinkUriConverter = new InstallReferrerToDeeplinkUriConverter();
        object = googleInstallReferrerUseCase2;
        googleInstallReferrerUseCase2 = new GoogleInstallReferrerUseCase(sharedPreferences2, affiseReferrerDataToStringConverter, stringToAffiseReferrerDataConverter, application, deeplinkManagerImpl, logsManager2, installReferrerToDeeplinkUriConverter);
        return googleInstallReferrerUseCase2;
    }
}

