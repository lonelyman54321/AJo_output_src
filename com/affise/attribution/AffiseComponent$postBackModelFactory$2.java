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
import com.affise.attribution.build.BuildConfigPropertiesProvider;
import com.affise.attribution.converter.StringToMD5Converter;
import com.affise.attribution.converter.StringToSHA256Converter;
import com.affise.attribution.deeplink.DeeplinkClickRepository;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.parameters.base.PropertiesProviderFactory;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.session.SessionManager;
import com.affise.attribution.usecase.DeviceUseCase;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import com.affise.attribution.usecase.RemarketingUseCase;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import com.affise.attribution.usecase.StoreUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$postBackModelFactory$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$postBackModelFactory$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final PostBackModelFactory invoke() {
        BuildConfigPropertiesProvider buildConfigPropertiesProvider2 = AffiseComponent.access$getBuildConfigPropertiesProvider(this.this$0);
        Application application = AffiseComponent.access$getApp$p(this.this$0);
        FirstAppOpenUseCase firstAppOpenUseCase2 = this.this$0.getFirstAppOpenUseCase();
        StoreInstallReferrerUseCase storeInstallReferrerUseCase2 = this.this$0.getStoreInstallReferrerUseCase();
        SessionManager sessionManager2 = this.this$0.getSessionManager();
        SharedPreferences sharedPreferences2 = this.this$0.getSharedPreferences();
        InitPropertiesStorage initPropertiesStorage = this.this$0.getInitPropertiesStorage();
        StringToMD5Converter stringToMD5Converter2 = AffiseComponent.access$getStringToMD5Converter(this.this$0);
        StringToSHA256Converter stringToSHA256Converter2 = AffiseComponent.access$getStringToSHA256Converter(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        DeeplinkClickRepository deeplinkClickRepository = AffiseComponent.access$isDeeplinkClickRepository$p(this.this$0);
        DeviceUseCase deviceUseCase2 = AffiseComponent.access$getDeviceUseCase(this.this$0);
        RemarketingUseCase remarketingUseCase2 = AffiseComponent.access$getRemarketingUseCase(this.this$0);
        StoreUseCase storeUseCase2 = AffiseComponent.access$getStoreUseCase(this.this$0);
        PropertiesProviderFactory propertiesProviderFactory = new PropertiesProviderFactory(buildConfigPropertiesProvider2, application, firstAppOpenUseCase2, storeInstallReferrerUseCase2, sessionManager2, sharedPreferences2, initPropertiesStorage, stringToMD5Converter2, stringToSHA256Converter2, logsManager2, deeplinkClickRepository, deviceUseCase2, remarketingUseCase2, storeUseCase2);
        return propertiesProviderFactory.create();
    }
}

