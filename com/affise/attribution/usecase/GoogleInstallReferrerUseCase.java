/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.net.Uri
 */
package com.affise.attribution.usecase;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.StringToAffiseReferrerDataConverter;
import com.affise.attribution.deeplink.DeeplinkManager;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.modules.store.StoreApi;
import com.affise.attribution.referrer.AffiseReferrerData;
import com.affise.attribution.referrer.AffiseReferrerDataToStringConverter;
import com.affise.attribution.usecase.GoogleInstallReferrerUseCase$Companion;
import com.affise.attribution.usecase.GoogleInstallReferrerUseCase$startInstallReferrerRetrieve$1;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class GoogleInstallReferrerUseCase
implements StoreApi {
    public static final GoogleInstallReferrerUseCase$Companion Companion;
    private static final String DELAYED_DEEPLINK_PROCESSED_KEY = "DELAYED_DEEPLINK_PROCESSED_KEY";
    private static final String REFERRER_KEY = "referrer_data";
    private final Application app;
    private final DeeplinkManager deeplinkManager;
    private final Converter installReferrerToDeeplinkUriConverter;
    private final LogsManager logsManager;
    private final SharedPreferences preferences;
    private InstallReferrerClient referrerClient;
    private final StringToAffiseReferrerDataConverter toAffiseReferrerDataConverter;
    private final AffiseReferrerDataToStringConverter toStringConverter;

    static {
        GoogleInstallReferrerUseCase$Companion googleInstallReferrerUseCase$Companion;
        Companion = googleInstallReferrerUseCase$Companion = new GoogleInstallReferrerUseCase$Companion(null);
    }

    public GoogleInstallReferrerUseCase(SharedPreferences sharedPreferences2, AffiseReferrerDataToStringConverter affiseReferrerDataToStringConverter, StringToAffiseReferrerDataConverter stringToAffiseReferrerDataConverter, Application application, DeeplinkManager deeplinkManager2, LogsManager logsManager2, Converter converter) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "preferences");
        Intrinsics.checkNotNullParameter(affiseReferrerDataToStringConverter, "toStringConverter");
        Intrinsics.checkNotNullParameter(stringToAffiseReferrerDataConverter, "toAffiseReferrerDataConverter");
        Intrinsics.checkNotNullParameter(application, "app");
        Intrinsics.checkNotNullParameter(deeplinkManager2, "deeplinkManager");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        Intrinsics.checkNotNullParameter(converter, "installReferrerToDeeplinkUriConverter");
        this.preferences = sharedPreferences2;
        this.toStringConverter = affiseReferrerDataToStringConverter;
        this.toAffiseReferrerDataConverter = stringToAffiseReferrerDataConverter;
        this.app = application;
        this.deeplinkManager = deeplinkManager2;
        this.logsManager = logsManager2;
        this.installReferrerToDeeplinkUriConverter = converter;
    }

    public static final /* synthetic */ LogsManager access$getLogsManager$p(GoogleInstallReferrerUseCase googleInstallReferrerUseCase2) {
        return googleInstallReferrerUseCase2.logsManager;
    }

    public static final /* synthetic */ InstallReferrerClient access$getReferrerClient$p(GoogleInstallReferrerUseCase googleInstallReferrerUseCase2) {
        return googleInstallReferrerUseCase2.referrerClient;
    }

    public static final /* synthetic */ void access$processReferrerDetails(GoogleInstallReferrerUseCase googleInstallReferrerUseCase2, ReferrerDetails referrerDetails) {
        googleInstallReferrerUseCase2.processReferrerDetails(referrerDetails);
    }

    private final boolean isDelayedDeeplinkProcessed() {
        return this.preferences.getBoolean(DELAYED_DEEPLINK_PROCESSED_KEY, false);
    }

    private final void processReferrerDetails(ReferrerDetails object) {
        Object object2;
        Object object3;
        boolean bl2 = this.isDelayedDeeplinkProcessed();
        if (!bl2) {
            object3 = ((ReferrerDetails)object).getInstallReferrer();
            if (object3 != null && (object3 = (Uri)(object2 = this.installReferrerToDeeplinkUriConverter).convert(object3)) != null) {
                object2 = this.deeplinkManager;
                object2.handleDeeplink((Uri)object3);
            }
            this.setDelayedDeeplinkProcessed();
        }
        object2 = ((ReferrerDetails)object).getInstallReferrer();
        Object object4 = "";
        Object object5 = object2 == null ? object4 : object2;
        long l2 = ((ReferrerDetails)object).getReferrerClickTimestampSeconds();
        long l3 = ((ReferrerDetails)object).getInstallBeginTimestampSeconds();
        long l4 = ((ReferrerDetails)object).getReferrerClickTimestampServerSeconds();
        long l7 = ((ReferrerDetails)object).getInstallBeginTimestampServerSeconds();
        object2 = ((ReferrerDetails)object).getInstallVersion();
        Object object6 = object2 == null ? object4 : object2;
        boolean bl3 = ((ReferrerDetails)object).getGooglePlayInstantParam();
        object4 = object3;
        object3 = new AffiseReferrerData((String)object5, l2, l3, l4, l7, (String)object6, bl3);
        object = this.toStringConverter.convert((AffiseReferrerData)object3);
        this.storeToSharedPreferences((String)object);
        object = this.referrerClient;
        if (object != null) {
            ((InstallReferrerClient)object).endConnection();
        }
    }

    private final void setDelayedDeeplinkProcessed() {
        SharedPreferences.Editor editor = this.preferences.edit();
        editor.putBoolean(DELAYED_DEEPLINK_PROCESSED_KEY, true);
        editor.commit();
    }

    private final void storeToSharedPreferences(String string2) {
        SharedPreferences.Editor editor = this.preferences.edit();
        editor.putString(REFERRER_KEY, string2);
        editor.commit();
    }

    public AffiseReferrerData getInstallReferrerData() {
        Object object = this.preferences;
        Object object2 = REFERRER_KEY;
        AffiseReferrerData affiseReferrerData = null;
        if ((object = object.getString((String)object2, null)) != null) {
            object2 = this.toAffiseReferrerDataConverter;
            affiseReferrerData = ((StringToAffiseReferrerDataConverter)object2).convert((String)object);
        }
        return affiseReferrerData;
    }

    public void startInstallReferrerRetrieve(Function0 function0) {
        InstallReferrerClient installReferrerClient;
        this.referrerClient = installReferrerClient = InstallReferrerClient.newBuilder((Context)this.app).build();
        if (installReferrerClient != null) {
            GoogleInstallReferrerUseCase$startInstallReferrerRetrieve$1 googleInstallReferrerUseCase$startInstallReferrerRetrieve$1 = new GoogleInstallReferrerUseCase$startInstallReferrerRetrieve$1(this, function0);
            installReferrerClient.startConnection(googleInstallReferrerUseCase$startInstallReferrerRetrieve$1);
        }
    }
}

